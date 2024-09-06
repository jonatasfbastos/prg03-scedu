
package br.com.ifba.prg03_scedu.gestaoalunos.entity;

import br.com.ifba.prg03_scedu.escola.entity.Escola;
import br.com.ifba.prg03_scedu.infrastructure.entity.Pessoa;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("ALUNOP")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class AlunosPrincipal extends Pessoa{
    private String nomeSocial;
    private String genero;
    private String sexo;
    
    @Column(unique = true)
    private String tituloEleitor;
    
    @Column(unique = true)
    private String email;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pai_id")
    private Responsaveis pai;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "mae_id")
    private Responsaveis mae;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "reponsavel_legal_id")
    private Responsaveis reponsavelLegal;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "escola_id")
    private Escola escolaOrigem;
    
    private String regiaoMoradia;
    private String nacionalidade;
    private String naturalidade;
    private String deficiencia;
    private String alergia;
    private String condicoesMedicas;
    private String medicamentos;
}
