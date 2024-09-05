
package br.com.ifba.prg03_scedu.curso.repository;

import br.com.ifba.prg03_scedu.curso.entity.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



//Interface que herda as informações de GenericIDao
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
    //Função de procurar na base de dados pelo nome
    public List<Curso> findByNome(String nomeCurso);
    public List<Curso> findByDescricao(String descricao);
    public List<Curso> findByModalidade(String modalidade);
    public List<Curso> findByCargaHoraria(int cargaHoraria);
}
