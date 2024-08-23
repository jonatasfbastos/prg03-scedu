
package br.com.ifba.infrastructure.util;

/**
 *
 * @author batis
 */
public class StringUtil {
    private static final String NULL_STUDENT_ERROR = "Dados do Aluno não preenchidos.";
    private static final String EXISTING_STUDENT_ERROR = "Aluno já existente no banco de dados.";
    private static final String STUDENT_NOT_FOUND_ERROR = "Aluno não encontrado para o ID: ";
    private static final String NO_STUDENT_FOUND_ERROR = "Nenhum aluno encontrado.";
    private static final String NO_STUDENT_FOUND_NAME_ERROR = "Nenhum aluno encontrado com o nome: ";
    private static final String FIND_BY_ID_ERROR = "Erro ao buscar o aluno por ID: ";
    private static final String FIND_BY_NAME_ERROR = "Erro ao buscar alunos pelo nome: ";
    private static final String FIND_ALL_ERROR = "Erro ao buscar todos os alunos.";
    private static final String SAVE_ERROR = "Erro ao salvar o aluno.";
    private static final String DELETE_ERROR = "Erro ao deletar o aluno.";
    private static final String UPDATE_ERROR = "Erro ao alterar o aluno.";
    
    public static String getDELETE_ERROR() {
        return DELETE_ERROR;
    }

    public static String getUPDATE_ERROR() {
        return UPDATE_ERROR;
    }

    public static String getNullCourseError() {
        return NULL_STUDENT_ERROR;
    }

    public static String getExistingCourseError() {
        return EXISTING_STUDENT_ERROR;
    }

    public static String getCourseNotFoundError(Long id) {
        return STUDENT_NOT_FOUND_ERROR + id;
    }

    public static String getNoCoursesFoundError() {
        return NO_STUDENT_FOUND_ERROR;
    }

    public static String getNoCoursesFoundNameError(String nome) {
        return NO_STUDENT_FOUND_NAME_ERROR + nome;
    }

    public static String getFindByIdError(Long id) {
        return FIND_BY_ID_ERROR + id;
    }

    public static String getFindByNameError(String nome) {
        return FIND_BY_NAME_ERROR + nome;
    }

    public static String getFindAllError() {
        return FIND_ALL_ERROR;
    }

    public static String getSaveError() {
        return SAVE_ERROR;
    }

}
