
package br.com.ifba.prg03_scedu.usuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;
}
