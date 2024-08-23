package br.com.ifba.gestaoescolas.Service;

import br.com.ifba.gestaoescolas.entity.Escola;
import java.util.List;
import java.util.Optional;

public interface EscolaIService {
//    public abstract List<Escola> getTodasEscolas() throws RuntimeException;
//    public abstract Escola findByCodigo(String codigoINEP) throws RuntimeException;
    public abstract List<Escola> findByNome(String nome) throws RuntimeException;
//    public abstract void update(Escola escola) throws RuntimeException;
    public abstract void delete(Optional<Escola> escola) throws RuntimeException;
    public abstract Escola save(Escola escola) throws RuntimeException;
    public abstract List<Escola> findAll() throws RuntimeException;
    public abstract Optional<Escola> buscarPorCodigoINEP(String codigoINEP) throws RuntimeException;
}

