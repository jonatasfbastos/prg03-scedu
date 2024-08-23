package br.com.ifba.gestaoescolas.repository;

import br.com.ifba.gestaoescolas.entity.Escola;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, String> {
    Escola findByCodigo(String codigoINEP);
    List<Escola> findByNome(String nome);
    public void delete(Optional<Escola> escola);
}
