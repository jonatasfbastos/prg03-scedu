package br.com.ifba.prg03_scedu.faltas.repository;

import br.com.ifba.prg03_scedu.faltas.entity.Alunos;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestaoFaltasRepository extends JpaRepository<Falta, Long> {
    List<Falta> findByAluno(Alunos aluno);
}
