package br.com.ifba.prg03_scedu.config;

import br.com.ifba.prg03_scedu.usuario.view.UsuarioCadastrar;
import javax.swing.JFrame;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerConfig implements ApplicationRunner {

    private final UsuarioCadastrar usuarioCadastrar;

    public ApplicationRunnerConfig(UsuarioCadastrar usuarioCadastrar) {
        this.usuarioCadastrar = usuarioCadastrar;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        javax.swing.SwingUtilities.invokeLater(() -> {
            usuarioCadastrar.setVisible(true);
            usuarioCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
