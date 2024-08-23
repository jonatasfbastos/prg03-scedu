package br.com.ifba.prg03_scedu.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="pessoas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    @Column(unique = true)
    private String telefone;
    
    @Column(unique = true)
    private String email;
    
    @Column(unique = true)
    private String cpf;
    
    @Column(unique = true)
    private String rg;
    
    @Column(length = 5)
    private String orgaoExpedidor;
    
    @Temporal(TemporalType.DATE) 
    private Date dataEmissaoRg;
    
    @Temporal(TemporalType.DATE) 
    private Date dataNascimento;
    
    private String Sexo;
}
