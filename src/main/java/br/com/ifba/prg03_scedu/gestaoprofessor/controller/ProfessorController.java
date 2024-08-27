package br.com.ifba.prg03_scedu.gestaoprofessor.controller;

import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import br.com.ifba.prg03_scedu.gestaoprofessor.service.ProfessorIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProfessorController implements ProfessorIController{

    private final ProfessorIService professorService;

    @Override
    public List<Professor> findAll() {
         return professorService.findAll();
    }

    @Override
    public Professor findById(Long id) {
        return professorService.findById(id);
    }

    @Override
    public Professor save(Professor professor) {
        return professorService.save(professor);
    }

    @Override
    public Professor update(Professor usuario) {
        return professorService.update(usuario);
    }

    @Override
    public void delete(Long id) {
        professorService.delete(id);
    }
}
