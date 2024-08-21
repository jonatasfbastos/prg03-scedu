package br.com.ifba.prg03_scedu;

import br.com.ifba.prg03_scedu.professor.view.ProfessorView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Prg03SceduApplication {

	@Autowired
    /*Repositório com bean do spring boot*/
    
	public static void main(String[] args) {
          ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(ProfessorView.class)
                .headless(false).run(args);
        
            ProfessorView telalistar = context.getBean(ProfessorView.class);
            telalistar.setVisible(true); 
    }
}
