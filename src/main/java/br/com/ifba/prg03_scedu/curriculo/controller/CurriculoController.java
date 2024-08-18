/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.curriculo.controller;

import br.com.ifba.prg03_scedu.curriculo.entity.Curriculo;
import br.com.ifba.prg03_scedu.curriculo.service.CurriculoIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Gabriel
 */
@Controller
@RequiredArgsConstructor
public class CurriculoController implements CurriculoIController{
    
    // Instancia gerenciada pelo Spring marcada como final que não é modificada
    private final CurriculoIService curriculoService;

    // Salva o curriculo e retorna ele
    @Override
    public Curriculo save(Curriculo curriculo) throws RuntimeException {
        return curriculoService.save(curriculo);
    }

    // Atualiza o curriculo
    @Override
    public Curriculo update(Curriculo curriculo) throws RuntimeException {
        return curriculoService.update(curriculo);
    }

    // Exclui o curriculo diretamente pelo objeto
    @Override
    public void delete(Curriculo curriculo) throws RuntimeException {
        curriculoService.delete(curriculo);
    }

    // Busca pelo ID do curriculo
    @Override
    public Curriculo findById(long id) throws RuntimeException {
        return curriculoService.findById(id);
    }

    // Retorna a lista de Curriculos
    @Override
    public List<Curriculo> findAll() throws RuntimeException {
        return curriculoService.findAll();
    }
    
}
