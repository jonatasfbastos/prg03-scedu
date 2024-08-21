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
        if (usuario.getId() != null) {
            LOGGER.error("[{}] Usuário já existente no Banco de dados: ID {}", timestamp, usuario.getId());
            throw new RuntimeException("Usuário já existente no Banco de dados");
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

        Usuario existingUsuario = usuarioRepository.findById(usuario.getId()).orElseThrow(
            () -> new RuntimeException("Usuário com ID " + usuario.getId() + " não encontrado")
        );

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
    public void recuperarSenha(String email) {
        String timestamp = getTimestamp();
        LOGGER.info("[{}] Iniciando o processo de recuperacao de senha para o e-mail: {}", timestamp, email);
        
        if (email.isBlank()) {
            throw new RuntimeException("Por favor, insira o seu email.");
        }

        if (!usuarioRepository.existsByEmail(email)) {
            LOGGER.error("[{}] Nao existe nenhum usuario cadastrado com o e-mail: {}", timestamp, email);
            throw new RuntimeException("Nao existe nenhum usuario cadastrado com esse email");
        }

        Usuario usuario = usuarioRepository.findByEmail(email);
        LOGGER.info("[{}] Usuario encontrado para recuperacao de senha: ID - {}, Nome - {}", timestamp, usuario.getId(), usuario.getNome());

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
            LOGGER.info("[{}] Enviando e-mail de recuperacao de senha para o e-mail: {}", timestamp, email);
            mailService.enviarEmail("Suporte SCEDU <suportescedu@gmail.com>", email, "Recuperacao de Senha da Sua Conta.", mensagem);
            LOGGER.info("[{}] E-mail de recuperacao de senha enviado com sucesso para o e-mail: {}", timestamp, email);
        } catch (RuntimeException e) {
            LOGGER.error("[{}] Falha ao enviar e-mail de recuperacao de senha para o e-mail: {}. Mensagem de erro: {}", timestamp, email, e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Usuario login(String email, String senha) {
        
        if (email.isBlank() || senha.isBlank()) {
            throw new RuntimeException("Por favor, insira as suas credenciais.");
        }
        
        Usuario usuario = usuarioRepository.findByEmail(email);
        
        if(usuario == null || !usuario.getSenha().equals(senha)){
            throw new RuntimeException("Email ou senha inválidos.");
        }
        
        return usuario;
    }
}
