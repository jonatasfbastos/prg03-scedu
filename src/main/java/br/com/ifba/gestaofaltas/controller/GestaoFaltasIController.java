package br.com.ifba.gestaofaltas.controller;

import br.com.ifba.gestaofaltas.entity.Falta;
import java.util.List;

/**
 * Interface para o controlador de gestão de faltas.
 */
public interface GestaoFaltasIController {

    /**
     * Salva uma nova falta no sistema.
     *
     * @param attendance A falta a ser salva.
     * @return A falta salva, possivelmente com modificações (como ID gerado).
     * @throws RuntimeException Se ocorrer um erro durante a operação de salvamento.
     */
    public abstract Falta save(Falta attendance) throws RuntimeException;

    /**
     * Atualiza as informações de uma falta existente.
     *
     * @param attendance A falta com as informações atualizadas.
     * @return A falta atualizada.
     * @throws RuntimeException Se ocorrer um erro durante a operação de atualização.
     */
    public abstract Falta update(Falta attendance) throws RuntimeException;

    /**
     * Exclui uma falta do sistema.
     *
     * @param attendance A falta a ser excluída.
     * @throws RuntimeException Se ocorrer um erro durante a operação de exclusão.
     */
    public abstract void delete(Falta attendance) throws RuntimeException;

    /**
     * Encontra uma falta pelo seu identificador.
     *
     * @param id O identificador da falta a ser encontrada.
     * @return A falta encontrada ou null se nenhuma falta for encontrada com o ID fornecido.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public abstract Falta findById(Long id) throws RuntimeException;

    /**
     * Encontra todas as faltas de um aluno específico.
     *
     * @param rg O identificador do aluno cujas faltas devem ser buscadas.
     * @return Uma lista de faltas correspondentes ao aluno fornecido.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    //public List<Falta> findByStudentId(Long rg) throws RuntimeException;

    /**
     * Encontra todas as faltas registradas no sistema.
     *
     * @return Uma lista de todas as faltas.
     * @throws RuntimeException Se ocorrer um erro durante a operação de busca.
     */
    public List<Falta> findAll() throws RuntimeException;
}
