package br.com.ifba.gestaoescolas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Escola {
    @Id
    private String codigoINEP;
    private String nome;
    private String cep;
    private String bairro;
    private String logradouro;
    private String complemento;
    private String telefone;
    private String modalidade;

    // Construtor
    public Escola(String nome, String codigoINEP, String cep, String bairro, String logradouro, String complemento, String telefone, String modalidade) {
        this.nome = nome;
        this.codigoINEP = codigoINEP;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.telefone = telefone;
        this.modalidade = modalidade;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCodigoINEP() { return codigoINEP; }
    public void setCodigoINEP(String codigoINEP) { this.codigoINEP = codigoINEP; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getModalidade() { return modalidade; }
    public void setModalidade(String modalidade) { this.modalidade = modalidade; }
    
    // Métodos para manipulação da escola
    public void cadastrar() {
        // Implementar a lógica para cadastrar a escola
    }

    public void alterar() {
        // Implementar a lógica para alterar a escola
    }

    public void remover() {
        // Implementar a lógica para remover a escola
    }

    public static Escola pesquisar(String codigoINEP) {
        // Implementar a lógica para pesquisar a escola pelo código do INEP
        return null; // Substituir com o retorno adequado
    }

    public static List<Escola> listar() {
        // Implementar a lógica para listar todas as escolas
        return new ArrayList<>(); // Substituir com o retorno adequado
    }
}
