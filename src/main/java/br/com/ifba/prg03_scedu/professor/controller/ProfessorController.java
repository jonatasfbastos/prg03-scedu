/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.professor.controller;

import br.com.ifba.prg03_scedu.professor.entity.Professor;
import br.com.ifba.prg03_scedu.professor.service.ProfessorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 *
 * @author hmart
 */

@Controller
public class ProfessorController{

    @Autowired
        private ProfessorService professorService;
   
    public List<Professor> listarProfessor() {
        return professorService.listarProfessor();
    }

    public Professor salvarCliente(Professor professor) {
        return professorService.salvarProfessor(professor);
    }
}
