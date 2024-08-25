/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.entity;

import br.com.ifba.prg03_scedu.infrastructure.entity.PersistenceEntity;
import br.com.ifba.prg03_scedu.professor.entity.Professor;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Flavio Junior
 */


// Especifica o nome da tabela no banco de dados que será mapeada por esta entidade
@Table(name = "Disciplinas")

// Gera um construtor sem argumentos automaticamente
@NoArgsConstructor

// Gera um construtor com todos os argumentos automaticamente
@AllArgsConstructor

// Gera automaticamente os métodos getters, setters, toString, equals, e hashCode
@Data

// Sobrescreve os métodos equals e hashCode para não considerar os campos da superclasse na comparação
@EqualsAndHashCode(callSuper = false)

// Indica que esta classe é uma entidade JPA que será mapeada para uma tabela no banco de dados
@Entity

public class Disciplina extends PersistenceEntity{
    
    //Será importante para configurar na telaProfessor
    // Mapeia a relação Many-to-Many com a entidade Professor
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        name = "Disciplina_Professor",
        joinColumns = @JoinColumn(name = "disciplina_id"),
        inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    private List<Professor> professor;
    private int cargaHoraria;
    private String nome;
    private String nomeAbreviado;
    private String baseCurricular;
    private boolean estado;
}
