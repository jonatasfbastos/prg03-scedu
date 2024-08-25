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

    public abstract Avaliacao update(Avaliacao avaliacao) throws RuntimeException;

    public abstract Avaliacao findById(Long id) throws RuntimeException;

    public abstract void delete(Avaliacao avaliacao) throws RuntimeException;

    public abstract List<Avaliacao> findAll() throws RuntimeException;

    public abstract List<Avaliacao> findByData(LocalDate data);
    
    public abstract List<Avaliacao> findByDisciplina(String disciplina);
}
