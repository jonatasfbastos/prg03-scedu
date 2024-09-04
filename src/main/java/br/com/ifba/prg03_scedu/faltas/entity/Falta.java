package br.com.ifba.prg03_scedu.faltas.entity;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Falta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rg", referencedColumnName = "rg")
    private AlunosPrincipal aluno;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(nullable = false)
    private String aula;

    @Column(nullable = false)
    private boolean justificada;

    @Column(length = 500)
    private String observacoes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "disciplina_id", referencedColumnName = "id")
    private Disciplina disciplina;

    // Construtores, getters e setters
    public Falta() {
    }

    public Falta(AlunosPrincipal aluno, Date data, String aula, boolean justificada, String observacoes, Disciplina disciplina) {
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

    public AlunosPrincipal getAluno() {
        return aluno;
    }

    public void setAluno(AlunosPrincipal aluno) {
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
