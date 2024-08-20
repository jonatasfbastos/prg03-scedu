/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.serie.service;

import br.com.ifba.serie.entity.Serie;
import java.util.List;

/**
 *
 * @author geovana
 */
public interface SerieIService {
    
   // public List<Serie> getAllSerie();
    public Serie saveSerie(Serie serie);
    public Serie updateSerie(Serie serie);
    public void deleteSerie(Serie serie);
    public Serie findById(Long id);
    public List<Serie> findAll();
}
