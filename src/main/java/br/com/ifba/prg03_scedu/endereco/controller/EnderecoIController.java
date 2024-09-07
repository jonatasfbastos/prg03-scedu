
package br.com.ifba.prg03_scedu.endereco.controller;

import br.com.ifba.prg03_scedu.endereco.entity.Endereco;
import br.com.ifba.prg03_scedu.endereco.entity.EnderecoId;
import java.util.List;

public interface EnderecoIController {
    public abstract Endereco save(Endereco endereco) throws RuntimeException;
    public abstract Endereco update(Endereco endereco) throws RuntimeException;
    public abstract void delete(Endereco endereco) throws RuntimeException;
    public abstract Endereco findById(EnderecoId id) throws RuntimeException;
    public List<Endereco> findAll() throws RuntimeException;
}
