/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestaoprofessor.service;

import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import br.com.ifba.prg03_scedu.gestaoprofessor.repository.ProfessorRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import static org.hibernate.bytecode.BytecodeLogging.LOGGER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hmart
 */

@Service
@RequiredArgsConstructor
public class ProfessorService implements ProfessorIService{
    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    @Override
    public Professor findById(Long id) {
        //Optional -> Permete tratar valores não nulos, ou seja sendo uma possibilidade ser nulo
        //Essa Função pega a referência do Id e Coloca na tela
        Optional<Professor> professor = professorRepository.findById(id);
        return professor.orElse(null); // Retorna null se não for encontrado
    }
    

    @Override
    public Professor save(Professor usuario) {
        return professorRepository.save(usuario);
    }

    @Override
    public Professor update(Professor usuario) {
        if(usuario == null){
            throw new RuntimeException("Erro, disciplina é nula");
        }
        return professorRepository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        //Criando a classe Professor para encontrar o tipo da entidade do professor
         Professor professor = professorRepository.findById(id).orElse(null);
         
         //Verificando ser encontrou o professor
         if(professor != null){
             //Deletando Professor
             professorRepository.delete(professor);
         }else{
             throw new RuntimeException("Professor não encontrado com o ID: " + id);
         }
    }

    @Override
    public List<Professor> findbyname(String nome) {
        return professorRepository.findByNome(nome);
    }

    
}