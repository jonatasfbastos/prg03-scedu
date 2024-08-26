/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.service;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import br.com.ifba.prg03_scedu.disciplina.repository.DisciplinaRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Flavio Junior
 */

@Service
@RequiredArgsConstructor
public class DisciplinaService implements DisciplinaIService{
    
    // Declara uma variável de instância 'disciplinaRepository' do tipo DisciplinaRepository
    // A variável é marcada como 'final', o que significa que seu valor não pode ser alterado após a inicialização
    private final DisciplinaRepository disciplinaRepository;

    // Declara uma variável estática e final do tipo Logger
    // A variável 'log' será usada para registrar mensagens de log para a classe DisciplinaService
    private static final Logger log = LoggerFactory.getLogger(DisciplinaService.class);

    // Salva uma disciplina utilizando o DAO e retorna a disciplina salva
    @Override
    public Disciplina save(Disciplina disciplina) throws RuntimeException {
        // Verifica se a disciplina é nula
        if (disciplina == null) {
            throw new RuntimeException("Erro, disciplina é igual à null !!!");
        }
        // Verifica se a disciplina já existe (tem um ID)
        else if (disciplina.getId() != null) {
            throw new RuntimeException("Erro, disciplina já existe no banco");
        } 
        // Salva a disciplina no banco de dados
        else {
            // Registra uma mensagem informativa no log, indicando que o processo de salvamento de uma disciplina está em andamento
            log.info("Salvando disciplina");
            return disciplinaRepository.save(disciplina);
        }
    }

    // Atualiza uma disciplina utilizando o DAO e retorna a disciplina atualizada
    @Override
    public Disciplina update(Disciplina disciplina) throws RuntimeException {
        // Verifica se a disciplina é nula
        if (disciplina == null) {
            throw new RuntimeException("Erro, disciplina é nula");
        } 
        // Atualiza a disciplina no banco de dados
        else {
            // Registra uma mensagem informativa no log, indicando que o processo de atualização de uma disciplina está em andamento
            log.info("Atualizando disciplina");
            return disciplinaRepository.save(disciplina);
        }
    }

    // Exclui uma disciplina utilizando o DAO
    @Override
    public void delete(Disciplina disciplina) throws RuntimeException {
        // Verifica se a disciplina é nula
        if (disciplina == null) {
            throw new RuntimeException("Erro, disciplina é nula");
        } 
        // Exclui a disciplina do banco de dados
        else {
            // Registra uma mensagem informativa no log, indicando que o processo de remoção de uma disciplina está em andamento
            log.info("Removendo disciplina");
            disciplinaRepository.delete(disciplina);
        }
    }

    // Busca uma disciplina pelo seu ID utilizando o DAO e retorna a disciplina encontrada
    @Override
    public Disciplina findById(Long id) throws RuntimeException {
        // Verifica se o ID é nulo
        if (id == null) {
            throw new RuntimeException("Erro, disciplina é nula");
        } 
        // Busca a disciplina pelo ID no banco de dados
        else {
            // Registra uma mensagem informativa no log, indicando que o processo de 
            //busca pelo id de uma disciplina está em andamento
            log.info("Buscando a disciplina pelo Id");
            Optional<Disciplina> disciplinaObj = disciplinaRepository.findById(id);
            return disciplinaObj.orElse(null);
        }
    }

    // Busca disciplinas pelo nome utilizando o DAO e retorna a lista de disciplinas encontradas
    @Override
    public List<Disciplina> findByNome(String nome) throws RuntimeException {
        // Verifica se o nome é nulo ou vazio
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("Erro, disciplina é nula ou vazia");
        } 
        // Busca disciplinas pelo nome no banco de dados
        else {
            // Registra uma mensagem informativa no log, 
            //indicando que o processo de busca pelo nome de uma disciplina está em andamento
            log.info("Buscando a disciplina pelo nome");
            return disciplinaRepository.findByNome(nome);
        }
    }

    // Retorna uma lista com todas as disciplinas utilizando o DAO
    @Override
    public List<Disciplina> findAll() throws RuntimeException {
        // Registra uma mensagem informativa no log, indicando que o processo de busca total de uma disciplina está em andamento
        log.info("Buscando todas as disciplinas");
        return disciplinaRepository.findAll();
    }
}
