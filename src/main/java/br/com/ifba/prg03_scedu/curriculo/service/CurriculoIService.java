/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.curriculo.service;

import br.com.ifba.prg03_scedu.curriculo.entity.Curriculo;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CurriculoIService {
    
    Curriculo save(Curriculo curriculo) throws RuntimeException;

    Curriculo update(Curriculo curriculo) throws RuntimeException;

    void delete(Curriculo curriculo) throws RuntimeException;

    Curriculo findById(Long id) throws RuntimeException;

    List<Curriculo> findAll() throws RuntimeException;

    void deleteById(long id) throws RuntimeException;
    
}
