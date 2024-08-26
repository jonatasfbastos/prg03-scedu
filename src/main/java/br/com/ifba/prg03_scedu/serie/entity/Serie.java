/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.serie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author geovana
 */
@Data
@Entity
@Table(name="serie")
public class Serie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serie_seq")
    @SequenceGenerator(name="serie_seq", sequenceName = "serie_seq", allocationSize = 1)
    private Long id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "curriculoId")
    private Long curriculoId;
    
   // private List<Turma> listaTurma;
}
