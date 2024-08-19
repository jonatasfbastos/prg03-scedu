/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.usuario.view;

import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioController;
import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author alefm
 */
public class UsuarioListar extends javax.swing.JFrame {

    private final UsuarioController usuarioController;

    public UsuarioListar(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
        initComponents();
        carregarUsuarios();
    }

    private void carregarUsuarios() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pesquisaTextf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cadastroButtom = new javax.swing.JButton();
        RemoverButtom = new javax.swing.JButton();
        editarButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pesquisaTextf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaTextfActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");

        cadastroButtom.setText("Cadastrar");

        RemoverButtom.setText("Remover");
        RemoverButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverButtomActionPerformed(evt);
            }
        });

        editarButtom.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisaTextf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(73, 73, 73)
                        .addComponent(cadastroButtom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarButtom)
                        .addGap(18, 18, 18)
                        .addComponent(RemoverButtom)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaTextf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(cadastroButtom)
                    .addComponent(RemoverButtom)
                    .addComponent(editarButtom))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaTextfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaTextfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaTextfActionPerformed

    private void RemoverButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverButtomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverButtomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
                   public void run() {
                       ApplicationContext context = new AnnotationConfigApplicationContext(Prg03SceduApplication.class);
                       UsuarioListar cursoListar = context.getBean(UsuarioListar.class);
                       cursoListar.setVisible(true);
                       }
               });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoverButtom;
    private javax.swing.JButton cadastroButtom;
    private javax.swing.JButton editarButtom;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pesquisaTextf;
    // End of variables declaration//GEN-END:variables
}
