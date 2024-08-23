package br.com.ifba.gestaoescolas.Service;

import br.com.ifba.gestaoescolas.entity.Escola;
import br.com.ifba.gestaoescolas.repository.EscolaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EscolaService implements EscolaIService{
    
    private final EscolaRepository escolaRepository;

    
//    public List<Escola> getTodasEscolas() {
//        return escolaRepository.findAll();
//    }

    @Override
    public Escola save(Escola escola) {
        return escolaRepository.save(escola);
    }

//    public void delete(String codigoINEP) {
//        escolaRepository.deleteById(codigoINEP);
//    }

    @Override
    public Optional<Escola> buscarPorCodigoINEP(String codigoINEP) {
        return escolaRepository.findById(codigoINEP);
    }

    @Override
    public List<Escola> findByNome(String nome) {
       return escolaRepository.findByNome(nome);
    }

    @Override
    public List<Escola> findAll() {
        return escolaRepository.findAll();
    }

//    @Override
//    public Escola findByCodigo(String codigo) throws RuntimeException {
//        return escolaRepository.findByCodigo(codigo);
//    }

    @Override
    public void delete(Optional<Escola> escola) throws RuntimeException {
        escolaRepository.delete(escola);
}
    }
