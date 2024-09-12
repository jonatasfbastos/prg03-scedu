
package br.com.ifba.prg03_scedu.endereco.service;

import br.com.ifba.prg03_scedu.endereco.entity.Endereco;
import br.com.ifba.prg03_scedu.endereco.entity.EnderecoId;
import br.com.ifba.prg03_scedu.endereco.repository.EnderecoIRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService implements EnderecoIService{
    private final EnderecoIRepository enderecoRepository; // Injeta o repositório de enderecos.
    private final Logger log = LoggerFactory.getLogger(EnderecoService.class); // Cria um logger para registrar mensagens.
//CRUD ALUNOS
    @Override
    public Endereco save(Endereco endereco) throws RuntimeException {
        if(endereco == null ){
            log.error("Erro ao salvar endereco: endereco é nulo"); // Registra um erro se o endereco for nulo.
            throw new RuntimeException("Dados do endereco não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Salvando o Objeto Enderecos: {}", endereco); // Registra uma mensagem indicando que o endereco está sendo salvo.
            return enderecoRepository.save(endereco); // Salva o endereco no repositório.
        }
    }

    @Override
    public Endereco update(Endereco endereco) throws RuntimeException {
        if(endereco == null ){
            log.error("Erro ao atualizar endereco: endereco é nulo"); // Registra um erro se o endereco for nulo.
            throw new RuntimeException("Dados do endereco não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Atualizando o Objeto Enderecos: {}", endereco); // Registra uma mensagem indicando que o endereco está sendo atualizado.
            return enderecoRepository.save(endereco); // Atualiza o endereco no repositório.
        }
    }

    @Override
    public void delete(Endereco endereco) throws RuntimeException {
        if(endereco == null ){
            log.error("Erro ao deletar endereco: endereco é nulo"); // Registra um erro se o endereco for nulo.
            throw new RuntimeException("Dados do endereco não preenchidos"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else {
            log.info("Deletando o Objeto Enderecos: {}", endereco); // Registra uma mensagem indicando que o endereco está sendo deletado.
            enderecoRepository.delete(endereco); // Deleta o endereco do repositório.
        }
    }

    @Override
    public Endereco findById(EnderecoId id) throws RuntimeException {
        if (id == null) {
            log.error("Erro ao buscar endereco por ID: ID é nulo"); // Registra um erro se o ID for nulo.
            throw new RuntimeException("ID do Endereco não fornecido"); // Lança uma exceção com uma mensagem de erro apropriada.
        }
        else{
            log.info("Buscando Enderecos por ID: {}", id); // Registra uma mensagem indicando que o endereco está sendo buscado pelo ID.
            return enderecoRepository.findById(id).orElse(null); // Busca o endereco no repositório pelo ID.
        }
    }

    @Override
    public List<Endereco> findAll() throws RuntimeException {
        log.info("Buscando todos os Enderecos"); // Registra uma mensagem indicando que todos os enderecos estão sendo buscados.
        return enderecoRepository.findAll(); // Busca todos os enderecos no repositório.
    }
}
