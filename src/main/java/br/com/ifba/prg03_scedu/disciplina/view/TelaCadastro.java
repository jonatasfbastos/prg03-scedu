/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.view;

import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;

/**
 *
 * @author Flavio Junior
 */
public class TelaCadastro extends javax.swing.JFrame {

    private final DisciplinaIController disciplinaController;
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro(DisciplinaIController disciplinaController) {
        initComponents();
        this.disciplinaController = disciplinaController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblAbreviado = new javax.swing.JLabel();
        txtAbreviado = new javax.swing.JTextField();
        lblCargaHoraria = new javax.swing.JLabel();
        txtCargaHoraria = new javax.swing.JTextField();
        lblBaseCurricular = new javax.swing.JLabel();
        cmbBaseCurricular = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 89, 152));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Digite o nome da disciplina:");

        txtNome.setBackground(new java.awt.Color(0, 102, 153));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));

        lblAbreviado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAbreviado.setForeground(new java.awt.Color(255, 255, 255));
        lblAbreviado.setText("Digite o nome abreviado da disciplina:");

        txtAbreviado.setBackground(new java.awt.Color(0, 102, 153));
        txtAbreviado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAbreviado.setForeground(new java.awt.Color(255, 255, 255));

        lblCargaHoraria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCargaHoraria.setForeground(new java.awt.Color(255, 255, 255));
        lblCargaHoraria.setText("Digite a carga horária da disciplina:");

        txtCargaHoraria.setBackground(new java.awt.Color(0, 102, 153));
        txtCargaHoraria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCargaHoraria.setForeground(new java.awt.Color(255, 255, 255));

        lblBaseCurricular.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBaseCurricular.setForeground(new java.awt.Color(255, 255, 255));
        lblBaseCurricular.setText("Selecione a base curricular da disciplina:");

        cmbBaseCurricular.setBackground(new java.awt.Color(0, 102, 153));
        cmbBaseCurricular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbBaseCurricular.setForeground(new java.awt.Color(255, 255, 255));
        cmbBaseCurricular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Diversificada", "Profissional", "Religioso" }));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Selecione o estador da disciplina:");

        cmbEstado.setBackground(new java.awt.Color(0, 102, 153));
        cmbEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbEstado.setForeground(new java.awt.Color(255, 255, 255));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 153, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelar.setText("Voltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbreviado)
                            .addComponent(lblCargaHoraria)
                            .addComponent(lblNome)
                            .addComponent(lblBaseCurricular)
                            .addComponent(lblEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbBaseCurricular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome)
                            .addComponent(txtAbreviado)
                            .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbreviado)
                    .addComponent(txtAbreviado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargaHoraria)
                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBaseCurricular)
                    .addComponent(cmbBaseCurricular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstado)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        // Cria uma nova instância da classe Curso e define seus atributos com base nos campos da interface gráfica
        Disciplina disciplina = new Disciplina();

        disciplina.setNome(txtNome.getText());
        disciplina.setNomeAbreviado(txtAbreviado.getText());
        disciplina.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
        //disciplina.setBaseCurricular();
        
        
        String baseCurricular = cmbBaseCurricular.getSelectedItem().toString();
        
        
        switch (baseCurricular) {
            case "Nacional": 
                disciplina.setBaseCurricular("Nacional");
                break;
            
            case "Diversificada": 
                disciplina.setBaseCurricular("Diversificada");
                break;
            
            case "Profissional": 
                disciplina.setBaseCurricular("Profissional");
                break;
            
            case "Religioso": 
                disciplina.setBaseCurricular("Religiosa");
                break;
            
            default:
                // Pode ser interessante tratar um valor inválido ou lançar uma exceção se for necessário
                throw new IllegalArgumentException("Base Curricular inválida: " + baseCurricular);
        }

        String estado = cmbEstado.getSelectedItem().toString();
        
        if(estado.equals("ATIVO")){
            disciplina.setEstado(true);
        }
        else
            disciplina.setEstado(false);

        
        
        disciplinaController.save(disciplina);
        
        // Fecha a janela atual após a operação de inserção ter sido concluída com sucesso
        this.dispose();
     
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbBaseCurricular;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbreviado;
    private javax.swing.JLabel lblBaseCurricular;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtAbreviado;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}