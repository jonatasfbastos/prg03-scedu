/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.entity;

import br.com.ifba.prg03_scedu.curso.entity.Curso;
import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import br.com.ifba.prg03_scedu.gestavaliacao.entity.Avaliacao;
import br.com.ifba.prg03_scedu.infrastructure.entity.PersistenceEntity;
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
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "Disciplina_Professor",
        joinColumns = @JoinColumn(name = "disciplina_id"),
        inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    private List<Professor> professor;

    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "Disciplina_Curso",
        joinColumns = @JoinColumn(name = "disciplina_id"),
        inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> curso;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "Disciplina_avaliacao",
        joinColumns = @JoinColumn(name = "disciplina_id"),
        inverseJoinColumns = @JoinColumn(name = "avaliacao_id")
    )
    private List<Avaliacao> avaliação;
    

    // Carga horária da disciplina em horas.
    private int cargaHoraria;
    
    // Nome completo da disciplina.
    private String nome;
    
    // Nome abreviado da disciplina, útil para exibição em listas e relatórios.
    private String nomeAbreviado;
    
    // Base curricular associada à disciplina, podendo conter a estrutura ou diretrizes educacionais.
    private String baseCurricular;
    
    // Estado da disciplina, pode indicar se a disciplina está ativa ou inativa no sistema.
    private boolean estado;
}
