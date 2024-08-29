
package br.com.ifba.prg03_scedu.gestaoalunos.dao;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.Responsaveis;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GestaoAlunoRepositoryResponsaveis extends JpaRepository<Responsaveis, Long>{
    List<Responsaveis> findByNome(@Param("nome") String nomeResponsavel);
}
