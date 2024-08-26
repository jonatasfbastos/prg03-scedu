package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.faltas.entity.Alunos;

import java.util.List;

//Interface para operações relacionadas à entidade Alunos
public interface AlunosIService {

    Alunos save(Alunos aluno) throws RuntimeException;

    Alunos update(Alunos aluno) throws RuntimeException;

    void delete(Alunos aluno) throws RuntimeException;

    Alunos findById(Long id) throws RuntimeException;

    List<Alunos> findAll() throws RuntimeException;
}
