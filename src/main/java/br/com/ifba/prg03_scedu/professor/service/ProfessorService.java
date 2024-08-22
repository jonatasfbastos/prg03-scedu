/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.professor.service;

import br.com.ifba.prg03_scedu.professor.entity.Professor;
import br.com.ifba.prg03_scedu.professor.repository.ProfessorRepository;
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
        return professorRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Professor usuario) {
        professorRepository.save(usuario);
    }

    @Override
    public void update(Professor usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Professor> findbyname(String nome) {
      return   professorRepository.findByNome(nome);
    }

    
}