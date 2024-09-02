package br.com.ifba.prg03_scedu.faltas.repository;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunosRepository extends JpaRepository<AlunosPrincipal, Long> {
    // Métodos adicionais de consulta podem ser definidos aqui, se necessário
}
