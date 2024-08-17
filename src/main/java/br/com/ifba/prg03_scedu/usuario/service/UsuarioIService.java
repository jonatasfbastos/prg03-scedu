/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.usuario.service;


import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import java.util.List;

public interface UsuarioIService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    void save(Usuario usuario);
    void update(Usuario usuario);
    void delete(Long id);
}
