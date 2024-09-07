package br.com.ifba.prg03_scedu.infrastructure.entity;

import br.com.ifba.prg03_scedu.endereco.entity.Endereco;
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
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String rg;
    
    private String telefone;
    private String orgaoExpedidorRg;
    
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "rua_id"),
        @JoinColumn(name = "cep_id"),
        @JoinColumn(name = "numero_id")})
    private Endereco enderecos;
    
    @Temporal(TemporalType.DATE) 
    private Date nascimento;
    
    @Temporal(TemporalType.DATE) 
    private Date dataEmissaoRg;
}
