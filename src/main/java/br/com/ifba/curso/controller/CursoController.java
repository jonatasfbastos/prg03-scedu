package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso; // Importa a entidade Curso
import br.com.ifba.curso.service.CursoIService; // Importa o serviço de Curso, que é a interface para operações de negócio
import java.util.List; // Importa a lista para manipulação de coleções de objetos Curso
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller; // Importa a anotação que marca a classe como um controlador Spring MVC

@Controller // Anotação que indica que a classe é um controlador Spring MVC
@RequiredArgsConstructor //gera um construtor para a classe com base nos campos final e nos campos marcados com a anotação @NonNull.
public class CursoController implements CursoIController {

   
    private final CursoIService cursoService; // Serviço de Curso que será injetado e utilizado para operações de negócio

    @Override
    public Curso save(Curso curso) throws RuntimeException {
       
       // Chama o método save do serviço para salvar um novo curso e retorna o curso salvo
       
        return cursoService.save(curso);
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException {
        // Chama o método update do serviço para atualizar um curso existente e retorna o curso atualizado
        return cursoService.update(curso);
    }

    @Override
    public void delete(Curso curso) throws RuntimeException {
        // Chama o método delete do serviço para remover um curso
        cursoService.delete(curso);
    }

    @Override
    public Curso findById(Long id) throws RuntimeException {
        // Chama o método findById do serviço para encontrar um curso pelo ID e retorna o curso encontrado
        return cursoService.findById(id);
    }

    @Override
    public List<Curso> findByNome(String nome) throws RuntimeException {
        // Chama o método findByNome do serviço para encontrar cursos pelo nome e retorna a lista de cursos encontrados
        return cursoService.findByNome(nome);
    }

    @Override
    public List<Curso> findAll() throws RuntimeException {
        // Chama o método findAll do serviço para encontrar todos os cursos e retorna a lista de cursos
        return cursoService.findAll();
    }
}
