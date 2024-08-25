/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.serie.service;

import br.com.ifba.prg03_sceu.serie.entity.Serie;
import java.util.List;

/**
 *
 * @author geovana
 */
public interface SerieIService {
    
    public Serie save(Serie serie);
    public Serie update(Serie serie);
    public void delete(Serie serie);
    public Serie findById(Long id);
    public List<Serie> findAll();
}
