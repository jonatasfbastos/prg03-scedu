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
//Gera automaticamente um construtor que incluira os campos final da classe
@RequiredArgsConstructor
public class SerieService implements SerieIService {
    
    private final SerieRepository repositorySerie;
    
    private static final Logger log = LoggerFactory.getLogger(Serie.class);
    
    //Metodo para cadastrar uma serie
    @Override
    public Serie save(Serie serie) throws RuntimeException{
        
        //Verifica se todos os dados foram preenchidos e se serie ja existe e lanca uma excecao
        if (serie == null) {
            throw new RuntimeException("Dados da serie não preenchidos.");
            //Verifica se a serie ja existe no banco de dados e lanca uma execao
        } if (serie.getId() != null && repositorySerie.existsById(serie.getId())) {
            throw new RuntimeException("Serie ja cadastrada.");
        } else {
            //Se a serie for valida e nao existir salva no banco de dados
            log.info("Serie cadastrada com sucesso!");
            return repositorySerie.save(serie);
        }
    }

    //Metodo para alterar dados da serie
    @Override
    public Serie update(Serie serie) {
        
        //Verifica se os dados foram preenchidos e lanca uma execao
        if (serie == null) {
            throw new RuntimeException("Dados da serie não preenchidos.");
          //Verifica se a serie existe no banco de dados pelo id
        } if (!repositorySerie.existsById(serie.getId())) {
           throw new RuntimeException ("Serie nao encontrada.");
        } else {
            log.info("Serie atualizada com sucesso!");
            //Se a serie for valida salva e atualiza 
            return repositorySerie.save(serie);
        }
    }

    //Metodo para excluir uma serie
    @Override
    public void delete(Serie serie) { 
        //Verifica se se a instancia da serie foi preenchida e lanca uma execao
        if (serie == null) {
            throw new RuntimeException("Dados da serie não preenchidos.");
        //Verifica se a serie existe no banco de dados e lanca uma execao
        } else if (!repositorySerie.existsById(serie.getId())) {
           throw new RuntimeException ("Serie nao encontrada.");
         //Se a serie for valida remove do banco de dados
        } else {
            log.info("Serie removida com sucesso!");
            repositorySerie.delete(serie);
        }
    }

    //Garante que todo metodo seja executado dentro de uma transacao
    @Transactional
    public Serie findById(Long id) {
        //Procura a serie pelo id, se nao achar lanca uma execao
        Serie serie = repositorySerie.findById(id).orElseThrow();
        //Inicializa o objeto Curriculo associado a serie
        //Previne LazyInitializationException
        Hibernate.initialize(serie.getCurriculo());
        //Retorna uma referencia da serie pelo id 
        return repositorySerie.getReferenceById(id);
    }

    @Override
    public List<Serie> findAll() {
        //Retorna uma lista de serie encontradas no banco
        return repositorySerie.findAll();
    }
    
}
