package br.com.ifba.prg03_scedu;


import br.com.ifba.prg03_scedu.usuario.view.TelaLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Prg03SceduApplication{
    @Autowired
    /*Repositório com bean do spring boot*/
    
    public static void main(String[] args) {
        // Cria e configura o contexto da aplicação Spring
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Prg03SceduApplication.class)
                .headless(false)  // Permite que a aplicação use uma interface gráfica, desativando o modo "headless".
                .run(args);       // Inicializa o contexto da aplicação Spring com os argumentos fornecidos.

        // Obtém o bean `TelaLogin` do contexto Spring
        TelaLogin telaLogin = context.getBean(TelaLogin.class);

        // Torna a tela de login visível para o usuário
        telaLogin.setVisible(true);

        // Traz a tela de login para a frente, garantindo que ela esteja no topo das outras janelas abertas
        telaLogin.toFront();
    }
}
