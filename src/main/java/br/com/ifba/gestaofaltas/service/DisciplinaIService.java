/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.gestaofaltas.service;

import br.com.ifba.gestaofaltas.entity.Disciplina;
import java.util.List;

//Interface para operações relacionadas à entidade Disciplina
public interface DisciplinaIService {
    
    Disciplina save(Disciplina disciplina) throws RuntimeException;
    
    Disciplina update(Disciplina disciplina) throws RuntimeException;
    
    void delete(Disciplina disciplina) throws RuntimeException;
    
    Disciplina findById(Long id) throws RuntimeException;

    List<Disciplina> findAll() throws RuntimeException;
}
