package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.faltas.entity.Alunos;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;
import java.util.List;

//Interface para operações relacionadas à entidade Falta
public interface GestaoFaltasIService {

    Falta save(Falta attendance);
    Falta update(Falta attendance);
    void delete(Falta attendance);
    Falta findById(Long id);
    List<Falta> findByAluno(Alunos aluno);
    List<Falta> findAll();
}
