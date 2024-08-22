package br.com.ifba.prg03_scedu.usuario.service;

import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import br.com.ifba.prg03_scedu.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioIService {

   private final UsuarioRepository usuarioRepository;
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
}