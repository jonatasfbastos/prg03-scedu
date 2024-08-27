/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestaoprofessor.entity;

import br.com.ifba.prg03_scedu.infrastructure.entity.Pessoa;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "professores") // Nome da tabela para a entidade Professor
@DiscriminatorValue("PROFESSOR")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Professor extends Pessoa{ 
    public String materia;
    public Boolean formado;
    
}
