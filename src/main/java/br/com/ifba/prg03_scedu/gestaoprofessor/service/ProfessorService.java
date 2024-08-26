/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestaoprofessor.service;

import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import br.com.ifba.prg03_scedu.gestaoprofessor.repository.ProfessorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import static org.hibernate.bytecode.BytecodeLogging.LOGGER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hmart
 */

@Service
@RequiredArgsConstructor
public class ProfessorService implements ProfessorIService{
    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    @Override
    public Professor findById(Long id) {
        return null;
    }
    

    @Override
    public Professor save(Professor usuario) {
        return professorRepository.save(usuario);
    }

    @Override
    public Professor update(Professor usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Professor> findbyname(String nome) {
      return professorRepository.findByNome(nome);
    }

    
}