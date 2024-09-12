
package br.com.ifba.prg03_scedu.endereco.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoId implements Serializable {
    private String rua;
    private int numero;
    private String cep;
}
