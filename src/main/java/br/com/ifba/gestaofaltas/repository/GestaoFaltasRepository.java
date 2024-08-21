package br.com.ifba.gestaofaltas.repository;

import br.com.ifba.gestaofaltas.entity.Falta;
import java.util.List;

import br.com.ifba.gestaofaltas.entity.Falta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestaoFaltasRepository extends JpaRepository<Falta, Long> {
    //List<Falta> findByStudentId(Long rg);
}
