package br.com.ifba.prg03_scedu.faltas.controller;

import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import br.com.ifba.prg03_scedu.disciplina.service.DisciplinaIService;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;
import br.com.ifba.prg03_scedu.faltas.service.AlunosIService;
import br.com.ifba.prg03_scedu.faltas.service.GestaoFaltasIService;
import java.util.ArrayList;
import java.util.List;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GestaoFaltasController implements GestaoFaltasIController {

    @Autowired
    private AlunosIService alunosService;

    @Autowired
    private GestaoFaltasIService attendanceService;

    @Override
    public AlunosPrincipal saveAluno(AlunosPrincipal aluno) {
        return alunosService.save(aluno);
    }
    
    @Autowired
    private DisciplinaIService disciplinaService;

    @Override
    public List<AlunosPrincipal> getAllAlunos() throws RuntimeException {
        return alunosService.findAll();
    }

    // Salva uma falta utilizando o serviço e retorna a falta salva
    @Override
    public Falta save(Falta attendance) throws RuntimeException {
        return attendanceService.save(attendance);
    }

    // Atualiza uma falta utilizando o serviço e retorna a falta atualizada
    @Override
    public Falta update(Falta attendance) throws RuntimeException {
        return attendanceService.update(attendance);
    }

    // Exclui uma falta utilizando o serviço
    @Override
    public void delete(Falta attendance) throws RuntimeException {
        attendanceService.delete(attendance);
    }

    // Busca uma falta pelo seu ID utilizando o serviço e retorna a falta encontrada
    @Override
    public Falta findById(Long id) throws RuntimeException {
        return attendanceService.findById(id);
    }

    // Busca faltas pelo NOME do aluno utilizando o serviço e retorna a lista de faltas encontradas
    @Override
    public List<Falta> findByAluno(AlunosPrincipal aluno) { // Update method name here
        return attendanceService.findByAluno(aluno);
    }

    // Retorna uma lista com todas as faltas utilizando o serviço
    @Override
    public List<Falta> findAll() throws RuntimeException {
        return attendanceService.findAll();
    }

    // Busca todos os alunos usando o serviço de alunos
    @Override
    public AlunosPrincipal getAlunoByNome(String nome) {
        List<AlunosPrincipal> alunos = alunosService.findAll();
        for (AlunosPrincipal aluno : alunos) {
            if (aluno.getNomeSocial().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

     @Override
    public Disciplina buscarDisciplinaPorNome(String nome) throws RuntimeException {
    if (nome == null || nome.isEmpty()) {
        throw new IllegalArgumentException("Nome da disciplina não pode ser nulo ou vazio.");
    }

    // Buscar todas as disciplinas usando o serviço
    List<Disciplina> disciplinasList = disciplinaService.findAll(); // Utilize o método adequado para buscar todas as disciplinas

    // Procurar a disciplina pelo nome
    for (Disciplina disciplina : disciplinasList) {
        if (disciplina.getNome().equalsIgnoreCase(nome)) {
            return disciplina;
        }
    }

    // Lançar exceção se a disciplina não for encontrada
    throw new RuntimeException("Disciplina não encontrada: " + nome);
}
    
    @Override
    public List<String> getAllDisciplinas() {
    List<Disciplina> disciplinas = disciplinaService.findAll();
    List<String> nomesDisciplinas = new ArrayList<>();
    for (Disciplina disciplina : disciplinas) {
        nomesDisciplinas.add(disciplina.getNome());
    }
    return nomesDisciplinas;
}
}
