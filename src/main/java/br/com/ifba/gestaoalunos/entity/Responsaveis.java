
package br.com.ifba.gestaoalunos.entity;

import br.com.ifba.infrastructure.entity.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reponsaveis")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Responsaveis extends Pessoa{
    private String profissao;
}
