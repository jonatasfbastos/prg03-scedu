package br.com.ifba.gestaofaltas.service;

import br.com.ifba.gestaofaltas.entity.Alunos;

import java.util.List;

public interface AlunosIService {

    Alunos save(Alunos aluno) throws RuntimeException;

    Alunos update(Alunos aluno) throws RuntimeException;

    void delete(Alunos aluno) throws RuntimeException;

    Alunos findById(Long id) throws RuntimeException;

    List<Alunos> findAll() throws RuntimeException;
}
