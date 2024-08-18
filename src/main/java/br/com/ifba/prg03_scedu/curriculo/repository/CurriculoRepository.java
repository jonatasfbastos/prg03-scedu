/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.curriculo.repository;

import br.com.ifba.prg03_scedu.curriculo.entity.Curriculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gabriel
 */
@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long>{
    
    
}
