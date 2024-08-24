/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Flavio Junior
 */
@MappedSuperclass
@NoArgsConstructor
public class PersistenceEntity {
    
     @Id // Indica que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) // Define a estratégia de geração automática do valor
    @Column(name = "Codigo")
    @Getter @Setter private Long id; // Campo que armazena o ID da entidade
}
