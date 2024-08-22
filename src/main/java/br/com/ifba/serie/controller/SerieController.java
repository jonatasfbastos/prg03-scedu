/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.serie.controller;

import br.com.ifba.serie.entity.Serie;
import br.com.ifba.serie.service.SerieIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author geovana
 */
@Controller
public class SerieController implements SerieIController{
    
    @Autowired
    private SerieIService serieService;

    @Override
    public List<Serie> findAll() {
        return serieService.findAll();
    }

    @Override
    public Serie findById(Long id) {
        return serieService.findById(id);
    }

    @Override
    public Serie save(Serie serie) {
        return serieService.save(serie);
    }

    @Override
    public void delete(Long id) {
      // serieService.delete(id);
    }

    @Override
    public Serie update(Serie serie) {
        return serieService.update(serie);
    }
    
   
}
