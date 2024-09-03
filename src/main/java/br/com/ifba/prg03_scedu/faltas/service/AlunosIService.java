package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;

import java.util.List;

//Interface para operações relacionadas à entidade Alunos
public interface AlunosIService {

    AlunosPrincipal save(AlunosPrincipal aluno) throws RuntimeException;

    AlunosPrincipal update(AlunosPrincipal aluno) throws RuntimeException;

    void delete(AlunosPrincipal aluno) throws RuntimeException;

    AlunosPrincipal findById(Long id) throws RuntimeException;

    List<AlunosPrincipal> findAll() throws RuntimeException;
}
