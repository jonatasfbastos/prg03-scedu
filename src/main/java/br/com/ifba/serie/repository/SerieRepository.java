/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.serie.repository;

import br.com.ifba.serie.entity.Serie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author geovana
 */
@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
    
   // public List<Serie> getAllSerie();
    
}
