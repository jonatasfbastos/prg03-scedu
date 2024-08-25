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
        // Define um método abstrato para salvar um curso, que deve ser implementado por subclasses
    public abstract Avaliacao save(Avaliacao avaliacao) throws RuntimeException;

    // Define um método abstrato para atualizar um curso, que deve ser implementado por subclasses
    public abstract Avaliacao update(Avaliacao avaliacao) throws RuntimeException;

    // Define um método abstrato para encontrar um curso pelo ID, que deve ser implementado por subclasses
    public abstract Avaliacao findById(Long id) throws RuntimeException;

    // Define um método abstrato para remover um curso, que deve ser implementado por subclasses
    public abstract void delete(Avaliacao avaliacao) throws RuntimeException;

    // Define um método abstrato para encontrar todos os cursos, que deve ser implementado por subclasses
    public abstract List<Avaliacao> findAll() throws RuntimeException;

    // Define um método abstrato para encontrar cursos pelo nome, que deve ser implementado por subclasses
    public abstract List<Avaliacao> findByData(LocalDate data);
    
    public abstract List<Avaliacao> findByDisciplina(String disciplina);
}
