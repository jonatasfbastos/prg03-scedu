/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.faltas.entity.Disciplina;
import br.com.ifba.prg03_scedu.faltas.repository.DisciplinaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Implementação do serviço para operações relacionadas à entidade Disciplina
@Service
public class DisciplinaService implements DisciplinaIService {
 
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    public Disciplina save(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @Override
    public Disciplina update(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @Override
    public void delete(Disciplina disciplina) {
        disciplinaRepository.delete(disciplina);
    }

    @Override
    public Disciplina findById(Long id) {
        return disciplinaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Disciplina> findAll() {
        return disciplinaRepository.findAll();
    }
}
