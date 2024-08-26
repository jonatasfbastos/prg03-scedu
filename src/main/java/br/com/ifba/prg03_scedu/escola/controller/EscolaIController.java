package br.com.ifba.prg03_scedu.escola.controller;

import br.com.ifba.prg03_scedu.escola.entity.Escola;
import java.util.List;

/**
 *
 * @author Alef Almeida
 */
public interface EscolaIController {

    /**
     * Salva uma escola no sistema.
     * 
     * @param escola A escola a ser salva.
     * @return A escola salva, possivelmente com modificações (como ID gerado).
     * @throws RuntimeException Se ocorrer um erro durante a operação de salvamento.
     */
    public abstract Escola save(Escola escola) throws RuntimeException;

    /**
     * Atualiza as informações de uma escola existente.
     * 
     * @param escola A escola com as informações atualizadas.
     * @return A escola atualizada.
     * @throws RuntimeException Se ocorrer um erro durante a operação de atualização.
     */
    public abstract Escola update(Escola escola) throws RuntimeException;

    /**
     * Exclui uma escola do sistema.
     * 
     * @param escola A escola a ser excluída.
     * @throws RuntimeException Se ocorrer um erro durante a operação de exclusão.
     */
    public abstract void delete(Escola escola) throws RuntimeException;

    /**
     * Encontra uma escola pelo seu identificador.
     * 
     * @param id O identificador da escola a ser encontrada.
     * @return A escola encontrada ou null se nenhuma escola for encontrada com o ID fornecido.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public abstract Escola findById(Long id) throws RuntimeException;

    /**
     * Encontra escolas pelo nome.
     * 
     * @param nome O nome da escola a ser buscada.
     * @return Uma lista de escolas que correspondem ao nome fornecido.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public List<Escola> findByNome(String nome) throws RuntimeException;

    /**
     * Encontra escolas pelo código INEP.
     * 
     * @param codigoInep O código INEP da escola a ser buscada.
     * @return Uma lista de escolas que correspondem ao código INEP fornecido.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public Escola findByInep(String codigoInep) throws RuntimeException;

    /**
     * Encontra todas as escolas disponíveis no sistema.
     * 
     * @return Uma lista de todas as escolas.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public List<Escola> findAll() throws RuntimeException;
}
