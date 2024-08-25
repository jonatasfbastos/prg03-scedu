/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.professor.entity;

import br.com.ifba.prg03_scedu.infrastructure.entity.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Flavio Junior
 */
@Data
@Entity
//@Table(name="Professores")
public class Professor extends Pessoa{
    
    public String materia;
    public Boolean formado;
}
