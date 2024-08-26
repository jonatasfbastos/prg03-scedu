/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestaoprofessor.controller;

import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import java.util.List;

/**
 *
 * @author hmart
 */
public interface ProfessorIController {
    List<Professor> findAll();
    Professor findById(Long id);
    Professor  save(Professor usuario);
    Professor update(Professor usuario);
    void delete(Long id);
}
