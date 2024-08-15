package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso; // Importa a entidade Curso
import java.util.List; // Importa a lista para manipulação de coleções de objetos Curso

// Interface que define os métodos para operações de controle de Curso
public interface CursoIController {
    
    // Declaração de método para salvar um novo curso
    // O método deve implementar a lógica para persistir um objeto Curso
    public abstract Curso save(Curso curso) throws RuntimeException;
    
    // Declaração de método para atualizar um curso existente
    // O método deve implementar a lógica para atualizar um objeto Curso
    public abstract Curso update(Curso curso) throws RuntimeException;
    
    // Declaração de método para deletar um curso
    // O método deve implementar a lógica para remover um objeto Curso
    public abstract void delete(Curso curso) throws RuntimeException;
    
    // Declaração de método para encontrar um curso pelo ID
    // O método deve implementar a lógica para buscar um objeto Curso usando o ID fornecido
    public abstract Curso findById(Long id) throws RuntimeException;
    
    // Declaração de método para encontrar cursos pelo nome
    // O método deve implementar a lógica para buscar cursos que correspondem ao nome fornecido
    public List<Curso> findByNome(String nome) throws RuntimeException;
    
    // Declaração de método para encontrar todos os cursos
    // O método deve implementar a lógica para buscar todos os cursos disponíveis
    public List<Curso> findAll() throws RuntimeException;
}
