package br.com.ifba.prg03_scedu.gestaoalunos.service;

import br.com.ifba.prg03_scedu.gestaoalunos.dao.GestaoAlunoRepository;
import br.com.ifba.prg03_scedu.gestaoalunos.dao.GestaoAlunoRepositoryResponsaveis;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.Responsaveis;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service // Indica que esta classe é um serviço do Spring.
@RequiredArgsConstructor // Gera um construtor com um argumento para cada campo final.
public class GestaoAlunoService implements GestaoAlunoIService {
    private final GestaoAlunoRepositoryResponsaveis gestaoAlunoRepositoryResponsaveis; // Injeta o repositório de alunos.
    private final GestaoAlunoRepository gestaoAlunoRepository; // Injeta o repositório de alunos.
    private final Logger log = LoggerFactory.getLogger(GestaoAlunoService.class); // Cria um logger para registrar mensagens.
//CRUD ALUNOS
    @Override
    public AlunosPrincipal save(AlunosPrincipal aluno) throws RuntimeException {
        if(aluno == null ){
            log.error("Erro ao salvar aluno: aluno é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException("Dados do aluno não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else if(aluno.getId() != null){
            log.error("Erro ao salvar aluno: aluno já existe"); // Registra um erro se o aluno já existir.
            throw new RuntimeException("Aluno já existente no banco de dados"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Salvando o Objeto Alunos: {}", aluno); // Registra uma mensagem indicando que o aluno está sendo salvo.
            return gestaoAlunoRepository.save(aluno); // Salva o aluno no repositório.
        }
    }

    @Override
    public AlunosPrincipal update(AlunosPrincipal aluno) throws RuntimeException {
        if(aluno == null ){
            log.error("Erro ao atualizar aluno: aluno é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException("Dados do aluno não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Atualizando o Objeto Alunos: {}", aluno); // Registra uma mensagem indicando que o aluno está sendo atualizado.
            return gestaoAlunoRepository.save(aluno); // Atualiza o aluno no repositório.
        }
    }

    @Override
    public void delete(AlunosPrincipal aluno) throws RuntimeException {
        if(aluno == null ){
            log.error("Erro ao deletar aluno: aluno é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException("Dados do aluno não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else {
            log.info("Deletando o Objeto Alunos: {}", aluno); // Registra uma mensagem indicando que o aluno está sendo deletado.
            gestaoAlunoRepository.delete(aluno); // Deleta o aluno do repositório.
        }
    }

    @Override
    public AlunosPrincipal findById(Long id) throws RuntimeException {
        if (id == null) {
            log.error("Erro ao buscar aluno por ID: ID é nulo"); // Registra um erro se o ID for nulo.
            throw new RuntimeException("ID do Aluno não fornecido"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Buscando Alunos por ID: {}", id); // Registra uma mensagem indicando que o aluno está sendo buscado pelo ID.
            return gestaoAlunoRepository.findById(id).orElse(null); // Busca o aluno no repositório pelo ID.
        }
    }

    @Override
    public List<AlunosPrincipal> findByNome(String nome) throws RuntimeException {
        if (nome == null || nome.isEmpty()) {
            log.error("Erro ao buscar aluno por nome: nome é nulo ou vazio"); // Registra um erro se o nome for nulo ou vazio.
            throw new RuntimeException("Erro ao procurar o aluno pelo nome " + nome); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Buscando Alunoss por Nome: {}", nome); // Registra uma mensagem indicando que os alunos estão sendo buscados pelo nome.
            return gestaoAlunoRepository.findByNomeStartingWith(nome); // Busca alunos no repositório pelo nome.
        }
    }

    @Override
    public List<AlunosPrincipal> findAll() throws RuntimeException {
        log.info("Buscando todos os Alunos"); // Registra uma mensagem indicando que todos os alunos estão sendo buscados.
        return gestaoAlunoRepository.findAll(); // Busca todos os alunos no repositório.
    }
    
    //CRUD RESPONSAVEIS
    
    @Override
    public Responsaveis save(Responsaveis responsavel) throws RuntimeException {
        if(responsavel == null ){
            log.error("Erro ao salvar Responsavel: Responsavel é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException("Dados do Responsavel não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else if(responsavel.getId() != null){
            log.error("Erro ao salvar Responsavel: Responsavel já existe"); // Registra um erro se o aluno já existir.
            throw new RuntimeException("Responsavel já existente no banco de dados"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Salvando o Objeto Responsavel: {}", responsavel); // Registra uma mensagem indicando que o aluno está sendo salvo.
            return gestaoAlunoRepositoryResponsaveis.save(responsavel); // Salva o aluno no repositório.
        }
    }
    
    public Responsaveis update(Responsaveis responsavel) throws RuntimeException {
        if(responsavel == null ){
            log.error("Erro ao atualizar Responsavel: Responsavel é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException("Dados do Responsavel não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Atualizando o Objeto Responsavel: {}", responsavel); // Registra uma mensagem indicando que o aluno está sendo atualizado.
            return gestaoAlunoRepositoryResponsaveis.save(responsavel); // Atualiza o aluno no repositório.
        }
    }

    @Override
    public void delete(Responsaveis responsavel) throws RuntimeException {
        if(responsavel == null ){
            log.error("Erro ao deletar Responsavel: Responsavel é nulo"); // Registra um erro se o aluno for nulo.
            throw new RuntimeException("Dados do Responsavel não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else {
            log.info("Deletando o Objeto Responsaveis: {}", responsavel); // Registra uma mensagem indicando que o aluno está sendo deletado.
            gestaoAlunoRepositoryResponsaveis.delete(responsavel); // Deleta o aluno do repositório.
        }
    }
}

