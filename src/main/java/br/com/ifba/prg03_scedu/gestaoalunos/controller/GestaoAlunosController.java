
package br.com.ifba.prg03_scedu.gestaoalunos.controller;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.Responsaveis;
import br.com.ifba.prg03_scedu.gestaoalunos.service.GestaoAlunoIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller // Indica que esta classe é um controlador Spring MVC.
@RequiredArgsConstructor // Gera um construtor com um argumento para cada campo final.
public class GestaoAlunosController implements GestaoAlunoIController{
    private final GestaoAlunoIService gestaoAlunoService; // Injeta o serviço de alunos.

    @Override
    public AlunosPrincipal save(AlunosPrincipal aluno) throws RuntimeException {
        // Chama o serviço para salvar um aluno.
        return gestaoAlunoService.save(aluno);
    }

    @Override
    public AlunosPrincipal update(AlunosPrincipal aluno) throws RuntimeException {
        // Chama o serviço para atualizar um aluno.
        return gestaoAlunoService.update(aluno);
    }

    @Override
    public void delete(AlunosPrincipal aluno) throws RuntimeException {
        // Chama o serviço para deletar um aluno.
        gestaoAlunoService.delete(aluno);
    }

    @Override
    public AlunosPrincipal findById(Long id) throws RuntimeException {
        // Chama o serviço para encontrar um aluno pelo ID.
        return gestaoAlunoService.findById(id);
    }

    @Override
    public List<AlunosPrincipal> findByNome(String nome) throws RuntimeException {
        // Chama o serviço para encontrar alunos pelo nome.
        return gestaoAlunoService.findByNome(nome);
    }

    @Override
    public List<AlunosPrincipal> findAll() throws RuntimeException {
        // Chama o serviço para listar todos os alunos.
        return gestaoAlunoService.findAll();
    }
//CRUD RESPONSAVEIS
    @Override
    public Responsaveis save(Responsaveis responsavel) throws RuntimeException {
        return gestaoAlunoService.save(responsavel);
    }

    @Override
    public Responsaveis update(Responsaveis responsavel) throws RuntimeException {
        return gestaoAlunoService.update(responsavel);
    }

    @Override
    public void delete(Responsaveis responsavel) throws RuntimeException {
        gestaoAlunoService.delete(responsavel);
    }
    
    @Override
    public Responsaveis findByIdResponsavel(Long id) throws RuntimeException {
        // Chama o serviço para encontrar um aluno pelo ID.
        return gestaoAlunoService.findByIdResponsavel(id);
    }

    @Override
    public List<Responsaveis> findByNomeResponsavel(String nome) throws RuntimeException {
        // Chama o serviço para encontrar alunos pelo nome.
        return gestaoAlunoService.findByNomeResponsavel(nome);
    }
    
    @Override
    public List<Responsaveis> findAllResponsavel() throws RuntimeException {
        // Chama o serviço para listar todos os alunos.
        return gestaoAlunoService.findAllResponsavel();
    }
}
