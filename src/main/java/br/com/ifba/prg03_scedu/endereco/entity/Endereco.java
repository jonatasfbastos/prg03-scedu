
package br.com.ifba.prg03_scedu.endereco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="enderecos")
public class Endereco{
    // Campos individuais
    private String complemento;
    private String bairro;
    private String cidade;
    @Column(insertable = false, updatable = false)
    private String rua;
    @Column(insertable = false, updatable = false)
    private int numero;
    @Column(insertable = false, updatable = false)
    private String cep;

    @Column(length = 2)
    private String uf;

    // Configurando o ID composto
    @EmbeddedId
    private EnderecoId id;

    // Construtor que inicializa o ID composto
    public Endereco(String rua, int numero, String cep) {
        this.id = new EnderecoId(rua, numero, cep);
    }
}
