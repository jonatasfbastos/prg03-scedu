package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso; // Importa a classe Curso
import java.util.List; // Importa a classe List para usar listas de cursos

// Interface que define os métodos que serão implementados pelo serviço de curso
public interface CursoIService {
    
    // Método para salvar um novo curso no banco de dados
    // Retorna o curso salvo e pode lançar uma exceção em caso de erro
    public abstract Curso save(Curso curso) throws RuntimeException;
    
    // Método para atualizar um curso existente no banco de dados
    // Retorna o curso atualizado e pode lançar uma exceção em caso de erro
    public abstract Curso update(Curso curso) throws RuntimeException;
    
    // Método para deletar um curso do banco de dados
    // Não retorna nada e pode lançar uma exceção em caso de erro
    public abstract void delete(Curso curso) throws RuntimeException;
    
    // Método para encontrar um curso pelo seu ID
    // Retorna o curso encontrado ou lança uma exceção em caso de erro
    public abstract Curso findById(Long id) throws RuntimeException;
    
    // Método para encontrar cursos pelo nome
    // Retorna uma lista de cursos encontrados ou lança uma exceção em caso de erro
    public List<Curso> findByNome(String nome) throws RuntimeException;
    
    // Método para encontrar todos os cursos
    // Retorna uma lista de todos os cursos ou lança uma exceção em caso de erro
    public List<Curso> findAll() throws RuntimeException;
    
    List<Curso> findByDescricao(String descricao)throws RuntimeException;
    List<Curso> findByModalidade(String modalidade)throws RuntimeException;
    List<Curso> findByCargaHoraria(int cargaHoraria)throws RuntimeException;
}
