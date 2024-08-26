package br.com.ifba.prg03_scedu.usuario.service;

import br.com.ifba.prg03_scedu.mail.service.MailIService;
import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import br.com.ifba.prg03_scedu.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioIService {

    private final UsuarioRepository usuarioRepository;
    private final MailIService mailService;
    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioService.class);
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private String getTimestamp() {
        return LocalDateTime.now().format(FORMATTER);
    }
    
        private void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new RuntimeException("A senha deve ter pelo menos 8 caracteres");
        }

        if (!senha.matches(".*\\d.*")) { // Verifica se há pelo menos um dígito
            throw new RuntimeException("A senha deve conter pelo menos um número");
        }
    }

    @Override
    public List<Usuario> findAll() {
        String timestamp = getTimestamp();
        LOGGER.info("[{}] Buscando todos os Usuários.", timestamp);
        List<Usuario> usuarios = usuarioRepository.findAll();
        LOGGER.info("[{}] Encontrados {} usuários.", timestamp, usuarios.size());
        return usuarios;
    }

    @Override
    public Usuario findById(Long id) {
        String timestamp = getTimestamp();
        return usuarioRepository.findById(id).orElseThrow(() -> {
            LOGGER.error("[{}] Usuário com ID {} não encontrado", timestamp, id);
            return new RuntimeException("Usuário com ID " + id + " não encontrado");
        });
    }
    
    

    @Override
    public void save(Usuario usuario) {
        String timestamp = getTimestamp();

        if (usuario == null) {
            LOGGER.error("[{}] Dados do Usuário não preenchidos", timestamp);
            throw new RuntimeException("Dados do Usuário não preenchidos");
        }

        // Validação dos campos obrigatórios
        if (usuario.getNome() == null || usuario.getNome().isEmpty() ||
            usuario.getEmail() == null || usuario.getEmail().isEmpty() ||
            usuario.getSenha() == null || usuario.getSenha().isEmpty() ||
            usuario.getNivelAcesso() == null || usuario.getNivelAcesso().isEmpty()) {
            LOGGER.error("[{}] Todos os campos do usuário devem ser preenchidos", timestamp);
            throw new RuntimeException("Todos os campos do usuário devem ser preenchidos");
        }

        // Valida a senha
        validarSenha(usuario.getSenha());

        // Verifica se o e-mail já está em uso
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            LOGGER.error("[{}] O e-mail {} já está em uso", timestamp, usuario.getEmail());
            throw new RuntimeException("O e-mail já está em uso");
        }

        LOGGER.info("[{}] Salvando o Usuário: Nome - {}, Email - {}, Nível de Acesso - {}", 
                    timestamp, usuario.getNome(), usuario.getEmail(), usuario.getNivelAcesso());
        usuarioRepository.save(usuario);
        LOGGER.info("[{}] Usuário salvo com sucesso: Nome - {}", timestamp, usuario.getNome());
    }

 @Override
    public void update(Usuario usuario) {
        String timestamp = getTimestamp();

        if (usuario == null || usuario.getId() == null) {
            LOGGER.error("[{}] Dados do Usuário ou ID não preenchidos", timestamp);
            throw new RuntimeException("Dados do Usuário ou ID não preenchidos");
        }

        // Validação dos campos obrigatórios
        if (usuario.getNome() == null || usuario.getNome().isEmpty() ||
            usuario.getEmail() == null || usuario.getEmail().isEmpty() ||
            usuario.getSenha() == null || usuario.getSenha().isEmpty() ||
            usuario.getNivelAcesso() == null || usuario.getNivelAcesso().isEmpty()) {
            LOGGER.error("[{}] Todos os campos do usuário devem ser preenchidos", timestamp);
            throw new RuntimeException("Todos os campos do usuário devem ser preenchidos");
        }

        // Valida a senha
        validarSenha(usuario.getSenha());

        // Verifica se o usuário existe no banco de dados
        Usuario existingUsuario = usuarioRepository.findById(usuario.getId()).orElseThrow(
            () -> new RuntimeException("Usuário com ID " + usuario.getId() + " não encontrado")
        );

        // Verifica se o e-mail está em uso por outro usuário
        if (!existingUsuario.getEmail().equals(usuario.getEmail()) && usuarioRepository.existsByEmail(usuario.getEmail())) {
            LOGGER.error("[{}] O e-mail {} já está em uso. Informe um e-mail diferente", timestamp, usuario.getEmail());
            throw new RuntimeException("O e-mail já está em uso");
        }

        LOGGER.info("[{}] Atualizando o Usuário: ID - {}, Nome Antigo - {}, Novo Nome - {}", 
                    timestamp, usuario.getId(), existingUsuario.getNome(), usuario.getNome());
        usuarioRepository.save(usuario);
        LOGGER.info("[{}] Usuário atualizado com sucesso: ID - {}", timestamp, usuario.getId());
    }

    @Override
    public void delete(Long id) {
        String timestamp = getTimestamp();
        if (id == null) {
            LOGGER.error("[{}] ID do Usuário não pode ser nulo", timestamp);
            throw new RuntimeException("ID do Usuário não pode ser nulo");
        }

        Usuario usuario = usuarioRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Usuário com ID " + id + " não encontrado")
        );
        LOGGER.info("[{}] Removendo o Usuário: ID - {}, Nome - {}", timestamp, id, usuario.getNome());
        usuarioRepository.deleteById(id);
        LOGGER.info("[{}] Usuário removido com sucesso: ID - {}", timestamp, id);
    }
    
    @Override
    public boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    @Override
    public boolean existsBySenha(String senha) {
        return usuarioRepository.existsBySenha(senha);
    }

        @Override
    public Usuario login(String email, String senha) {
        // Obtém o timestamp atual para incluir nos logs
        String timestamp = getTimestamp();

        // Log de início do processo de login
        LOGGER.info("[{}] Iniciando o processo de login para o e-mail: {}", timestamp, email);

        // Verifica se o email ou a senha estão em branco e lança uma exceção se estiverem
        if (email.isBlank() || senha.isBlank()) {
            LOGGER.warn("[{}] Falha no login: e-mail ou senha em branco.", timestamp);
            throw new RuntimeException("Por favor, insira as suas credenciais.");
        }

        // Busca o usuário no repositório pelo e-mail
        Usuario usuario = usuarioRepository.findByEmail(email);

        // Verifica se o usuário foi encontrado; se não, lança uma exceção
        if (usuario == null) {
            LOGGER.error("[{}] Falha no login: Nenhum usuário encontrado com o e-mail: {}", timestamp, email);
            throw new RuntimeException("Email ou senha inválidos.");
        }

        // Verifica se a senha fornecida corresponde à senha armazenada; se não, lança uma exceção
        if (!usuario.getSenha().equals(senha)) {
            LOGGER.error("[{}] Falha no login: Senha incorreta para o e-mail: {}", timestamp, email);
            throw new RuntimeException("Email ou senha inválidos.");
        }

        // Log de sucesso no login com informações do usuário
        LOGGER.info("[{}] Login bem-sucedido para o usuário: ID - {}, Nome - {}", timestamp, usuario.getId(), usuario.getNome());

        // Retorna o usuário autenticado
        return usuario;
    }

    @Override
    public void recuperarSenha(String email) {
        // Obtém o timestamp atual para incluir nos logs
        String timestamp = getTimestamp();

        // Log de início do processo de recuperação de senha
        LOGGER.info("[{}] Iniciando o processo de recuperacao de senha para o e-mail: {}", timestamp, email);

        // Verifica se o email está em branco e lança uma exceção se estiver
        if (email.isBlank()) {
            throw new RuntimeException("Por favor, insira o seu email.");
        }

        // Verifica se o email existe no repositório; se não, lança uma exceção
        if (!usuarioRepository.existsByEmail(email)) {
            LOGGER.error("[{}] Nao existe nenhum usuario cadastrado com o e-mail: {}", timestamp, email);
            throw new RuntimeException("Nao existe nenhum usuario cadastrado com esse email");
        }

        // Busca o usuário no repositório pelo e-mail
        Usuario usuario = usuarioRepository.findByEmail(email);
        LOGGER.info("[{}] Usuario encontrado para recuperacao de senha: ID - {}, Nome - {}", timestamp, usuario.getId(), usuario.getNome());

        // Prepara a mensagem de e-mail com a senha atual do usuário
        String mensagem = String.format(
            "Ola %s,\n\n" +
            "Recebemos uma solicitacao de recuperacao de senha para a sua conta. Abaixo esta a sua senha atual:\n\n" +
            "Senha: %s\n\n" +
            "Se voce nao fez essa solicitacao, por favor, ignore este e-mail.\n\n" +
            "Este e-mail foi enviado automaticamente, portanto nao responda a ele. Se precisar de assistencia adicional, entre em contato com o nosso suporte tecnico.\n\n" +
            "Atenciosamente,\n" +
            "Sistema Educacional para Cidades Inteligentes\n" +
            "suportescedu@gmail.com",
            usuario.getNome(),
            usuario.getSenha()
        );

        try {
            // Log de envio do e-mail de recuperação de senha
            LOGGER.info("[{}] Enviando e-mail de recuperacao de senha para o e-mail: {}", timestamp, email);

            // Envia o e-mail para o usuário com a senha atual
            mailService.enviarEmail("Suporte SCEDU <suportescedu@gmail.com>", email, "Recuperacao de Senha da Sua Conta.", mensagem);

            // Log de sucesso no envio do e-mail
            LOGGER.info("[{}] E-mail de recuperacao de senha enviado com sucesso para o e-mail: {}", timestamp, email);

        } catch (RuntimeException e) {
            // Log de erro caso o envio do e-mail falhe
            LOGGER.error("[{}] Falha ao enviar e-mail de recuperacao de senha para o e-mail: {}. Mensagem de erro: {}", timestamp, email, e.getMessage());

            // Relança a exceção para tratamento adicional
            throw new RuntimeException(e.getMessage());
        }
    }
}
