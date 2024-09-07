
package br.com.ifba.prg03_scedu.endereco.repository;

import br.com.ifba.prg03_scedu.endereco.entity.Endereco;
import br.com.ifba.prg03_scedu.endereco.entity.EnderecoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoIRepository extends JpaRepository<Endereco, EnderecoId>{
}
