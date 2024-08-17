/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.disciplina.repository;

import br.com.ifba.disciplina.entity.Disciplina;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Flavio Junior
 */
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{

    public List<Disciplina> findByNome(String nome);
    
}
