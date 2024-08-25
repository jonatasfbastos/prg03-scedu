package br.com.ifba.prg03_scedu.escola.entity;

import br.com.ifba.prg03_scedu.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "escola")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Escola extends PersistenceEntity{
    
    @Column (name = "codigoInep", nullable = true)
    private String inep;
    @Column (name = "nome", nullable = true)
    private String nome;
    @Column (name = "cep", nullable = true)
    private String cep;
    @Column (name = "bairro")
    private String bairro;
    @Column (name = "logradouro")
    private String logradouro;
    @Column (name = "complemento")
    private String complemento;
    @Column (name = "telefone")
    private String telefone;
    @Column (name = "modalidade")
    private String modalidade;    

}
