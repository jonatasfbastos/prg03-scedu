/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.serie.service;

import br.com.ifba.serie.entity.Serie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifba.serie.repository.SerieIRepository;

/**
 *
 * @author geovana
 */
@Service
public class SerieService implements SerieIService {
    
    @Autowired
    private SerieIRepository repositorySerie;

    public List<Serie> getAllSerie() {
        return repositorySerie.findAll();
    }

    @Override
    public Serie save(Serie serie) {
        return repositorySerie.save(serie);
    }

    //Metodo para alterar dados da serie
    @Override
    public Serie update(Serie serie) {
        return repositorySerie.save(serie);
    }

    //Metodo para excluir uma serie
    @Override
    public void delete(Serie serie) {   
       // repositorySerie.delete(id);
    }

    @Override
    public Serie findById(Long id) {
        return repositorySerie.getReferenceById(id);
    }

    @Override
    public List<Serie> findAll() {
        return repositorySerie.findAll();
    }
    
}
