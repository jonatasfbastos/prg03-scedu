
package br.com.ifba.gestaoalunos.controller;

import br.com.ifba.gestaoalunos.entity.Alunos;
import br.com.ifba.gestaoalunos.service.GestaoAlunoIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller // Indica que esta classe é um controlador Spring MVC.
@RequiredArgsConstructor // Gera um construtor com um argumento para cada campo final.
public class GestaoAlunosController implements GestaoAlunoIController{
    private final GestaoAlunoIService cursoService; // Injeta o serviço de cursos.

    @Override
    public Alunos save(Alunos curso) throws RuntimeException {
        // Chama o serviço para salvar um curso.
        return cursoService.save(curso);
    }

    @Override
    public Alunos update(Alunos curso) throws RuntimeException {
        // Chama o serviço para atualizar um curso.
        return cursoService.update(curso);
    }

    @Override
    public void delete(Alunos curso) throws RuntimeException {
        // Chama o serviço para deletar um curso.
        cursoService.delete(curso);
    }

    @Override
    public Alunos findById(Long id) throws RuntimeException {
        // Chama o serviço para encontrar um curso pelo ID.
        return cursoService.findById(id);
    }

    @Override
    public List<Alunos> findByNome(String nome) throws RuntimeException {
        // Chama o serviço para encontrar cursos pelo nome.
        return cursoService.findByNome(nome);
    }

    @Override
    public List<Alunos> findAll() throws RuntimeException {
        // Chama o serviço para listar todos os cursos.
        return cursoService.findAll();
    }
}
