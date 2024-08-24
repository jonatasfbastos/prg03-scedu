/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.controller;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import br.com.ifba.prg03_scedu.disciplina.service.DisciplinaIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Flavio Junior
 */

@Controller
@RequiredArgsConstructor
public class DisciplinaController implements DisciplinaIController{
 
    // Injeta uma instância do serviço de disciplinas gerenciado pelo Spring
    private final DisciplinaIService disciplinaService;

    // Salva uma disciplina utilizando o serviço e retorna a disciplina salva
    @Override
    public Disciplina save(Disciplina disciplina) throws RuntimeException {
        return disciplinaService.save(disciplina);
    }

    // Atualiza uma disciplina utilizando o serviço e retorna a disciplina atualizada
    @Override
    public Disciplina update(Disciplina disciplina) throws RuntimeException{
        return disciplinaService.update(disciplina);
    }

    // Exclui uma disciplina utilizando o serviço
    @Override
    public void delete(Disciplina disciplina) throws RuntimeException {
        disciplinaService.delete(disciplina);
    }

    // Busca uma disciplina pelo seu ID utilizando o serviço e retorna a disciplina encontrada
    @Override
    public Disciplina findById(Long id) throws RuntimeException {
        return disciplinaService.findById(id);
    }

    // Busca disciplinas pelo nome utilizando o serviço e retorna a lista de disciplinas encontradas
    @Override
    public List<Disciplina> findByNome(String nome) throws RuntimeException {
        return disciplinaService.findByNome(nome);
    }

    // Retorna uma lista com todas as disciplinas utilizando o serviço
    @Override
    public List<Disciplina> findAll() throws RuntimeException {
        return disciplinaService.findAll();
    }
}
