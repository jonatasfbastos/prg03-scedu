/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.professor.repository;

import br.com.ifba.prg03_scedu.professor.entity.Professor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hmart
 */

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    
    List<Professor> findByNome(String nome);
}
