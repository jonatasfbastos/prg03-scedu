package br.com.ifba.prg03_scedu.faltas.service;

import br.com.ifba.prg03_scedu.faltas.repository.AlunosRepository;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//Implementação do serviço para operações relacionadas à entidade Alunos
@Service
@RequiredArgsConstructor
public class AlunosService implements AlunosIService {

    private final AlunosRepository alunosRepository;

    @Override
    public AlunosPrincipal save(AlunosPrincipal aluno) throws RuntimeException {
        return alunosRepository.save(aluno);
    }

    @Override
    public AlunosPrincipal update(AlunosPrincipal aluno) throws RuntimeException {
        return alunosRepository.save(aluno);
    }

    @Override
    public void delete(AlunosPrincipal aluno) throws RuntimeException {
        alunosRepository.delete(aluno);
    }

    @Override
    public AlunosPrincipal findById(Long id) throws RuntimeException {
        return alunosRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @Override
    public List<AlunosPrincipal> findAll() throws RuntimeException {
        return alunosRepository.findAll();
    }
}
