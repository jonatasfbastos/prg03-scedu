
package br.com.ifba.prg03_scedu.endereco.controller;

import br.com.ifba.prg03_scedu.endereco.entity.Endereco;
import br.com.ifba.prg03_scedu.endereco.entity.EnderecoId;
import br.com.ifba.prg03_scedu.endereco.service.EnderecoIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class EnderecoController implements EnderecoIController{
    private final EnderecoIService enderecoService; // Injeta o serviço de enderecos.

    @Override
    public Endereco save(Endereco endereco) throws RuntimeException {
        // Chama o serviço para salvar um endereco.
        return enderecoService.save(endereco);
    }

    @Override
    public Endereco update(Endereco endereco) throws RuntimeException {
        // Chama o serviço para atualizar um endereco.
        return enderecoService.update(endereco);
    }

    @Override
    public void delete(Endereco endereco) throws RuntimeException {
        // Chama o serviço para deletar um endereco.
        enderecoService.delete(endereco);
    }

    @Override
    public Endereco findById(EnderecoId id) throws RuntimeException {
        // Chama o serviço para encontrar um endereco pelo ID.
        return enderecoService.findById(id);
    }

    @Override
    public List<Endereco> findAll() throws RuntimeException {
        // Chama o serviço para listar todos os enderecos.
        return enderecoService.findAll();
    }
}
