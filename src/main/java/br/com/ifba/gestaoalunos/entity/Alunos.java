
package br.com.ifba.gestaoalunos.entity;

import br.com.ifba.infrastructure.entity.Pessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alunos")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Alunos extends Pessoa{
    private String nomeSocial;
    private String genero;
    
    @Column(unique = true)
    private String tituloEleitor;
    
    private Responsaveis pai;
    private Responsaveis mae;
    private Responsaveis reponsavelLegal;
    
    private String endereco;
    private String escolaOrigem;
    private String regiaoMoradia;
    private String nacionalidade;
    private String naturalidade;
    private String deficiencia;
    private String alergia;
    private String condicoesMedicas;
    private String medicamentos;
}
