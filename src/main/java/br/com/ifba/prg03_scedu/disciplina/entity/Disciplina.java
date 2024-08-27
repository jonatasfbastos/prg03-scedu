/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.entity;

import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
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
    
    // Mapeia a relação Many-to-Many com a entidade Professor.
    // O fetch type LAZY indica que os dados dos professores associados serão carregados 
    // apenas quando forem acessados pela primeira vez.
    // O cascade ALL propaga todas as operações (persist, merge, remove, etc.) realizadas em Disciplina para Professor.
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    
    // Cria uma tabela de junção para armazenar as relações Many-to-Many entre Disciplina e Professor.
    // "disciplina_id" se refere à chave estrangeira de Disciplina, e "professor_id" à chave estrangeira de Professor.
    @JoinTable(
        name = "Disciplina_Professor",
        joinColumns = @JoinColumn(name = "disciplina_id"),
        inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    private List<Professor> professor;

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
