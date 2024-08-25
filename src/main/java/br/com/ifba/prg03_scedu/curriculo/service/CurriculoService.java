/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.curriculo.service;

import br.com.ifba.prg03_scedu.curriculo.entity.Curriculo;
import br.com.ifba.prg03_scedu.curriculo.repository.CurriculoRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gabriel
 */
@Service
@RequiredArgsConstructor
public class CurriculoService implements CurriculoIService{
    
    //Criação da variavel instancia que não será modificada ao inicializar marcada por final
    private final CurriculoRepository curriculoRepository;
    
    //Atributo para o Log
    private static final Logger log = LoggerFactory.getLogger(CurriculoService.class);
    
    @Override
    public Curriculo save(Curriculo curriculo) throws RuntimeException {
        //Verifica se todos os dados que são pedidos foram preenchidos
        if (curriculo == null) {
            throw new RuntimeException("Dados do Curriculo não preenchidos");
        } else if (curriculoRepository.existsById(curriculo.getId())) {
            throw new RuntimeException("Curriculo já existe");
        //Passou todas as verificações, o curriculo salva
        } else {
            log.info("Um Curriculo foi salvo!");
            return curriculoRepository.save(curriculo);
        }
    }

    @Override
    public Curriculo update(Curriculo curriculo) throws RuntimeException {
        //Verificação para caso os dados não foram preenchidos
        if (curriculo == null) {
            throw new RuntimeException("Dados do Curriculo não preenchidos");
        } else if (!curriculoRepository.existsById(curriculo.getId())) {
            throw new RuntimeException("Curriculo não encontrado");
        //Se passou por todas as verificações, curriculo atualiza
        } else {
            log.info("Um Curriculo foi atualizado!");
            return curriculoRepository.save(curriculo);
        }
    }

    @Override
    public List<Curriculo> findAll() throws RuntimeException {
        List<Curriculo> curriculos = curriculoRepository.findAll();
        //Verifica se está vazio a lista de curriculos
        if (curriculos.isEmpty()) {
            throw new RuntimeException("Nenhum Curriculo encontrado");
        //Retorna o resultado caso não esteja vazio
        } else {
            return curriculos;
        }
    }

    @Override
    public void delete(Curriculo curriculo) throws RuntimeException {
        // Verifica se existe primeiro esse curriculo
        if (curriculo == null) {
            throw new RuntimeException("Curriculo não encontrado, crie primeiro");
        } 
        // Exclui o curriculo do banco
        else {
            // Deleta o curriculo e informa por meio de log que foi deletado
            log.info("Removendo Curriculo");
            curriculoRepository.delete(curriculo);
        }
    }

    @Override
    public Curriculo findById(Long id) throws RuntimeException {
        Optional<Curriculo> curriculos = curriculoRepository.findById(id);
        //Caso encontrado, retorna o resultado
        if (curriculos.isPresent()) {
            return curriculos.get();
        //Caso não ache, retorna como não achado
        } else {
            throw new RuntimeException("Curriculo não encontrado");
        }
    }

    public void deleteById(long id) throws RuntimeException {
        if (!curriculoRepository.existsById(id)) {
            throw new RuntimeException("Curriculo não encontrado");
        } else {
            log.info("Um curriculo foi deletado!");
            curriculoRepository.deleteById(id);
        }
    }
    
}
