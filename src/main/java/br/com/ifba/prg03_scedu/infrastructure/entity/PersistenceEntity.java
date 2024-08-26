package br.com.ifba.prg03_scedu.infrastructure.entity;

import jakarta.persistence.GeneratedValue; // Importa a anotação para definir a estratégia de geração de valor
import jakarta.persistence.GenerationType; // Importa os tipos de estratégia de geração de valor
import jakarta.persistence.Id; // Importa a anotação para definir o campo como chave primária
import jakarta.persistence.MappedSuperclass; // Importa a anotação para indicar que a classe é uma superclasse mapeada
import lombok.Data;

/**
 * Classe base para todas as entidades persistentes.
 * Utiliza a anotação @MappedSuperclass para que seus campos e configurações
 * sejam herdados por outras classes de entidade, sem que a própria classe
 * seja uma entidade mapeada diretamente no banco de dados.
 */
@MappedSuperclass //Indica que esta classe não será mapeada diretamente para uma tabela de banco de dados, mas suas propriedades serão herdadas por subclasses que serão mapeadas para tabelas.
@Data //Anotação do Lombok que gera automaticamente métodos getters, setters, equals, hashCode e toString, além de um construtor para todos os campos finais.
public class PersistenceEntity {

    // Declaração do campo que representa a chave primária da entidade
    @Id // Indica que este campo é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // Define a estratégia de geração automática do valor do ID
    private Long id; // Campo que armazena o ID da entidade
}