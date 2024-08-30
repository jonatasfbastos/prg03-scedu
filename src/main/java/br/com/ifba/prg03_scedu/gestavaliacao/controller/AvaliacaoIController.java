/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.controller;

import br.com.ifba.prg03_scedu.gestavaliacao.entity.Avaliacao;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author rian1
 */
public interface AvaliacaoIController {

    public abstract Avaliacao save(Avaliacao avaliacao) throws RuntimeException; 
    // Salva uma nova Avaliação

    public abstract Avaliacao update(Avaliacao avaliacao) throws RuntimeException; 
    // Atualiza uma Avaliação existente

    public abstract Avaliacao findById(Long id) throws RuntimeException; 
    // Busca uma Avaliação pelo ID

    public abstract void delete(Avaliacao avaliacao) throws RuntimeException; 
    // Exclui uma Avaliação

    public abstract List<Avaliacao> findAll() throws RuntimeException; 
    // Retorna uma lista com todas as Avaliações

    public abstract List<Avaliacao> findByData(LocalDate data); 
    // Busca Avaliações por data

    public abstract List<Avaliacao> findByDisciplina(String disciplina); 
    // Busca Avaliações por disciplina
}
