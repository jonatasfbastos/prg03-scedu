
package br.com.ifba.gestaoalunos.dao;

import br.com.ifba.gestaoalunos.entity.Alunos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface GestaoAlunoRepository extends JpaRepository<Alunos, Long>{
    List<Alunos> findByNomeAlunoStartingWith(@Param("nome") String nomeBusca);
}
