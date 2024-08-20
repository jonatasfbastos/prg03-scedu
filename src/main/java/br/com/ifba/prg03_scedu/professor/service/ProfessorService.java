/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.professor.service;

import br.com.ifba.prg03_scedu.professor.entity.Professor;
import br.com.ifba.prg03_scedu.professor.repository.ProfessorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hmart
 */

@Service
@RequiredArgsConstructor
public class ProfessorService{
    @Autowired
    private ProfessorRepository clienteRepository;

    public List<Professor> listarProfessor() {
        return clienteRepository.findAll();
    }

    public Professor salvarProfessor(Professor cliente) {
        return clienteRepository.save(cliente);
    } 
}