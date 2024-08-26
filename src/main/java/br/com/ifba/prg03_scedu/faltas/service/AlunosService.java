package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.faltas.entity.Alunos;
import br.com.ifba.prg03_scedu.faltas.repository.AlunosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//Implementação do serviço para operações relacionadas à entidade Alunos
@Service
@RequiredArgsConstructor
public class AlunosService implements AlunosIService {

    private final AlunosRepository alunosRepository;

    @Override
    public Alunos save(Alunos aluno) throws RuntimeException {
        return alunosRepository.save(aluno);
    }

    @Override
    public Alunos update(Alunos aluno) throws RuntimeException {
        return alunosRepository.save(aluno);
    }

    @Override
    public void delete(Alunos aluno) throws RuntimeException {
        alunosRepository.delete(aluno);
    }

    @Override
    public Alunos findById(Long id) throws RuntimeException {
        return alunosRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @Override
    public List<Alunos> findAll() throws RuntimeException {
        return alunosRepository.findAll();
    }
}
