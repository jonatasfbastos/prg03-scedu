/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.serie.entity;

import br.com.ifba.prg03_scedu.curriculo.entity.Curriculo;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author geovana
 */
@Data
@Entity
@NoArgsConstructor
@Table(name="serie")
public class Serie {
    
    @Id
    //Gera automaticamente o id pelo banco
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "serie_curriculo", 
        joinColumns = @JoinColumn(name = "serie_id"), 
        inverseJoinColumns = @JoinColumn(name = "curriculo_id"))
    private List<Curriculo> curriculo = new ArrayList<>();
    
   // private List<Turma> listaTurma;
    
    public List<Curriculo> getCurriculo(){
        if(curriculo == null) {
            curriculo = new ArrayList<>();
        }
        return curriculo;
    }
}
