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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String orgaoExpedidorRg;
    private String telefone;
    
    @ManyToMany
    @JoinTable(
        name = "pessoa_endereco",
        joinColumns = @JoinColumn(name = "pessoa_id"),
        inverseJoinColumns = @JoinColumn(name = "endereco_id")
    )
    private Set<Endereco> enderecos;
            
    @Column(unique = true)
    private String cpf;
    
    @Column(unique = true)
    private String rg;
    
    @Temporal(TemporalType.DATE) 
    private Date nascimento;
    
    @Temporal(TemporalType.DATE) 
    private Date dataEmissaoRg;
    
//    @Column(columnDefinition = "VARCHAR(255) DEFAULT 'RESPONSAVEIS'")
//    private String dtype;
}
