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
@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long>{
    public List<Avaliacao> findByData(LocalDate data);
    public List<Avaliacao> findByDisciplina(String disciplina);
}
