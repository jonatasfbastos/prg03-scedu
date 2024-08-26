/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.curriculo.entity;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name="curriculo")
@Component
@Data
public class Curriculo{
    
    //private Long codigoCurriculo;

    //Adicionado o codigoCurriculo é o ID do curriculo
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long codigoEscola;

    private Long codigoSerie;

    //Adicionado uma variavel que contem todas as disciplinas separadas por virgulas
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "curriculo_disciplinas",
        joinColumns = @JoinColumn(name = "curriculo_id"),
        inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas = new ArrayList<>();
 
    
    //Editado o modo que pega as disciplinas para travar ela nula
    public List<Disciplina> getDisciplinas() {
        if (disciplinas == null) {
            disciplinas = new ArrayList<>();
        }
        return disciplinas;
    }
}
