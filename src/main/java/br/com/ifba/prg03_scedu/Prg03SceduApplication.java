package br.com.ifba.prg03_scedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Prg03SceduApplication {

	public static void main(String[] args) {
            
            // Cria um contexto de aplicação Spring com a classe Application como configuração principal
        // O método headless(false) indica que a aplicação pode interagir com um ambiente gráfico
        ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class)
            .headless(false)
            .run(args);

        /*// Obtém o bean CursoListar do contexto Spring e o torna visível
        CursoListar telaListar = context.getBean(CursoListar.class);
        telaListar.setVisible(true);
		SpringApplication.run(Prg03SceduApplication.class, args);*/
	}

}
