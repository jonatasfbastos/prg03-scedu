package br.com.ifba.gestaofaltas.service;

import br.com.ifba.gestaofaltas.entity.Alunos;
import br.com.ifba.gestaofaltas.repository.GestaoFaltasRepository;
import br.com.ifba.gestaofaltas.entity.Falta;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
