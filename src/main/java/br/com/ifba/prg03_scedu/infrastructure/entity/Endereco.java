
package br.com.ifba.prg03_scedu.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="enderecos")
public class Endereco extends PersistenceEntity{
    private String complemento;
    private String bairro;
    private String cidade;
    private String rua;
    private int numero;
    private String cep;
    
    @Column(length = 2)
    private String uf;
    
    @ManyToMany(mappedBy = "enderecos")
    private Set<Pessoa> pessoas;
}
