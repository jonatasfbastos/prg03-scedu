package br.com.ifba.prg03_scedu.faltas.controller;

import br.com.ifba.prg03_scedu.faltas.entity.Alunos;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;
import br.com.ifba.prg03_scedu.faltas.service.AlunosIService;
import br.com.ifba.prg03_scedu.faltas.service.GestaoFaltasIService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GestaoFaltasController implements GestaoFaltasIController {

    @Autowired
    private AlunosIService alunosService;

    @Autowired
    private GestaoFaltasIService attendanceService;

    @Override
    public Alunos saveAluno(Alunos aluno) {
        return alunosService.save(aluno);
    }

    @Override
    public List<Alunos> getAllAlunos() throws RuntimeException {
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
    public List<Falta> findByAluno(Alunos aluno) { // Update method name here
        return attendanceService.findByAluno(aluno);
    }

    // Retorna uma lista com todas as faltas utilizando o serviço
    @Override
    public List<Falta> findAll() throws RuntimeException {
        return attendanceService.findAll();
    }

    // Busca todos os alunos usando o serviço de alunos
    @Override
    public Alunos getAlunoByNome(String nome) {
        List<Alunos> alunos = alunosService.findAll();
        for (Alunos aluno : alunos) {
            if (aluno.getNomeSocial().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
