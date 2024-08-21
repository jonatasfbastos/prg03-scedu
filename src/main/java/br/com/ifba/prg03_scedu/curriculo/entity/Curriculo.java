/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.curriculo.entity;

import br.com.ifba.disciplina.entity.Disciplina;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name="curriculo")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Curriculo extends PersistenceEntity implements Serializable{
    
    private Long codigoCurriculo;

    private Long codigoEscola;

    private Long codigoSerie;

    private List<Disciplina> disciplinas;
    
}
