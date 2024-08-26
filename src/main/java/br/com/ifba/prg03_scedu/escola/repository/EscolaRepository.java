package br.com.ifba.prg03_scedu.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ifba.prg03_scedu.escola.entity.Escola;
import java.util.List;

public interface EscolaRepository extends JpaRepository<Escola, Long>{

    public List<Escola> findByNome(String nome);
    public Escola findByInep(String inep);
}
