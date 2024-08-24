package br.com.ifba.prg03_scedu.faltas.controller;

import br.com.ifba.prg03_scedu.faltas.entity.Alunos;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;
import java.util.List;

public interface GestaoFaltasIController {

    public List<Alunos> getAllAlunos() throws RuntimeException;

    public abstract Alunos saveAluno(Alunos aluno) throws RuntimeException;

    public abstract Falta save(Falta attendance) throws RuntimeException;

    public abstract Falta update(Falta attendance) throws RuntimeException;

    public abstract void delete(Falta attendance) throws RuntimeException;

    public abstract Falta findById(Long id) throws RuntimeException;

    List<Falta> findByAluno(Alunos aluno);

    public List<Falta> findAll() throws RuntimeException;

    public Alunos getAlunoByNome(String nomeAluno);
}
