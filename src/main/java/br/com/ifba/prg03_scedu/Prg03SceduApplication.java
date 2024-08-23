package br.com.ifba.prg03_scedu;

import br.com.ifba.gestaoalunos.view.TelaListar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "br.com.ifba.gestaoalunos")
//@ComponentScan(basePackages = "br.com.ifba.gestaoalunos.view")
public class Prg03SceduApplication {

    private static final Logger log = LoggerFactory.getLogger(Prg03SceduApplication.class); // Cria um logger para registrar mensagens.

    public static void main(String[] args) {
        // Registra uma mensagem indicando que a aplicação está iniciando.
        log.info("Iniciando a aplicação...");

        // Cria e configura o contexto da aplicação Spring, permitindo que a aplicação seja executada em modo headless (sem interface gráfica).
        ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class)
            .headless(false)
            .run(args);
        // Registra uma mensagem indicando que a aplicação foi iniciada com sucesso.
        log.info("Aplicação iniciada com sucesso.");

        // Obtém o bean CursoListar do contexto da aplicação Spring.
        TelaListar telaListar = context.getBean(TelaListar.class);
        
        // Registra uma mensagem indicando que a tela de listagem de cursos será exibida.
        log.info("Exibindo a tela de listagem de cursos.");
        
        // Torna a tela de listagem de cursos visível.
        telaListar.setVisible(true);
    }
}
