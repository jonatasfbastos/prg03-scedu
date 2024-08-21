package br.com.ifba.prg03_scedu;

import br.com.ifba.gestaofaltas.view.TelaListar; // Importa a classe TelaListar que representa uma tela na aplicação
import javax.swing.SwingUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.ifba.gestaofaltas.view")
@EntityScan(basePackages = "br.com.ifba.gestaofaltas.entity")
@EnableJpaRepositories(basePackages = "br.com.ifba.gestaofaltas.repository")
public class Prg03SceduApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(Prg03SceduApplication.class)
                        .headless(false)
                        .run(args);

        TelaListar telaListar = context.getBean(TelaListar.class);
        telaListar.setVisible(true);
    }
}
