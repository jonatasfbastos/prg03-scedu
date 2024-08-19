/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.usuario.view;

import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioController;
import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UsuarioListar extends javax.swing.JFrame {

    private final UsuarioController usuarioController;
    

public UsuarioListar(UsuarioController usuarioController) {
    this.usuarioController = usuarioController;
    initComponents();
    carregarUsuarios();

    // Adiciona DocumentListener ao campo de texto de pesquisa
    pesquisaTextf.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            atualizarTabela();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            atualizarTabela();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            atualizarTabela();
        }
    });
}

private void atualizarTabela() {
    String pesquisa = pesquisaTextf.getText().trim().toLowerCase();
    List<Usuario> usuarios = usuarioController.findAll();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

    for (Usuario usuario : usuarios) {
        if (usuario.getNome().toLowerCase().contains(pesquisa)) {
            model.insertRow(0, new Object[]{
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getNivelAcesso()
            });
        } else {
            model.addRow(new Object[]{
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getNivelAcesso()
            });
        }
    }
}

public void carregarUsuarios() {
        List<Usuario> usuarios = usuarioController.findAll();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados
        for (Usuario usuario : usuarios) {
            model.addRow(new Object[]{
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getNivelAcesso()
            });
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pesquisaTextf = new javax.swing.JTextField();
        RemoverButtom = new javax.swing.JButton();
        editarButtom = new javax.swing.JButton();
        atualizarButtom = new javax.swing.JButton();
        cadastroButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(8, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "EMAIL", "NÍVEL DE ACESSO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pesquisar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pesquisaTextf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaTextfActionPerformed(evt);
            }
        });

        RemoverButtom.setBackground(new java.awt.Color(255, 51, 51));
        RemoverButtom.setForeground(new java.awt.Color(255, 255, 255));
        RemoverButtom.setText("Remover");
        RemoverButtom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RemoverButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverButtomActionPerformed(evt);
            }
        });

        editarButtom.setBackground(new java.awt.Color(204, 204, 204));
        editarButtom.setForeground(new java.awt.Color(255, 255, 255));
        editarButtom.setText("Editar");
        editarButtom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editarButtom.setMaximumSize(new java.awt.Dimension(53, 22));
        editarButtom.setPreferredSize(new java.awt.Dimension(53, 22));
        editarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtomActionPerformed(evt);
            }
        });

        atualizarButtom.setBackground(new java.awt.Color(204, 204, 204));
        atualizarButtom.setForeground(new java.awt.Color(255, 255, 255));
        atualizarButtom.setText("Atualizar");
        atualizarButtom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atualizarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtomActionPerformed(evt);
            }
        });

        cadastroButtom.setBackground(new java.awt.Color(8, 102, 255));
        cadastroButtom.setForeground(new java.awt.Color(255, 255, 255));
        cadastroButtom.setText("Cadastrar");
        cadastroButtom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cadastroButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(atualizarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pesquisaTextf, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(98, 98, 98)
                        .addComponent(cadastroButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoverButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoverButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesquisaTextf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(cadastroButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 24, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarButtom)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaTextfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaTextfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaTextfActionPerformed

    private void RemoverButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverButtomActionPerformed
        // TODO add your handling code here:
            //LOGGER.info("[{}] Tentando remover usuário...", getCurrentTimestamp());
           try {
               int selectedRow = jTable1.getSelectedRow();
               if (selectedRow >= 0) {
                   Long id = (Long) jTable1.getValueAt(selectedRow, 0);
                   int resposta = JOptionPane.showConfirmDialog(this, 
                           "Você tem certeza de que deseja remover este usuário?", 
                           "Confirmação de Exclusão", 
                           JOptionPane.YES_NO_OPTION, 
                           JOptionPane.WARNING_MESSAGE);
                   if (resposta == JOptionPane.YES_OPTION) {
                       usuarioController.delete(id);
                       carregarUsuarios(); // Atualiza a lista de usuários
                   }
               } else {
                   JOptionPane.showMessageDialog(this, "Selecione um usuário para remover.", "Aviso", JOptionPane.WARNING_MESSAGE);
               }
           } catch (Exception e) {
               //LOGGER.error("[{}] Erro ao remover usuário", getCurrentTimestamp(), e);
               JOptionPane.showMessageDialog(this, "Erro ao remover usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
           }
    }//GEN-LAST:event_RemoverButtomActionPerformed

    private void cadastroButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtomActionPerformed
        // TODO add your handling code here:
       // Criar uma nova instância da tela UsuarioCadastrar
        UsuarioCadastrar usuarioCadastrar = new UsuarioCadastrar(usuarioController);
        // Exibir a tela UsuarioCadastrar
        usuarioCadastrar.setVisible(true);
    }//GEN-LAST:event_cadastroButtomActionPerformed

    private void editarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtomActionPerformed
         int selectedRow = jTable1.getSelectedRow();
             if (selectedRow != -1) {
                    Long usuarioId = (Long) jTable1.getValueAt(selectedRow, 0); // Assumindo que a primeira coluna é o ID
                    Usuario usuario = usuarioController.findById(usuarioId);
                    UsuarioEditar usuarioEditar = new UsuarioEditar(usuarioController, usuario);
                    usuarioEditar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um usuário para editar.");
            }
    }//GEN-LAST:event_editarButtomActionPerformed

    private void atualizarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtomActionPerformed
        // TODO add your handling code here:
         carregarUsuarios();
    }//GEN-LAST:event_atualizarButtomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {ConfigurableApplicationContext context = new SpringApplicationBuilder(Prg03SceduApplication.class)
                    .headless(false)
                    .run(args);
            UsuarioListar usuarioListar = context.getBean(UsuarioListar.class);
            usuarioListar.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoverButtom;
    private javax.swing.JButton atualizarButtom;
    private javax.swing.JButton cadastroButtom;
    private javax.swing.JButton editarButtom;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pesquisaTextf;
    // End of variables declaration//GEN-END:variables
}
