
package br.com.ifba.prg03_scedu.gestaoalunos.dao;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.Alunos;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.Responsaveis;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GestaoAlunoRepository extends JpaRepository<Alunos, Long>{
    List<Alunos> findByNomeStartingWith(@Param("nomeAluno") String nomeBusca);
}
