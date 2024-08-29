/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestaoprofessor.service;

import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import java.util.List;

/**
 *
 * @author hmart
 */
public interface ProfessorIService {
    List<Professor> findAll();
    Professor findById(Long id);
    List<Professor> findbyname(String nome);
    Professor save(Professor usuario);
    Professor update(Professor usuario);
    void delete(Long id);
}
