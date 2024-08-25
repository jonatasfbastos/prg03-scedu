package br.com.ifba.prg03_scedu.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private String orgaoExpedidorRg;
    
    private String Telefone;
    
    @Column(unique = true)
    private String cpf;
    
    @Column(unique = true)
    private String rg;
    
    @Temporal(TemporalType.DATE) 
    private Date nascimento;
    
    @Temporal(TemporalType.DATE) 
    private Date dataEmissaoRg;
    
}
