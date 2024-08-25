/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.curriculo.controller;

import br.com.ifba.prg03_scedu.curriculo.entity.Curriculo;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CurriculoIController {
    
    Curriculo save(Curriculo curriculo) throws RuntimeException;
    
    Curriculo update(Curriculo curriculo) throws RuntimeException;
    
    List<Curriculo> findAll() throws RuntimeException;
    
    void delete(Curriculo curriculo) throws RuntimeException;
    
    Curriculo findById(long id) throws RuntimeException;
    
    void deleteById(long id);
    
}
