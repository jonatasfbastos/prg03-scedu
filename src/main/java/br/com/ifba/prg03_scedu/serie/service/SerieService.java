/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.serie.service;

import br.com.ifba.prg03_scedu.serie.entity.Serie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifba.prg03_scedu.serie.repository.SerieRepository;
import org.slf4j.Logger;
import lombok.RequiredArgsConstructor;
import org.hibernate.Hibernate;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geovana
 */
@Service
@RequiredArgsConstructor
public class SerieService implements SerieIService {
    
    private final SerieRepository repositorySerie;
    
    private static final Logger log = LoggerFactory.getLogger(Serie.class);
    
    //Metodo para cadastrar uma serie
    @Override
    public Serie save(Serie serie) throws RuntimeException{
        
        //Verifica se todos os dados foram preenchidos e se serie ja existe
        if (serie == null) {
            throw new RuntimeException("Dados da serie não preenchidos.");
        } if (serie.getId() != null && repositorySerie.existsById(serie.getId())) {
            throw new RuntimeException("Serie ja cadastrada.");
        } else {
            log.info("Serie cadastrada com sucesso!");
            return repositorySerie.save(serie);
        }
    }

    //Metodo para alterar dados da serie
    @Override
    public Serie update(Serie serie) {
        
        //Verifica se os dados foram preenchidos e se serie existe e atualiza
        if (serie == null) {
            throw new RuntimeException("Dados da serie não preenchidos.");
        } if (!repositorySerie.existsById(serie.getId())) {
           throw new RuntimeException ("Serie nao encontrada.");
        } else {
            //log.info("Serie atualizada com sucesso!");
            return repositorySerie.save(serie);
        }
    }

    //Metodo para excluir uma serie
    @Override
    public void delete(Serie serie) { 
        //Verifica se os dados foram preenchidos e atualiza
        if (serie == null) {
            throw new RuntimeException("Dados da serie não preenchidos.");
        } else if (!repositorySerie.existsById(serie.getId())) {
           throw new RuntimeException ("Serie nao encontrada.");
        } else {
            log.info("Serie removida com sucesso!");
            repositorySerie.delete(serie);
        }
    }

    @Transactional
    public Serie findById(Long id) {
        Serie serie = repositorySerie.findById(id).orElseThrow();
        //Inicializa o objetoCurriculo associado a serie
        Hibernate.initialize(serie.getCurriculo());
        return repositorySerie.getReferenceById(id);
    }

    @Override
    public List<Serie> findAll() {
        return repositorySerie.findAll();
    }
    
}
