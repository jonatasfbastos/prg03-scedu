/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.professor.entity;

import br.com.ifba.infrastructure.entity.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author hmart
 */

@Data
@Entity
@Table(name="Professor")
public class Professor extends Pessoa{
    
    public String materia;
    public Boolean formado;
    
}
