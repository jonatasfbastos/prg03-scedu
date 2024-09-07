/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.repository;

import br.com.ifba.prg03_scedu.gestavaliacao.entity.Avaliacao;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rian1
 */
@Repository // Indica que esta interface é um repositório do Spring, responsável por interagir com o banco de dados.
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    // Interface que herda de JpaRepository, fornecendo métodos CRUD para a entidade Avaliacao.

    public List<Avaliacao> findByData(LocalDate data); 
    // Método personalizado para buscar avaliações pela data.

    public List<Avaliacao> findByDisciplina(String disciplina); 
    // Método personalizado para buscar avaliações pelo nome da disciplina.
}