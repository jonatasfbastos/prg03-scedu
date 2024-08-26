/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.serie.controller;

import br.com.ifba.prg03_scedu.serie.entity.Serie;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author geovana
 */
public interface SerieIController {
    
    public List<Serie> findAll();
    public Serie findById(Long id);
    public Serie save(Serie serie);
    public void delete(Serie serie);
    public Serie update (Serie serie);
}