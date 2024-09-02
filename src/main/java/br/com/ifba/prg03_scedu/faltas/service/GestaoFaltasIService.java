package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.faltas.entity.Falta;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;

import java.util.List;

//Interface para operações relacionadas à entidade Falta
public interface GestaoFaltasIService {

    Falta save(Falta attendance);
    Falta update(Falta attendance);
    void delete(Falta attendance);
    Falta findById(Long id);
    List<Falta> findByAluno(AlunosPrincipal aluno);
    List<Falta> findAll();
}
