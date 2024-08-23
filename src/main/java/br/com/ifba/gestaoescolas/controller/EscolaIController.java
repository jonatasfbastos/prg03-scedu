package br.com.ifba.gestaoescolas.controller;

import br.com.ifba.gestaoescolas.entity.Escola;
import java.util.List;
import java.util.Optional;


public interface EscolaIController {
    
    Escola getCursoById(Long id);
    
    public abstract List<Escola> search(String query) throws RuntimeException;
    //public abstract void update(Escola codigoINEP) throws RuntimeException;
    public abstract void delete(Optional<Escola> escola) throws RuntimeException; //  public abstract void delete(Disciplina disciplina) throws RuntimeException;
    public abstract Escola save(Escola escola) throws RuntimeException;
    public abstract List<Escola> findAll() throws RuntimeException;
    public abstract Optional<Escola> buscarPorCodigoINEP(String codigoINEP) throws RuntimeException;
    public abstract List<Escola> findByNome(String nome) throws RuntimeException;
    //public abstract void getTodasEscolas() throws RuntimeException;
}
