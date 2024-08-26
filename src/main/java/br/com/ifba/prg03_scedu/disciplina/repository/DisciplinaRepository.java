/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.repository;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Flavio Junior
 */
/**
 * Interface de repositório para a entidade Disciplina. 
 * Estende JpaRepository para fornecer operações CRUD e outras operações 
 * padrão para a entidade Disciplina.
 * 
 * @author Flavio Junior
 */
@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    // Define um método de consulta personalizada que encontra uma lista de disciplinas
    // com base no nome fornecido. O Spring Data JPA gera automaticamente a implementação 
    // do método com base na convenção de nomenclatura.
    public List<Disciplina> findByNome(String nome);
}
