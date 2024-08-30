/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.service;

import br.com.ifba.prg03_scedu.gestavaliacao.entity.Avaliacao;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author rian1
 */
public interface AvaliacaoIService {

    public abstract Avaliacao save(Avaliacao avaliacao) throws RuntimeException; 
    // Salva uma nova Avaliação e retorna a instância salva.

    public abstract Avaliacao update(Avaliacao avaliacao) throws RuntimeException; 
    // Atualiza uma Avaliação existente e retorna a instância atualizada.

    public abstract Avaliacao findById(Long id) throws RuntimeException; 
    // Busca uma Avaliação pelo ID e retorna a instância correspondente.

    public abstract void delete(Avaliacao avaliacao) throws RuntimeException; 
    // Exclui uma Avaliação existente.

    public abstract List<Avaliacao> findAll() throws RuntimeException; 
    // Retorna uma lista com todas as Avaliações.

    public abstract List<Avaliacao> findByData(LocalDate data); 
    // Busca Avaliações por data e retorna uma lista com as instâncias encontradas.

    public abstract List<Avaliacao> findByDisciplina(String disciplina); 
    // Busca Avaliações por disciplina e retorna uma lista com as instâncias encontradas.
}
