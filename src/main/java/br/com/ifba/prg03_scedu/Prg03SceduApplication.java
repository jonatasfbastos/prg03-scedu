package br.com.ifba.prg03_scedu;

import br.com.ifba.gestaoescolas.view.ListaEscola;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

  @SpringBootApplication(scanBasePackages = "br.com.ifba.gestaoescolas.view")
  //@EnableJpaRepositories(basePackages = "br.com.ifba.gestaoescolas.repository")
  //@EntityScan(basePackages = "br.com.ifba.gestaoescolas.entity")  
  public class Prg03SceduApplication {

    public static void main(String[] args) {
    //SpringApplication.run(Prg03SceduApplication.class, args);
        ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class).headless(false).run(args); // Configura e inicia o contexto da aplicação Spring, desabilit
            
        ListaEscola listaEscola = context.getBean(ListaEscola.class); // Obtém o bean CursoListar do
        listaEscola.setVisible(true); // Define a visibilidade da tela Cursolistar como verdadeira
    }
 }