
package br.com.ifba.prg03_scedu.gestaoalunos.controller;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.Responsaveis;
import java.util.List;

public interface GestaoAlunoIController{
    public abstract AlunosPrincipal save(AlunosPrincipal aluno) throws RuntimeException;
    public abstract AlunosPrincipal update(AlunosPrincipal aluno) throws RuntimeException;
    public abstract void delete(AlunosPrincipal aluno) throws RuntimeException;
    public abstract AlunosPrincipal findById(Long id) throws RuntimeException;
    public List<AlunosPrincipal> findByNome(String nome) throws RuntimeException;
    public List<AlunosPrincipal> findAll() throws RuntimeException;
    
    public abstract Responsaveis save(Responsaveis responsavel) throws RuntimeException;
    public abstract Responsaveis update(Responsaveis responsavel) throws RuntimeException;
    public abstract void delete(Responsaveis responsavel) throws RuntimeException;
}
