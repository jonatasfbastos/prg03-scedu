/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.usuario.view;

import br.com.ifba.prg03_scedu.Prg03sceduApplication;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioController;
import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UsuarioEditar extends javax.swing.JFrame {

    private final UsuarioController usuarioController;
    private final Usuario usuario;
    private boolean senhaVisivel = false; // Controle de visibilidade da senha

    public UsuarioEditar(UsuarioController usuarioController, Usuario usuario) {
            this.usuarioController = usuarioController;
            this.usuario = usuario; // Armazena o usuário
            initComponents();
            if (usuario != null) {
                nomeTextfc.setText(usuario.getNome());
                emailTextfd.setText(usuario.getEmail());
                senhaTextfd.setText(usuario.getSenha());
                editarComboBox.setSelectedItem(usuario.getNivelAcesso());
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nomeTextfc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailTextfd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        senhaTextfd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        voltarButtomd = new javax.swing.JButton();
        salvarButtomd = new javax.swing.JButton();
        editarComboBox = new javax.swing.JComboBox<>();
        PasswordFieldEditar = new javax.swing.JPasswordField();
        verButtomEd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(8, 102, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        nomeTextfc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome:");

        emailTextfd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Email:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editcad.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        senhaTextfd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        senhaTextfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextfdActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha:");

        jLabel4.setText("Nível de Acesso:");

        voltarButtomd.setText("Voltar");
        voltarButtomd.setBorder(null);
        voltarButtomd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtomdActionPerformed(evt);
            }
        });

        salvarButtomd.setBackground(new java.awt.Color(8, 102, 255));
        salvarButtomd.setForeground(new java.awt.Color(255, 255, 255));
        salvarButtomd.setText("Salvar");
        salvarButtomd.setBorder(null);
        salvarButtomd.setMaximumSize(new java.awt.Dimension(98, 34));
        salvarButtomd.setMinimumSize(new java.awt.Dimension(98, 34));
        salvarButtomd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtomdActionPerformed(evt);
            }
        });

        editarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Suporte", "Convidado" }));
        editarComboBox.setBorder(null);

        PasswordFieldEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldEditarActionPerformed(evt);
            }
        });

        verButtomEd.setText("ver");
        verButtomEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verButtomEdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emailTextfd, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(senhaTextfd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(salvarButtomd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(voltarButtomd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PasswordFieldEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verButtomEd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextfd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senhaTextfd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(editarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordFieldEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verButtomEd))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButtomd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButtomd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtomdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtomdActionPerformed
        // TODO add your handling code here:
            dispose();
            // Verifica se já existe uma instância aberta de CursoListar
            UsuarioListar usuarioListar = null;
            for (java.awt.Window window : java.awt.Window.getWindows()) {
                if (window instanceof UsuarioListar) {
                    usuarioListar = (UsuarioListar) window;
                    break;
                }
            }
            // Se encontrou uma instância de CursoListar, atualiza a tabela
            if (usuarioListar != null) {
                usuarioListar.carregarUsuarios();
            }
    }//GEN-LAST:event_voltarButtomdActionPerformed

    private void salvarButtomdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtomdActionPerformed
        // TODO add your handling code here:
            try {
            // Capturando os valores dos campos de texto e spinner
            String nome = nomeTextfc.getText();
            String email = emailTextfd.getText();
            String senha = senhaTextfd.getText();
            String nivelAcesso = (String) editarComboBox.getSelectedItem();


            // Verifica se o novo e-mail já está em uso por outro usuário
            if (usuarioController.existsByEmail(email) && !email.equals(usuario.getEmail())) {
                JOptionPane.showMessageDialog(this, 
                    "O e-mail já está em uso. Informe um e-mail diferente.", 
                    "E-mail Duplicado", 
                    JOptionPane.WARNING_MESSAGE
                );
                return; // Sai do método para evitar atualizar o usuário com e-mail duplicado
            }

            // Atualizando os valores do usuário existente
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setNivelAcesso(nivelAcesso);

            // Salvando o usuário. O Spring Data JPA vai atualizar se o ID existir.
            usuarioController.update(usuario);

            // Exibindo mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!");

            // Fecha a tela após salvar
            this.dispose();

            // Atualiza a tabela de usuários na tela UsuarioListar, se estiver aberta
            UsuarioListar usuarioListar = null;
            for (java.awt.Window window : java.awt.Window.getWindows()) {
                if (window instanceof UsuarioListar) {
                    usuarioListar = (UsuarioListar) window;
                    break;
                }
            }
            if (usuarioListar != null) {
                usuarioListar.carregarUsuarios();
            }

        } catch (Exception e) {
            // Exibindo mensagem de erro caso ocorra uma exceção
            JOptionPane.showMessageDialog(this, 
                "Erro ao editar o usuário: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_salvarButtomdActionPerformed

    private void verButtomEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verButtomEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verButtomEdActionPerformed

    private void PasswordFieldEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldEditarActionPerformed

    private void senhaTextfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextfdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextfdActionPerformed

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ApplicationContext context = new AnnotationConfigApplicationContext(Prg03sceduApplication.class);
                UsuarioEditar cursoEditar = context.getBean(UsuarioEditar.class);
                cursoEditar.setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordFieldEditar;
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnCriarConta1;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JComboBox<String> editarComboBox;
    private javax.swing.JTextField emailTextfd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeTextfc;
    private javax.swing.JButton salvarButtomd;
    private javax.swing.JTextField senhaTextfd;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmail1;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfSenha1;
    private javax.swing.JButton verButtomEd;
    private javax.swing.JButton voltarButtomd;
    // End of variables declaration//GEN-END:variables
}
