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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioIService {

    private final UsuarioRepository usuarioRepository;
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
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isEmpty()) {
            throw new RuntimeException("Usuário com ID " + id + " não encontrado");
        }
        LOGGER.info("[{}] Encontrado o Usuário: ID - {}, Nome - {}", timestamp, id, usuario.get().getNome());
        return usuario.get();
    }

    @Override
    public void save(Usuario usuario) {
        String timestamp = getTimestamp();
        if (usuario == null) {
            throw new RuntimeException("Dados do Usuário não preenchidos");
        } else if (usuario.getId() != null) {
            throw new RuntimeException("Usuário já existente no Banco de dados");
        } else {
            LOGGER.info("[{}] Salvando o Usuário: Nome - {}, Email - {}, Nível de Acesso - {}", timestamp, usuario.getNome(), usuario.getEmail(), usuario.getNivelAcesso());
            usuarioRepository.save(usuario);
            LOGGER.info("[{}] Usuário salvo com sucesso: Nome - {}", timestamp, usuario.getNome());
        }
    }

    @Override
    public void update(Usuario usuario) {
        String timestamp = getTimestamp();
        if (usuario == null) {
            throw new RuntimeException("Dados do Usuário não preenchidos");
        } else if (usuario.getId() == null) {
            throw new RuntimeException("Usuário não existente para atualização");
        } else {
            Usuario existingUsuario = usuarioRepository.findById(usuario.getId()).orElseThrow(
                () -> new RuntimeException("Usuário com ID " + usuario.getId() + " não encontrado")
            );
            LOGGER.info("[{}] Atualizando o Usuário: ID - {}, Nome Antigo - {}, Novo Nome - {}", 
                        timestamp, 
                        usuario.getId(), 
                        existingUsuario.getNome(), 
                        usuario.getNome());
            usuarioRepository.save(usuario);
            LOGGER.info("[{}] Usuário atualizado com sucesso: ID - {}", timestamp, usuario.getId());
        }
    }

    @Override
    public void delete(Long id) {
        String timestamp = getTimestamp();
        if (id == null) {
            throw new RuntimeException("ID do Usuário não pode ser nulo");
        } else if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário com ID " + id + " não encontrado");
        } else {
            Usuario usuario = usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário com ID " + id + " não encontrado")
            );
            LOGGER.info("[{}] Removendo o Usuário: ID - {}, Nome - {}", timestamp, id, usuario.getNome());
            usuarioRepository.deleteById(id);
            LOGGER.info("[{}] Usuário removido com sucesso: ID - {}", timestamp, id);
        }
    }
}
