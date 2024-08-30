/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.util;

/**
 *
 * @author rian1
 */
public class StringUtil {
    // Define mensagens de erro constantes para uso em outros lugares
    private static final String NULL_ID_ERROR = "ID da avaliacao não fornecido."; 
    // Mensagem de erro quando o ID da avaliação não é fornecido.
    private static final String NULL_NAME_ERROR = "Nome da avaliacao não fornecida."; 
    // Mensagem de erro quando o nome da avaliação não é fornecido.
    private static final String NULL_AVALIACAO_ERROR = "Dados da avaliacao não preenchidos/Avaliacao não existente."; 
    // Mensagem de erro quando os dados da avaliação não estão preenchidos ou a avaliação não existe.
    private static final String EXISTING_AVALIACAO_ERROR = "Avaliacao já existente no banco de dados."; 
    // Mensagem de erro quando a avaliação já existe no banco de dados.
    private static final String NULL_DATE_ERROR = "Data da avaliacao não fornecida."; 
    // Mensagem de erro quando a data da avaliação não é fornecida.

    // Construtor privado para evitar a instância da classe
    private StringUtil() {
        // Construtor privado impede a criação de instâncias da classe utilitária
    }
    
    // Retorna a mensagem de erro para ID não fornecido
    public static String getNullIdError() {
        return NULL_ID_ERROR;
    }

    // Retorna a mensagem de erro para nome não fornecido
    public static String getNullNameError() {
        return NULL_NAME_ERROR;
    }

    // Retorna a mensagem de erro para dados da avaliação não preenchidos ou avaliação não existente
    public static String getNullAvaliacaoError() {
        return NULL_AVALIACAO_ERROR;
    }

    // Retorna a mensagem de erro para avaliação já existente
    public static String getExistingAvaliacaoError() {
        return EXISTING_AVALIACAO_ERROR;
    }
    
    // Retorna a mensagem de erro para data não fornecida
    public static String getNullDateError() {
        return NULL_DATE_ERROR;
    }
}