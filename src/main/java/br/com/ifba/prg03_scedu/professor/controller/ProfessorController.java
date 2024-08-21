/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.professor.controller;

import br.com.ifba.prg03_scedu.professor.entity.Professor;
import br.com.ifba.prg03_scedu.professor.service.ProfessorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 *
 * @author hmart
 */

@Controller
@RequiredArgsConstructor
public class ProfessorController implements ProfessorIController{

    @Autowired
        public ProfessorService professorService;

    @Override
    public List<Professor> findAll() {
         return professorService.findAll();
    }

    @Override
    public Professor findById(Long id) {
        return professorService.findById(id);
    }

    @Override
    public void save(Professor usuario) {
        professorService.save(usuario);
    }

    @Override
    public void update(Professor usuario) {
        professorService.update(usuario);
    }

    @Override
    public void delete(Long id) {
       professorService.delete(id);
    }
   
   
   
}
