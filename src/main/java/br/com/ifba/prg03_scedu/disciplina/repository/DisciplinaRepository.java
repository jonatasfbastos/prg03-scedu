/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.repository;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Flavio Junior
 */
@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
    
    /*public*/ List<Disciplina> findByNome(String nome);
}
