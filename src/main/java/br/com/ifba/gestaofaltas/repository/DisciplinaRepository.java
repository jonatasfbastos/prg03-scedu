/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.gestaofaltas.repository;

import br.com.ifba.gestaofaltas.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
    
}
