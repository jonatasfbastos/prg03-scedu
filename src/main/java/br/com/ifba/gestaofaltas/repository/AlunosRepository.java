package br.com.ifba.gestaofaltas.repository;

import br.com.ifba.gestaofaltas.entity.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {
    // Métodos adicionais de consulta podem ser definidos aqui, se necessário
}
