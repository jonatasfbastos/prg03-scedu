
package br.com.ifba.prg03_scedu.usuario.controller;

import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import br.com.ifba.prg03_scedu.usuario.service.UsuarioIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UsuarioController implements UsuarioIController {
    
    private final UsuarioIService usuarioService;

    @Override
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioService.findById(id);
    }

    @Override
    public void save(Usuario usuario) {
            usuarioService.save(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        usuarioService.update(usuario);
    }

    @Override
    public void delete(Long id) {
        usuarioService.delete(id);
    }
    
   @Override
    public boolean existsByEmail(String email) {
        return usuarioService.existsByEmail(email);
    }

    @Override
    public boolean existsBySenha(String senha) {
        return usuarioService.existsBySenha(senha);
    }

    @Override
    public void recuperarSenha(String email) {
        usuarioService.recuperarSenha(email);
    }
}