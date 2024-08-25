/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.usuario.view;

import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.curriculo.controller.CurriculoIController;
import br.com.ifba.prg03_scedu.curso.controller.CursoIController;
import br.com.ifba.prg03_scedu.escola.controller.EscolaIController;
import br.com.ifba.prg03_scedu.faltas.controller.GestaoFaltasIController;
import br.com.ifba.prg03_scedu.home.view.TelaInicial;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioIController;
import br.com.ifba.prg03_scedu.util.CredenciaisManager;
import jakarta.annotation.PostConstruct;
import javax.swing.JOptionPane;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    private final CurriculoIController curriculoController;
    private final UsuarioIController usuarioController;
    private final CredenciaisManager credenciaisManager;
    private final DisciplinaIController disciplinaController;
    private final CursoIController cursoController;
    private final GestaoFaltasIController gestaoFaltasController;
    private final EscolaIController escolaController;

    public TelaLogin(
            CurriculoIController curriculoController,
            UsuarioIController usuarioController, 
            CredenciaisManager credenciaisManager, 
            DisciplinaIController disciplinaController,
            CursoIController cursoController,
            GestaoFaltasIController gestaoFaltasController,
            EscolaIController escolaController
    ) {
        this.curriculoController = curriculoController;
        this.usuarioController = usuarioController;
        this.credenciaisManager = credenciaisManager;
        this.disciplinaController = disciplinaController;
        this.cursoController = cursoController;
        this.gestaoFaltasController = gestaoFaltasController;
        this.escolaController = escolaController;
    }

    @PostConstruct
    private void init() {
        initComponents();

        String[] credenciais = credenciaisManager.carregarCredenciais();

        if (credenciais != null) {
            tfEmail.setText(credenciais[0]);  // Preenche o campo de e-mail
            pfSenha.setText(credenciais[1]);  // Preenche o campo de senha
            cbLembrarDeMim.setSelected(true); // Marca a checkbox "Lembrar de mim"
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCriarConta = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        pfSenha = new javax.swing.JPasswordField();
        cbLembrarDeMim = new javax.swing.JCheckBox();
        btnEsqueceuASenha = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(8, 102, 255));
        jLayeredPane1.setOpaque(true);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setText("    Bem-Vindo Novamente");

        jLabel2.setText("Email");

        jLabel3.setText("Senha");

        btnCriarConta.setBackground(new java.awt.Color(204, 204, 204));
        btnCriarConta.setText("Criar conta");
        btnCriarConta.setBorder(null);
        btnCriarConta.setOpaque(true);
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(8, 102, 255));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        cbLembrarDeMim.setText("Lembrar de mim");

        btnEsqueceuASenha.setText("Esqueceu a senha?");
        btnEsqueceuASenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueceuASenhaActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(tfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCriarConta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnEntrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(pfSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cbLembrarDeMim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnEsqueceuASenha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbLembrarDeMim)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(btnEsqueceuASenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEsqueceuASenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbLembrarDeMim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        /*try {

            // Obtém a senha do JPasswordField como um array de caracteres
            char[] senhaArray = pfSenha.getPassword();

            // Converte o array de caracteres em uma string
            String senha = new String(senhaArray);
            String email = tfEmail.getText();
            Usuario usuario = usuarioController.login(email, senha);
            
            if (cbLembrarDeMim.isSelected()) {
                credenciaisManager.salvarCredenciais(email, senha);
            } else {
                credenciaisManager.limparCredenciais();
            }

            // Limpa o array de caracteres após o uso para segurança
            Arrays.fill(senhaArray, ' ');*/

            TelaInicial telaInicial = new TelaInicial(disciplinaController, curriculoController, gestaoFaltasController, cursoController, usuarioController, escolaController);
            telaInicial.setVisible(true);
            telaInicial.toFront();
            this.dispose();

        /*} catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro no login", JOptionPane.WARNING_MESSAGE);
        }
        */
            this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        UsuarioCadastrar usuarioCadastrar = new UsuarioCadastrar(usuarioController);
        usuarioCadastrar.setVisible(true);
        usuarioCadastrar.toFront();
    }//GEN-LAST:event_btnCriarContaActionPerformed

    private void btnEsqueceuASenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueceuASenhaActionPerformed
        try{
            usuarioController.recuperarSenha(tfEmail.getText());
                JOptionPane.showMessageDialog(null, "Um e-mail com a sua senha atual foi enviado para " + tfEmail.getText(), "Solicitação Concluída", JOptionPane.INFORMATION_MESSAGE);
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na recuperação de senha", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEsqueceuASenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class)
            .headless(false)
            .run(args);

            TelaLogin telaLogin = context.getBean(TelaLogin.class);
            telaLogin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueceuASenha;
    private javax.swing.JCheckBox cbLembrarDeMim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
