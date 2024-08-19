package br.com.ifba.prg03_scedu;

import br.com.ifba.prg03_scedu.usuario.view.UsuarioListar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Prg03SceduApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(Prg03SceduApplication.class)
                .headless(false).run(args);
        
           UsuarioListar telalistar = context.getBean(UsuarioListar.class);
           telalistar.setVisible(true);
            
    }
}