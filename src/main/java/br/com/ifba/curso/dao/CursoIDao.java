
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



//Interface que herda as informações de GenericIDao
@Repository
public interface CursoIDao extends JpaRepository<Curso, Long>{
    
    //Função de procurar na base de dados pelo nome
    public List<Curso> findByNome(String nomeCurso);
}
