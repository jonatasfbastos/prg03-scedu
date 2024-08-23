package br.com.ifba.prg03_scedu;

import br.com.ifba.prg03_scedu.curso.view.CursoListar; // Importa a classe CursoListar que representa uma tela na aplicação
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importa a anotação para indicar uma aplicação Spring Boot
import org.springframework.boot.builder.SpringApplicationBuilder; // Importa a classe usada para configurar e iniciar a aplicação Spring Boot
import org.springframework.context.ConfigurableApplicationContext; // Importa a interface que representa o contexto da aplicação configurável

@SpringBootApplication // Anotação que marca a classe como uma configuração de aplicação Spring Boot
public class Prg03SceduApplication {

    public static void main(String[] args) {
        // Cria e configura o contexto da aplicação Spring Boot
        ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class) // Inicia a construção da aplicação Spring com a classe Application como base
            .headless(false) // Define que a aplicação pode ter uma interface gráfica (não é executada em modo "headless")
            .run(args); // Executa a aplicação com os argumentos fornecidos

        // Obtém o bean CursoListar do contexto da aplicação
        CursoListar telaListar = context.getBean(CursoListar.class);
        // Torna a tela visível
        telaListar.setVisible(true);
    }
}
