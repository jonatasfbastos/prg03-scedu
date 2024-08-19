package br.com.ifba.prg03_scedu.usuario.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;
}
