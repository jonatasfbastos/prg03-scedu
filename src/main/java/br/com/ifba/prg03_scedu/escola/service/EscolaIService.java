package br.com.ifba.prg03_scedu.escola.service;

import br.com.ifba.prg03_scedu.escola.entity.Escola;
import java.util.List;

public interface EscolaIService {

    // Método para salvar uma nova escola
    public abstract Escola save(Escola escola) throws RuntimeException;

    // Método para atualizar uma escola existente
    public abstract Escola update(Escola escola) throws RuntimeException;

    // Método para excluir uma escola
    public abstract void delete(Escola escola) throws RuntimeException;

    // Método para buscar uma escola pelo seu ID
    public abstract Escola findById(Long id) throws RuntimeException;

    // Método para buscar escolas pelo nome
    public abstract List<Escola> findByNome(String nome) throws RuntimeException;

    // Método para buscar escolas pelo código INEP
    public abstract Escola findByInep(String inep) throws RuntimeException;

    // Método para listar todas as escolas
    public abstract List<Escola> findAll() throws RuntimeException;
    
}

