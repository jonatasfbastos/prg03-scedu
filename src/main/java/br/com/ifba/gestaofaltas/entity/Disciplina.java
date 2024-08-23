/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.gestaofaltas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Disciplina {
    
   @Id
    @Column(nullable = false, unique = true)
    private int codigo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String nomeAbreviado;

    @Column(nullable = false)
    private int cargaHoraria;

    @Column(nullable = false)
    private String baseCurricular;

    @Column(nullable = false)
    private boolean estado;

    //Construtores
    public Disciplina() {
    }

    public Disciplina(int codigo, String nome, String nomeAbreviado, int cargaHoraria, String baseCurricular, boolean estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.nomeAbreviado = nomeAbreviado;
        this.cargaHoraria = cargaHoraria;
        this.baseCurricular = baseCurricular;
        this.estado = estado;
    }
    
    //Getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAbreviado() {
        return nomeAbreviado;
    }

    public void setNomeAbreviado(String nomeAbreviado) {
        this.nomeAbreviado = nomeAbreviado;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getBaseCurricular() {
        return baseCurricular;
    }

    public void setBaseCurricular(String baseCurricular) {
        this.baseCurricular = baseCurricular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
}
