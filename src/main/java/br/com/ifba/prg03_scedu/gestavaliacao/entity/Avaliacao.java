/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rian1
 */
@Entity
@Data // Gera automaticamente getters, setters, equals, hashCode e toString através do Lombok.
@NoArgsConstructor // Gera um construtor sem argumentos através do Lombok.
//@AllArgsConstructor // Gera um construtor com todos os argumentos através do Lombok.
@Table (name = "avaliacao")
public class Avaliacao {
    
    @Id // Anotação do JPA que indica que o campo 'id' é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração de valor da chave primária como 'IDENTITY', que normalmente significa que o banco de dados auto-incrementa o valor.
    private Long id; // Campo da chave primária.
    
    
    private LocalDate data;
    private String tipo;
    private String descricao;
    private boolean status;
    private String disciplina;
    private int peso;
    private String professor;
}
