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

    private final GestaoAlunoRepository gestaoAlunoRepository; // Injeta o repositório de alunos.
    private final Logger log = LoggerFactory.getLogger(GestaoAlunoService.class); // Cria um logger para registrar mensagens.

    @Override
    public Alunos save(Alunos aluno) throws RuntimeException {
        if(aluno == null ){
            log.error("Erro ao salvar aluno: aluno é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException(StringUtil.getNullCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else if(aluno.getId() != null){
            log.error("Erro ao salvar aluno: aluno já existe"); // Registra um erro se o aluno já existir.
            throw new RuntimeException(StringUtil.getExistingCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Salvando o Objeto Alunos: {}", aluno); // Registra uma mensagem indicando que o aluno está sendo salvo.
            return gestaoAlunoRepository.save(aluno); // Salva o aluno no repositório.
        }
    }

    @Override
    public Alunos update(Alunos aluno) throws RuntimeException {
        if(aluno == null ){
            log.error("Erro ao atualizar aluno: aluno é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException(StringUtil.getNullCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Atualizando o Objeto Alunos: {}", aluno); // Registra uma mensagem indicando que o aluno está sendo atualizado.
            return gestaoAlunoRepository.save(aluno); // Atualiza o aluno no repositório.
        }
    }

    @Override
    public void delete(Alunos aluno) throws RuntimeException {
        if(aluno == null ){
            log.error("Erro ao deletar aluno: aluno é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException(StringUtil.getNullCourseError()); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else {
            log.info("Deletando o Objeto Alunos: {}", aluno); // Registra uma mensagem indicando que o aluno está sendo deletado.
            gestaoAlunoRepository.delete(aluno); // Deleta o aluno do repositório.
        }
    }

    @Override
    public Alunos findById(Long id) throws RuntimeException {
        if (id == null) {
            log.error("Erro ao buscar aluno por ID: ID é nulo"); // Registra um erro se o ID for nulo.
            throw new RuntimeException(StringUtil.getFindByIdError(id)); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Buscando Alunos por ID: {}", id); // Registra uma mensagem indicando que o aluno está sendo buscado pelo ID.
            return gestaoAlunoRepository.findById(id).orElse(null); // Busca o aluno no repositório pelo ID.
        }
    }

    @Override
    public List<Alunos> findByNome(String nome) throws RuntimeException {
        if (nome == null || nome.isEmpty()) {
            log.error("Erro ao buscar aluno por nome: nome é nulo ou vazio"); // Registra um erro se o nome for nulo ou vazio.
            throw new RuntimeException(StringUtil.getFindByNameError(nome)); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Buscando Alunoss por Nome: {}", nome); // Registra uma mensagem indicando que os alunos estão sendo buscados pelo nome.
            return gestaoAlunoRepository.findByNomeAlunoStartingWith(nome); // Busca alunos no repositório pelo nome.
        }
    }

    @Override
    public List<Alunos> findAll() throws RuntimeException {
        log.info("Buscando todos os Alunoss"); // Registra uma mensagem indicando que todos os alunos estão sendo buscados.
        return gestaoAlunoRepository.findAll(); // Busca todos os alunos no repositório.
    }
}

