package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity; // Importa a classe base PersistenceEntity
import jakarta.persistence.Column;
import jakarta.persistence.Entity; // Importa a anotação Entity do Jakarta Persistence (JPA)
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// Declarando a classe Curso como uma entidade JPA
@Entity
@Table(name = "curso")
@Data //Gera automaticamente métodos getters, setters, equals, hashCode, e toString para todos os campos da classe.
@NoArgsConstructor //Gera um construtor sem argumentos.
@AllArgsConstructor //Gera um construtor com um argumento para cada campo.
@EqualsAndHashCode(callSuper=true) // Inclui o campo id da superclasse no equals e hashCode
public class Curso extends PersistenceEntity {

    // Declaração das variáveis que serão mapeadas para o banco de dados

    // Nome do curso, que é obrigatório (não pode ser nulo)
    @Column(name = "nome", nullable = false)
    private String nome;

    // Código do curso, que é obrigatório e deve ser único
    @Column(name = "codigoCurso", nullable = false, unique = true)
    private String NumeroCurso;

    // Indica se o curso está ativo ou não
    @Column(name = "Ativo")
    private boolean estado;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "modalidade")
    private String modalidade;
    
    @Column(name = "cargaHoraria")
    private int cargaHoraria;
}
