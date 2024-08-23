package br.com.ifba.gestaoescolas.controller;

import br.com.ifba.gestaoescolas.Service.EscolaIService;
import br.com.ifba.gestaoescolas.entity.Escola;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;


@Controller
@RequiredArgsConstructor
public class EscolaController implements EscolaIController{

    
    private final EscolaIService escolaService;
    
    
//    public List<Escola> getTodasEscolas() {
//        return escolaService.findAll();
//    }
//
//    public Escola save(Escola escola) {
//        return escolaService.save(escola);
//    }
//    
//    // Método para obter todos os cursos
//    public List<Escola> findAll() {
//        return escolaService.findAll(); // Chama o método findAll do CursoDao
//    }
//    
//    public void delete(Escola escola) {
//        escolaService.delete(escola);
//    }
//
//    public Optional<Escola> buscarPorCodigoINEP(String codigoINEP) {
//        return escolaService.buscarPorCodigoINEP(codigoINEP);
//    }

    @Override
    public List<Escola> findByNome(String nome) {
       return escolaService.findByNome(nome);
    }

    @Override
    public List<Escola> search(String query) throws RuntimeException {
        return escolaService.findByNome(query);
    }

    @Override
    public void delete(Optional<Escola> escola) throws RuntimeException {
        escolaService.delete(escola);
    }

    @Override
    public Optional<Escola> buscarPorCodigoINEP(String codigoINEP) throws RuntimeException {
        return escolaService.buscarPorCodigoINEP(codigoINEP);
    }

    @Override
    public Escola save(Escola escola) throws RuntimeException {
       return escolaService.save(escola);
    }

    @Override
    public List<Escola> findAll() throws RuntimeException {
        return escolaService.findAll();
    }

    @Override
    public Escola getCursoById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
