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
@Controller // Indica que esta classe é um controlador do Spring, responsável por gerenciar as requisições HTTP.
@RequiredArgsConstructor // Anotação do Lombok que gera um construtor com todos os campos finais (final), facilitando a injeção de dependências.
public class AvaliacaoController implements AvaliacaoIController{

    private final AvaliacaoIService avaliacaoIservice; // Injeção de dependência do serviço de Avaliação

    @Override
    public Avaliacao save(Avaliacao avaliacao) throws RuntimeException {
        return avaliacaoIservice.save(avaliacao); // Chama o serviço para salvar uma nova avaliação
    }

    @Override
    public Avaliacao update(Avaliacao avaliacao) throws RuntimeException {
        return avaliacaoIservice.update(avaliacao); // Chama o serviço para atualizar uma avaliação existente
    }

    @Override
    public Avaliacao findById(Long id) throws RuntimeException {
        return avaliacaoIservice.findById(id); // Chama o serviço para encontrar uma avaliação pelo ID
    }

    @Override
    public void delete(Avaliacao avaliacao) throws RuntimeException {
        avaliacaoIservice.delete(avaliacao); // Chama o serviço para excluir uma avaliação
    }

    @Override
    public List<Avaliacao> findAll() throws RuntimeException {
        return avaliacaoIservice.findAll(); // Chama o serviço para listar todas as avaliações
    }

    @Override
    public List<Avaliacao> findByData(LocalDate data) {
        return avaliacaoIservice.findByData(data); // Chama o serviço para listar avaliações por data
    }

    @Override
    public List<Avaliacao> findByDisciplina(String disciplina) {
        return avaliacaoIservice.findByDisciplina(disciplina); // Chama o serviço para listar avaliações por disciplina
    }
}
