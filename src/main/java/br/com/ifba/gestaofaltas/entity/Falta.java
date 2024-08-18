package br.com.ifba.gestaofaltas.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Falta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "aluno_id")
    private Alunos aluno;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(nullable = false)
    private String aula;

    @Column(nullable = false)
    private boolean justificada;

    @Column(length = 500)
    private String observacoes;

    @Column(nullable = false)
    private String disciplina;

    // Construtores, getters e setters
    public Falta() {}

    public Falta(Alunos aluno, Date data, String aula, boolean justificada, String observacoes, String disciplina) {
        this.aluno = aluno;
        this.data = data;
        this.aula = aula;
        this.justificada = justificada;
        this.observacoes = observacoes;
        this.disciplina = disciplina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isJustificada() {
        return justificada;
    }

    public void setJustificada(boolean justificada) {
        this.justificada = justificada;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
