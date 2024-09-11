/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.serie.controller;

import br.com.ifba.prg03_scedu.serie.entity.Serie;
import br.com.ifba.prg03_scedu.serie.service.SerieIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author geovana
 */
@Controller
//Gera automaticamente um construtor que incluira os campos final da classe
@RequiredArgsConstructor
public class SerieController implements SerieIController{
    
    private final SerieIService serieService;

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
    public void delete(Serie serie) {
       serieService.delete(serie);
    }
    
    @Override
    public Serie update(Serie serie) {
        return serieService.update(serie);
    }
    
   
}
