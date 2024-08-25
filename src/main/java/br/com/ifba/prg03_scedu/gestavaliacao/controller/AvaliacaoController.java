/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.controller;

import br.com.ifba.prg03_scedu.gestavaliacao.entity.Avaliacao;
import br.com.ifba.prg03_scedu.gestavaliacao.service.AvaliacaoIService;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author rian1
 */
@Controller //Anotação que indica que esta classe é um controlador do Spring.
@RequiredArgsConstructor // Anotação do Lombok que gera um construtor com todos os campos finais (final) como parâmetros, facilitando a injeção de dependências.
public class AvaliacaoController implements AvaliacaoIController{
    
    private final AvaliacaoIService avaliacaoIservice;
    
    @Override
    public Avaliacao save(Avaliacao avaliacao) throws RuntimeException {
        // Chama o método save do serviço de curso
        return avaliacaoIservice.save(avaliacao);
    }
    
    @Override
    public Avaliacao update(Avaliacao avaliacao) throws RuntimeException {
        // Chama o método update do serviço de curso
        return avaliacaoIservice.update(avaliacao);
    }
    
    @Override
    public Avaliacao findById(Long id) throws RuntimeException {
        // Chama o método findById do serviço de curso
        return avaliacaoIservice.findById(id);
    }
    
    @Override
    public void delete(Avaliacao avaliacao) throws RuntimeException {
        // Chama o método delete do serviço de curso
        avaliacaoIservice.delete(avaliacao);
    }
    
    @Override
    public List<Avaliacao> findAll() throws RuntimeException {
        // Chama o método findAll do serviço de curso
        return avaliacaoIservice.findAll();
    }
    
    @Override
    public List<Avaliacao> findByData(LocalDate data) {
        // Chama o método findByNome do serviço de curso
        return avaliacaoIservice.findByData(data);
    }

    @Override
    public List<Avaliacao> findByDisciplina(String disciplina) {
        return avaliacaoIservice.findByDisciplina(disciplina);
    }
}
