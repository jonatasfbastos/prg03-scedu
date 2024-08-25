/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.service;

import br.com.ifba.prg03_scedu.gestavaliacao.entity.Avaliacao;
import br.com.ifba.prg03_scedu.gestavaliacao.repository.AvaliacaoRepository;
//import ch.qos.logback.core.util.StringUtil;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.ifba.prg03_scedu.gestavaliacao.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author rian1
 */
@Service
@Transactional
@RequiredArgsConstructor
public class AvaliacaoService implements AvaliacaoIService{

    private final AvaliacaoRepository avaRep;
    // Logger
    private static final Logger log = LoggerFactory.getLogger(Avaliacao.class); // Cria uma instância de Logger para registrar mensagens de log.    
    
    @Override
    public Avaliacao save(Avaliacao avaliacao) throws RuntimeException{
    // Verifica se o objeto avaliacao é nulo e lança uma exceção se for o caso
    if (avaliacao == null) {
        
        throw new RuntimeException(StringUtil.getNullAvaliacaoError());
    } else if (avaliacao.getId() != null) {
        // Lança uma exceção se o ID de avaliacao não for zero, indicando que a avaliacao já existe
        throw new RuntimeException(StringUtil.getExistingAvaliacaoError());
    } else {
        log.info("Salvando o Objeto avaliacao!");
        return avaRep.save(avaliacao);
    } 
    }

    @Override
    public Avaliacao update(Avaliacao avaliacao) throws RuntimeException {
    if (avaliacao == null) {
        throw new RuntimeException(StringUtil.getNullAvaliacaoError());
    } else {
        log.info("Atualizando o Objeto avaliacao!");
        return avaRep.save(avaliacao);
    }
    }

    @Override
    public Avaliacao findById(Long id) throws RuntimeException {
    log.info("Buscando o Objeto avaliacao pelo id");
    return avaRep.findById(id).get();//retorna o método a partir do cursorepository para encontrar pelo id
    }

    @Override
    public void delete(Avaliacao avaliacao) throws RuntimeException {
    log.info("Deletando o Objeto avaliacao!");
    avaRep.delete(avaliacao);
    }

    @Override
    public List<Avaliacao> findAll() throws RuntimeException {
    log.info("Buscando todos os Objetos avaliacao!");
    return avaRep.findAll();
    }

    @Override
    public List<Avaliacao> findByData(LocalDate data) {
    // Verifica se data é nulo e lança uma exceção se for o caso
    if (data == null) {
        throw new RuntimeException(StringUtil.getNullNameError());
    } else {
        // Recupera a lista de cursos que correspondem ao nome fornecido usando o cursoDao
        log.info("Buscando os objetos avaliacao pela data");
        return avaRep.findByData(data);
    }
    }

    @Override
    public List<Avaliacao> findByDisciplina(String disciplina) {
        if (disciplina == null) {
        throw new RuntimeException(StringUtil.getNullNameError());
    } else {
        log.info("Buscando os objetos avaliacao pelo nome da disciplina");
        return avaRep.findByDisciplina(disciplina);
    }
    }

    
}
