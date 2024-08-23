
package br.com.ifba.prg03_scedu.gestaoalunos.controller;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.Alunos;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.Responsaveis;
import java.util.List;

public interface GestaoAlunoIController{
    public abstract Alunos save(Alunos aluno) throws RuntimeException;
    public abstract Alunos update(Alunos aluno) throws RuntimeException;
    public abstract void delete(Alunos aluno) throws RuntimeException;
    public abstract Alunos findById(Long id) throws RuntimeException;
    public List<Alunos> findByNome(String nome) throws RuntimeException;
    public List<Alunos> findAll() throws RuntimeException;
    
    public abstract Responsaveis save(Responsaveis responsavel) throws RuntimeException;
    public abstract Responsaveis update(Responsaveis responsavel) throws RuntimeException;
    public abstract void delete(Responsaveis responsavel) throws RuntimeException;
}
