package br.com.ifba.prg03_scedu.faltas.controller;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;

import java.util.List;

public interface GestaoFaltasIController {

    public List<AlunosPrincipal> getAllAlunos() throws RuntimeException;

    public abstract AlunosPrincipal saveAluno(AlunosPrincipal aluno) throws RuntimeException;

    public abstract Falta save(Falta attendance) throws RuntimeException;

    public abstract Falta update(Falta attendance) throws RuntimeException;

    public abstract void delete(Falta attendance) throws RuntimeException;

    public abstract Falta findById(Long id) throws RuntimeException;

    List<Falta> findByAluno(AlunosPrincipal aluno);

    public List<Falta> findAll() throws RuntimeException;

    public AlunosPrincipal getAlunoByNome(String nomeAluno);
    
    public Disciplina buscarDisciplinaPorNome(String nome) throws RuntimeException;

    public List<String> getAllDisciplinas();
}
