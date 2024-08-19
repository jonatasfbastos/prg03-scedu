
package br.com.ifba.prg03_scedu.usuario.view;

import br.com.ifba.prg03_scedu.usuario.controller.UsuarioController;
import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UsuarioCadastrar extends javax.swing.JFrame {

    @Autowired
    private UsuarioController usuarioController;

     @Autowired
    public UsuarioCadastrar(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarButtomc = new javax.swing.JButton();
        cadastrarButtomc = new javax.swing.JButton();
        nomeTextfc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailTextfc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        senhaTextfc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        acessSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        voltarButtomc.setText("Voltar");
        voltarButtomc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtomcActionPerformed(evt);
            }
        });

        cadastrarButtomc.setText("Cadastrar");
        cadastrarButtomc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtomcActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        jLabel3.setText("Senha:");

        acessSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"Administrador", "Gerente", "Suporte", "Convidado"}));

        jLabel4.setText("Nível de Acesso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acessSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(emailTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(cadastrarButtomc)
                                    .addGap(18, 18, 18)
                                    .addComponent(voltarButtomc))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(senhaTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acessSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButtomc)
                    .addComponent(cadastrarButtomc))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarButtomcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtomcActionPerformed
        // TODO add your handling code here:
        try {
            // Capturando os valores dos campos de texto e spinner
            String nome = nomeTextfc.getText();
            String email = emailTextfc.getText();
            String senha = senhaTextfc.getText();
            String nivelAcesso = acessSpinner.getValue().toString();

            // Criando um objeto Usuario com os valores capturados
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setNivelAcesso(nivelAcesso);

            // Chamando o método save do controller para salvar o usuário
            usuarioController.save(usuario);

            // Exibindo mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");

        } catch (Exception e) {
            // Exibindo mensagem de erro caso ocorra uma exceção
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarButtomcActionPerformed

    private void voltarButtomcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtomcActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_voltarButtomcActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner acessSpinner;
    private javax.swing.JButton cadastrarButtomc;
    private javax.swing.JTextField emailTextfc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeTextfc;
    private javax.swing.JTextField senhaTextfc;
    private javax.swing.JButton voltarButtomc;
    // End of variables declaration//GEN-END:variables
}
