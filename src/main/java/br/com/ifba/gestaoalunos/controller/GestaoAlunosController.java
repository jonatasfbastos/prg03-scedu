
package br.com.ifba.gestaoalunos.controller;

import br.com.ifba.gestaoalunos.entity.Alunos;
import br.com.ifba.gestaoalunos.service.GestaoAlunoIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller // Indica que esta classe é um controlador Spring MVC.
@RequiredArgsConstructor // Gera um construtor com um argumento para cada campo final.
public class GestaoAlunosController implements GestaoAlunoIController{
    private final GestaoAlunoIService gestaoAlunoService; // Injeta o serviço de alunos.

    @Override
    public Alunos save(Alunos aluno) throws RuntimeException {
        // Chama o serviço para salvar um aluno.
        return gestaoAlunoService.save(aluno);
    }

    @Override
    public Alunos update(Alunos aluno) throws RuntimeException {
        // Chama o serviço para atualizar um aluno.
        return gestaoAlunoService.update(aluno);
    }

    @Override
    public void delete(Alunos aluno) throws RuntimeException {
        // Chama o serviço para deletar um aluno.
        gestaoAlunoService.delete(aluno);
    }

    @Override
    public Alunos findById(Long id) throws RuntimeException {
        // Chama o serviço para encontrar um aluno pelo ID.
        return gestaoAlunoService.findById(id);
    }

    @Override
    public List<Alunos> findByNome(String nome) throws RuntimeException {
        // Chama o serviço para encontrar alunos pelo nome.
        return gestaoAlunoService.findByNome(nome);
    }

    @Override
    public List<Alunos> findAll() throws RuntimeException {
        // Chama o serviço para listar todos os alunos.
        return gestaoAlunoService.findAll();
    }
}
