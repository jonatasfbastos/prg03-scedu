
package br.com.ifba.gestaoalunos.service;

import br.com.ifba.gestaoalunos.entity.Alunos;
import java.util.List;

public interface GestaoAlunoIService{
    public abstract Alunos save(Alunos aluno) throws RuntimeException;
    public abstract Alunos update(Alunos aluno) throws RuntimeException;
    public abstract void delete(Alunos aluno) throws RuntimeException;
    public abstract Alunos findById(Long id) throws RuntimeException;
    public List<Alunos> findByNome(String nome) throws RuntimeException;
    public List<Alunos> findAll() throws RuntimeException;
}
