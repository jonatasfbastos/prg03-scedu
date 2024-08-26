package br.com.ifba.prg03_scedu.escola.controller;

import br.com.ifba.prg03_scedu.escola.entity.Escola;
import br.com.ifba.prg03_scedu.escola.service.EscolaIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Alef Almeida
 */

@Controller
@RequiredArgsConstructor
public class EscolaController implements EscolaIController {

    // Injeta uma instância do serviço de escolas gerenciado pelo Spring
    private final EscolaIService escolaService;

    // Salva uma escola utilizando o serviço e retorna a escola salva
    @Override
    public Escola save(Escola escola) throws RuntimeException {
        return escolaService.save(escola);
    }

    // Atualiza uma escola utilizando o serviço e retorna a escola atualizada
    @Override
    public Escola update(Escola escola) throws RuntimeException {
        return escolaService.update(escola);
    }

    // Exclui uma escola utilizando o serviço
    @Override
    public void delete(Escola escola) throws RuntimeException {
        escolaService.delete(escola);
    }

     // Busca uma escola pelo seu ID utilizando o serviço e retorna a escola encontrada
     @Override
     public Escola findById(Long id) throws RuntimeException {
         return escolaService.findById(id);
     }

     // Busca escolas pelo nome utilizando o serviço e retorna a lista de escolas encontradas
     @Override
     public List<Escola> findByNome(String nome) throws RuntimeException {
         return escolaService.findByNome(nome);
     }

     // Retorna uma lista com todas as escolas utilizando o serviço
     @Override
     public List<Escola> findAll() throws RuntimeException {
         return escolaService.findAll();
     }

    @Override
    public Escola findByInep(String Inep) throws RuntimeException {
        return escolaService.findByInep(Inep);
    }

}