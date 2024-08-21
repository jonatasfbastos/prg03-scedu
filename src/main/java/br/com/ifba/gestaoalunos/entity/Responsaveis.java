/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.gestaoalunos.entity;

import br.com.ifba.infrastructure.entity.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author batis
 */
@Entity
@Table(name = "reponsaveis")
public class Responsaveis extends Pessoa{
    
}
