package br.com.ifba.gestaofaltas.controller;

import br.com.ifba.gestaofaltas.entity.Alunos;
import br.com.ifba.gestaofaltas.entity.Falta;
import java.util.List;

public interface GestaoFaltasIController {

    public List<Alunos> getAllAlunos() throws RuntimeException;

    public abstract Alunos saveAluno(Alunos aluno) throws RuntimeException;

    public abstract Falta save(Falta attendance) throws RuntimeException;

    public abstract Falta update(Falta attendance) throws RuntimeException;

    public abstract void delete(Falta attendance) throws RuntimeException;

    public abstract Falta findById(Long id) throws RuntimeException;

    //public List<Falta> findByStudentId(Long rg) throws RuntimeException;
    public List<Falta> findAll() throws RuntimeException;
}
