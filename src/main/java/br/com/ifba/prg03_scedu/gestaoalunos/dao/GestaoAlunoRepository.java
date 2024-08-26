
package br.com.ifba.prg03_scedu.gestaoalunos.dao;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GestaoAlunoRepository extends JpaRepository<AlunosPrincipal, Long>{
    List<AlunosPrincipal> findByNomeStartingWith(@Param("nomeAluno") String nomeBusca);
}
