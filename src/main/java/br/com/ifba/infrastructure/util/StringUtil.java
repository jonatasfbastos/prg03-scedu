
package br.com.ifba.infrastructure.util;

/**
 *
 * @author batis
 */
public class StringUtil {
    private static final String NULL_COURSE_ERROR = "Dados do Curso não preenchidos.";
    private static final String EXISTING_COURSE_ERROR = "Curso já existente no banco de dados.";
    private static final String COURSE_NOT_FOUND_ERROR = "Curso não encontrado para o ID: ";
    private static final String NO_COURSES_FOUND_ERROR = "Nenhum curso encontrado.";
    private static final String NO_COURSES_FOUND_NAME_ERROR = "Nenhum curso encontrado com o nome: ";
    private static final String FIND_BY_ID_ERROR = "Erro ao buscar o curso por ID: ";
    private static final String FIND_BY_NAME_ERROR = "Erro ao buscar cursos pelo nome: ";
    private static final String FIND_ALL_ERROR = "Erro ao buscar todos os cursos.";
    private static final String SAVE_ERROR = "Erro ao salvar o curso.";
    private static final String DELETE_ERROR = "Erro ao deletar o curso.";
    private static final String UPDATE_ERROR = "Erro ao alterar o curso.";
    
    public static String getDELETE_ERROR() {
        return DELETE_ERROR;
    }

    public static String getUPDATE_ERROR() {
        return UPDATE_ERROR;
    }

    public static String getNullCourseError() {
        return NULL_COURSE_ERROR;
    }

    public static String getExistingCourseError() {
        return EXISTING_COURSE_ERROR;
    }

    public static String getCourseNotFoundError(Long id) {
        return COURSE_NOT_FOUND_ERROR + id;
    }

    public static String getNoCoursesFoundError() {
        return NO_COURSES_FOUND_ERROR;
    }

    public static String getNoCoursesFoundNameError(String nome) {
        return NO_COURSES_FOUND_NAME_ERROR + nome;
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
