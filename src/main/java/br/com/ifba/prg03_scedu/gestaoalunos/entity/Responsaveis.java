
package br.com.ifba.prg03_scedu.gestaoalunos.entity;

import br.com.ifba.prg03_scedu.infrastructure.entity.Pessoa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("RESPONSAVEIS")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Responsaveis extends Pessoa{
    private String profissao;
    private String tipo;
}
    