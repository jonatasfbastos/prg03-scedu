package br.com.ifba.prg03_scedu.escola.service;

import br.com.ifba.prg03_scedu.escola.entity.Escola;
import br.com.ifba.prg03_scedu.escola.repository.EscolaRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EscolaService implements EscolaIService {

    private final EscolaRepository escolaRepository;
    private static final Logger log = LoggerFactory.getLogger(EscolaService.class);

    @Override
    public Escola save(Escola escola) throws RuntimeException {
        if (escola == null) {
            throw new RuntimeException("Erro: A escola não pode ser nula.");
        } else if (escola.getId() != null) {
            throw new RuntimeException("Erro: A escola já existe (ID não é nulo).");
        } else {
            log.info("Salvando escola");
            return escolaRepository.save(escola);
        }
    }

    @Override
    public Escola update(Escola escola) throws RuntimeException {
        if (escola == null) {
            throw new RuntimeException("Erro: A escola não pode ser nula.");
        } else {
            log.info("Atualizando escola");
            return escolaRepository.save(escola);
        }
    }

    @Override
    public void delete(Escola escola) throws RuntimeException {
        if (escola == null) {
            throw new RuntimeException("Erro: A escola não pode ser nula.");
        } else {
            log.info("Removendo escola");
            escolaRepository.delete(escola);
        }
    }

    @Override
    public Escola findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("Erro: O ID não pode ser nulo.");
        } else {
            log.info("Buscando escola pelo ID");
            Optional<Escola> escolaObj = escolaRepository.findById(id);
            return escolaObj.orElse(null);
        }
    }

    @Override
    public List<Escola> findByNome(String nome) throws RuntimeException {
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("Erro: O nome não pode ser nulo ou vazio.");
        } else {
            log.info("Buscando escola pelo nome");
            return escolaRepository.findByNome(nome);
        }
    }

    @Override
    public List<Escola> findAll() throws RuntimeException {
        log.info("Buscando todas as escolas");
        return escolaRepository.findAll();
    }

    @Override
    public Escola findByInep(String inep) {
        //return escolaRepository.findByInep(inep);
        if (inep.isEmpty()) {
            throw new RuntimeException("Erro: O ID não pode ser nulo.");
        } else {
            log.info("Buscando escola pelo ID");
            Escola escolaObj = escolaRepository.findByInep(inep);
            return escolaObj;
        }
    }
}
