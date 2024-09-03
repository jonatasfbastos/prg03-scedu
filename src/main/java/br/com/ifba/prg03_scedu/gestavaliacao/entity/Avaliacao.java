/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.entity;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
//@AllArgsConstructor // Gera um construtor com todos os argumentos através do Lombok (comentado para personalização manual).
@Table(name = "avaliacao") // Define o nome da tabela correspondente a esta entidade no banco de dados.
public class Avaliacao {

    @Id // Indica que o campo 'id' é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    // Define a estratégia de geração de valor da chave primária como 'IDENTITY', onde o banco de dados auto-incrementa o valor.
    private Long id; // Campo da chave primária.

    private LocalDate data; // Data da avaliação.
    private String tipo; // Tipo de avaliação (ex.: prova, trabalho, etc.).
    private String descricao; // Descrição da avaliação.
    private boolean status; // Status da avaliação (ex.: ativa, concluída, etc.).

    @ManyToOne // Indica uma relação de muitos-para-um com a entidade 'Disciplina'.
    @JoinColumn(name = "disciplinas_nome", referencedColumnName = "nome", nullable = false) 
    // Define a coluna de junção para a relação com a entidade 'Disciplina', vinculada pelo nome da disciplina.
    private Disciplina disciplinas; // Referência à disciplina associada.

    private String disciplina; 
    // Variável utilizada para fazer consultas dentro da interface, correspondente ao nome da disciplina.

    @ManyToOne// Indica uma relação de muitos-para-um com a entidade 'Professor'.
    @JoinColumn(name = "professores_id", referencedColumnName = "id", nullable = false)
    // Define a coluna de junção para a relação com a entidade 'Professor', vinculada pelo id do professor.
    private Professor professores;// Referência ao professor associado.
    
    private String professor; // Nome do professor responsável pela avaliação.
    private int peso; // Peso da avaliação na composição da nota final.
}
