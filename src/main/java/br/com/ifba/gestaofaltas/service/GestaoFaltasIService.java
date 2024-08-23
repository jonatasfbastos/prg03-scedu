package br.com.ifba.gestaofaltas.service;

import br.com.ifba.gestaofaltas.entity.Alunos;
import br.com.ifba.gestaofaltas.entity.Falta;
import java.util.List;

public interface GestaoFaltasIService {

    Falta save(Falta attendance);
    Falta update(Falta attendance);
    void delete(Falta attendance);
    Falta findById(Long id);
    List<Falta> findByAluno(Alunos aluno);
    List<Falta> findAll();
}
