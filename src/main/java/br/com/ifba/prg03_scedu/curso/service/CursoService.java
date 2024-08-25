package br.com.ifba.prg03_scedu.curso.service;

import br.com.ifba.prg03_scedu.curso.dao.CursoIDao;
import br.com.ifba.prg03_scedu.curso.entity.Curso;
import br.com.ifba.prg03_scedu.infrastructure.util.StringUtil;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class CursoService implements CursoIService {

    // Injeção de dependência para o DAO de Curso usando o Lombok @RequiredArgsConstructor
    private final CursoIDao cursoDao;

    // Logger para registrar atividades e eventos
    private static final Logger LOGGER = LoggerFactory.getLogger(CursoService.class);
    
    
    @Override
    public Curso save(Curso curso) throws RuntimeException {
        LOGGER.info("Salvando curso: {}", curso);  // Loga a tentativa de salvar o curso
        
        if (curso.getDescricao() == null || curso.getDescricao().isEmpty()) {
        LOGGER.error("Descrição do curso não pode ser nula ou vazia.");
        throw new RuntimeException("Descrição do curso é obrigatória.");
    }
    
    if (curso.getModalidade() == null || curso.getModalidade().isEmpty()) {
        LOGGER.error("Modalidade do curso não pode ser nula ou vazia.");
       throw new RuntimeException("Modalidade do curso é obrigatória.");
    }
    
    if (curso.getCargaHoraria() <= 0) {
        LOGGER.error("Carga horária deve ser maior que zero.");
        throw new RuntimeException("Carga horária inválida.");
    }
        // Verifica se o curso é nulo
        if (curso == null) {
            LOGGER.error("Tentativa de salvar um curso nulo.");
            throw new RuntimeException(StringUtil.getNullCourseError());
            
        // Verifica se o curso já existe (tem ID)
        } else if (curso.getId() != null) {
            LOGGER.error("Tentativa de salvar um curso que já existe: {}", curso);
            throw new RuntimeException(StringUtil.getExistingCourseError());
        } else {
            // Salva o curso no banco de dados
            Curso savedCurso = cursoDao.save(curso);
            LOGGER.info("Curso salvo com sucesso: {}", savedCurso);  // Loga o sucesso da operação
            return savedCurso;
        }
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException {
        LOGGER.info("Atualizando curso: {}", curso);  // Loga a tentativa de atualizar o curso

        // Verifica se o curso é nulo
        if (curso == null) {
            LOGGER.error("Tentativa de atualizar um curso nulo.");
            throw new RuntimeException(StringUtil.getNullCourseError());
        } else {
            // Atualiza o curso no banco de dados
            Curso updatedCurso = cursoDao.save(curso);
            LOGGER.info("Curso atualizado com sucesso: {}", updatedCurso);  // Loga o sucesso da operação
            return updatedCurso;
        }
    }

    @Override
    public void delete(Curso curso) throws RuntimeException {
        LOGGER.info("Deletando curso: {}", curso);  // Loga a tentativa de deletar o curso

        // Verifica se o curso é nulo
        if (curso == null) {
            LOGGER.error("Tentativa de deletar um curso nulo.");
            throw new RuntimeException(StringUtil.getNullCourseError());
        } else {
            // Deleta o curso do banco de dados
            cursoDao.delete(curso);
            LOGGER.info("Curso deletado com sucesso.");  // Loga o sucesso da operação
        }
    }

    @Override
    public Curso findById(Long id) throws RuntimeException {
        LOGGER.info("Buscando curso por ID: {}", id);  // Loga a tentativa de buscar o curso por ID

        // Verifica se o ID é nulo
        if (id == null) {
            LOGGER.error("Tentativa de buscar um curso com ID nulo.");
            throw new RuntimeException(StringUtil.getNullIdError());
        } else {
            // Busca o curso no banco de dados pelo ID
            Optional<Curso> cursoObj = cursoDao.findById(id);
            if (cursoObj.isPresent()) {
                LOGGER.info("Curso encontrado: {}", cursoObj.get());  // Loga o curso encontrado
                return cursoObj.get();
            } else {
                LOGGER.warn("Curso com ID {} não encontrado.", id);  // Loga se o curso não for encontrado
                throw new RuntimeException("Curso não encontrado.");
            }
        }
    }

    @Override
    public List<Curso> findByNome(String nome) throws RuntimeException {
        LOGGER.info("Buscando cursos por nome: {}", nome);  // Loga a tentativa de buscar cursos pelo nome

        // Verifica se o nome é nulo ou vazio
        if (nome == null || nome.isEmpty()) {
            LOGGER.error("Tentativa de buscar cursos com nome nulo ou vazio.");
            throw new RuntimeException(StringUtil.getNullNameError());
        } else {
            // Busca os cursos no banco de dados pelo nome
            List<Curso> cursos = cursoDao.findByNome(nome);
            LOGGER.info("Cursos encontrados: {}", cursos);  // Loga os cursos encontrados
            return cursos;
        }
    }

    @Override
    public List<Curso> findAll() throws RuntimeException {
        LOGGER.info("Buscando todos os cursos.");  // Loga a tentativa de buscar todos os cursos

        // Busca todos os cursos no banco de dados
        List<Curso> cursos = cursoDao.findAll();
        LOGGER.info("Total de cursos encontrados: {}", cursos.size());  // Loga a quantidade de cursos encontrados
        return cursos;
        
    }
    @Override
    public List<Curso> findByDescricao(String descricao)throws RuntimeException {
        LOGGER.info("Buscando cursos por descrição: {}", descricao);

        if (descricao == null || descricao.isEmpty()) {
            LOGGER.error("Tentativa de buscar cursos com descrição nula ou vazia.");
            throw new RuntimeException("Descrição não pode ser nula ou vazia.");
        } else {
            List<Curso> cursos = cursoDao.findByDescricao(descricao);
            LOGGER.info("Cursos encontrados: {}", cursos);
            return cursos;
        }
    }
    @Override
    public List<Curso> findByModalidade(String modalidade)throws RuntimeException {
        LOGGER.info("Buscando cursos por modalidade: {}", modalidade);

        if (modalidade == null || modalidade.isEmpty()) {
            LOGGER.error("Tentativa de buscar cursos com modalidade nula ou vazia.");
            throw new RuntimeException("Modalidade não pode ser nula ou vazia.");
        } else {
            List<Curso> cursos = cursoDao.findByModalidade(modalidade);
            LOGGER.info("Cursos encontrados: {}", cursos);
            return cursos;
        }
    }
    @Override
    public List<Curso> findByCargaHoraria(int cargaHoraria)throws RuntimeException {
        LOGGER.info("Buscando cursos por carga horária: {}", cargaHoraria);

        // Assumindo que cargaHoraria pode ser 0, então não verifica se é nulo
        List<Curso> cursos = cursoDao.findByCargaHoraria(cargaHoraria);
        LOGGER.info("Cursos encontrados: {}", cursos);
        return cursos;
    }
}
