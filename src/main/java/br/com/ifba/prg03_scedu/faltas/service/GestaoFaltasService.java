package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.faltas.entity.Alunos;
import br.com.ifba.prg03_scedu.faltas.repository.GestaoFaltasRepository;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Implementação do serviço para operações relacionadas à entidade Falta
@Service
public class GestaoFaltasService implements GestaoFaltasIService {

    @Autowired
    private GestaoFaltasRepository gestaoFaltasRepository;

    @Override
    public Falta save(Falta attendance) {
        return gestaoFaltasRepository.save(attendance);
    }

    @Override
    public Falta update(Falta attendance) {
        return gestaoFaltasRepository.save(attendance);
    }

    @Override
    public void delete(Falta attendance) {
        gestaoFaltasRepository.delete(attendance);
    }

    @Override
    public Falta findById(Long id) {
        return gestaoFaltasRepository.findById(id).orElse(null);
    }

    @Override
    public List<Falta> findByAluno(Alunos aluno) {
        return gestaoFaltasRepository.findByAluno(aluno);
    }
    @Override
    public List<Falta> findAll() {
        return gestaoFaltasRepository.findAll();
    }
}
