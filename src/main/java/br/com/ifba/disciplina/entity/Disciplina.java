/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.disciplina.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Flavio Junior
 */

// Indica que esta classe é uma entidade JPA que será mapeada para uma tabela no banco de dados
@Entity

// Especifica o nome da tabela no banco de dados que será mapeada por esta entidade
@Table(name = "Cursos")

// Gera um construtor sem argumentos automaticamente
@NoArgsConstructor

// Gera um construtor com todos os argumentos automaticamente
@AllArgsConstructor

// Gera automaticamente os métodos getters, setters, toString, equals, e hashCode
@Data

// Sobrescreve os métodos equals e hashCode para não considerar os campos da superclasse na comparação
@EqualsAndHashCode(callSuper = false)

public class Disciplina extends PersistenceEntity implements Serializable{
    
    private int cargaHoraria;
    private String nome;
    private String nomeAbreviado;
    private String baseCurricular;
    
}
