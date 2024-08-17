/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.util;

/**
 *
 * @author Flavio Junior
 */

//Informações serão colacadas no final
public class StringUtil {
    private static final String NULL_ID_ERROR = "ID do Disciplina não fornecido.";
    private static final String NULL_NAME_ERROR = "Nome da Disciplina não fornecido.";
    private static final String NULL_COURSE_ERROR = "Dados do Disciplina não preenchidos.";
    private static final String EXISTING_COURSE_ERROR = "Disciplina já existente no banco de dados.";


    // Prevent instantiation
    private StringUtil() {
    }

    public static String getNullIdError() {
        return NULL_ID_ERROR;
    }

    public static String getNullNameError() {
        return NULL_NAME_ERROR;
    }

    public static String getNullDisciplinaError() {
        return NULL_COURSE_ERROR;
    }

    public static String getExistingDisciplinaError() {
        return EXISTING_COURSE_ERROR;
    }

}
