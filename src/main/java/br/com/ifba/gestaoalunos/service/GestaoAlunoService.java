package br.com.ifba.gestaoalunos.service;

import br.com.ifba.gestaoalunos.dao.GestaoAlunoRepository;
import br.com.ifba.gestaoalunos.entity.Alunos;
import br.com.ifba.infrastructure.util.StringUtil;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service // Indica que esta classe é um serviço do Spring.
@Transactional // Habilita a transação para todos os métodos desta classe.
@RequiredArgsConstructor // Gera um construtor com um argumento para cada campo final.
public class GestaoAlunoService implements GestaoAlunoIService {

    private final GestaoAlunoRepository cursoRepository; // Injeta o repositório de cursos.
    private final Logger log = LoggerFactory.getLogger(GestaoAlunoService.class); // Cria um logger para registrar mensagens.

    @Override
    public Alunos save(Alunos curso) throws RuntimeException {
        if(curso == null ){
            log.error("Erro ao salvar curso: curso é nulo"); // Registra um erro se o curso for nulo.
            throw new RuntimeException(StringUtil.getNullCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else if(curso.getId() != null){
            log.error("Erro ao salvar curso: curso já existe"); // Registra um erro se o curso já existir.
            throw new RuntimeException(StringUtil.getExistingCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Salvando o Objeto Alunos: {}", curso); // Registra uma mensagem indicando que o curso está sendo salvo.
            return cursoRepository.save(curso); // Salva o curso no repositório.
        }
    }

    @Override
    public Alunos update(Alunos curso) throws RuntimeException {
        if(curso == null ){
            log.error("Erro ao atualizar curso: curso é nulo"); // Registra um erro se o curso for nulo.
            throw new RuntimeException(StringUtil.getNullCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Atualizando o Objeto Alunos: {}", curso); // Registra uma mensagem indicando que o curso está sendo atualizado.
            return cursoRepository.save(curso); // Atualiza o curso no repositório.
        }
    }

    @Override
    public void delete(Alunos curso) throws RuntimeException {
        if(curso == null ){
            log.error("Erro ao deletar curso: curso é nulo"); // Registra um erro se o curso for nulo.
            throw new RuntimeException(StringUtil.getNullCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else {
            log.info("Deletando o Objeto Alunos: {}", curso); // Registra uma mensagem indicando que o curso está sendo deletado.
            cursoRepository.delete(curso); // Deleta o curso do repositório.
        }
    }

    @Override
    public Alunos findById(Long id) throws RuntimeException {
        if (id == null) {
            log.error("Erro ao buscar curso por ID: ID é nulo"); // Registra um erro se o ID for nulo.
            throw new RuntimeException(StringUtil.getFindByIdError(id)); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Buscando Alunos por ID: {}", id); // Registra uma mensagem indicando que o curso está sendo buscado pelo ID.
            return cursoRepository.findById(id).orElse(null); // Busca o curso no repositório pelo ID.
        }
    }

    @Override
    public List<Alunos> findByNome(String nome) throws RuntimeException {
        if (nome == null || nome.isEmpty()) {
            log.error("Erro ao buscar curso por nome: nome é nulo ou vazio"); // Registra um erro se o nome for nulo ou vazio.
            throw new RuntimeException(StringUtil.getFindByNameError(nome)); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Buscando Alunoss por Nome: {}", nome); // Registra uma mensagem indicando que os cursos estão sendo buscados pelo nome.
            return cursoRepository.findByNomeAlunoStartingWith(nome); // Busca cursos no repositório pelo nome.
        }
    }

    @Override
    public List<Alunos> findAll() throws RuntimeException {
        log.info("Buscando todos os Alunoss"); // Registra uma mensagem indicando que todos os cursos estão sendo buscados.
        return cursoRepository.findAll(); // Busca todos os cursos no repositório.
    }
}

