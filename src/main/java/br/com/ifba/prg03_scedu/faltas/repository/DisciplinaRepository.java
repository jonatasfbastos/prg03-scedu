/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.faltas.repository;

import br.com.ifba.prg03_scedu.faltas.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
    
}
