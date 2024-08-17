/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.disciplina.controller;

import br.com.ifba.disciplina.entity.Disciplina;
import java.util.List;

/**
 *
 * @author Flavio Junior
 */
public interface DisciplinaIController {
    /**
     * Salva uma disciplina no sistema.
     * 
     * @param disciplina A disciplina a ser salva.
     * @return A disciplina salva, possivelmente com modificações (como ID gerado).
     * @throws RuntimeException Se ocorrer um erro durante a operação de salvamento.
     */
    public abstract Disciplina save(Disciplina disciplina) throws RuntimeException;

    /**
     * Atualiza as informações de uma disciplina existente.
     * 
     * @param disciplina A disciplina com as informações atualizadas.
     * @return A disciplina atualizada.
     * @throws RuntimeException Se ocorrer um erro durante a operação de atualização.
     */
    public abstract Disciplina update(Disciplina disciplina) throws RuntimeException;

    /**
     * Exclui uma disciplina do sistema.
     * 
     * @param disciplina A disciplina a ser excluída.
     * @throws RuntimeException Se ocorrer um erro durante a operação de exclusão.
     */
    public abstract void delete(Disciplina disciplina) throws RuntimeException;

    /**
     * Encontra uma disciplina pelo seu identificador.
     * 
     * @param id O identificador da disciplina a ser encontrada.
     * @return A disciplina encontrada ou null se nenhuma disciplina for encontrada com o ID fornecido.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public abstract Disciplina findById(Long id) throws RuntimeException;

    /**
     * Encontra disciplinas pelo nome.
     * 
     * @param nome O nome da disciplina a ser buscada.
     * @return Uma lista de disciplinas que correspondem ao nome fornecido.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public List<Disciplina> findByNome(String nome) throws RuntimeException;

    /**
     * Encontra todas as disciplinas disponíveis no sistema.
     * 
     * @return Uma lista de todas as disciplinas.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public List<Disciplina> findAll() throws RuntimeException;
}
