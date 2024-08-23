package br.com.ifba.prg03_scedu.usuario.service;

import br.com.ifba.prg03_scedu.usuario.entity.Usuario;

import java.util.List;

public interface UsuarioIService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    void save(Usuario usuario);
    void update(Usuario usuario);
    void delete(Long id);
    boolean existsByEmail(String email);
    boolean existsBySenha(String senha);
    void recuperarSenha(String email);
    Usuario login(String email, String senha);
}
