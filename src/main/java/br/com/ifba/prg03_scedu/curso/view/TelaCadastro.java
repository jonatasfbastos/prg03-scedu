
package br.com.ifba.prg03_scedu.curso.view;

import br.com.ifba.prg03_scedu.curso.controller.CursoIController;
import br.com.ifba.prg03_scedu.curso.entity.Curso;
import br.com.ifba.prg03_scedu.Prg03sceduApplication;
import javax.swing.JOptionPane;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;



public class TelaCadastro extends javax.swing.JFrame {

    
    private final CursoIController cursoController;

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro(CursoIController cursoController) {
        this.cursoController = cursoController;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param novoCurso
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        txtNomeCurso = new javax.swing.JTextField();
        txtCodCurso = new javax.swing.JTextField();
        lblNomeCurso = new javax.swing.JLabel();
        lblCodCurso = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblStatusCurso = new javax.swing.JLabel();
        cmbStatusCurso = new javax.swing.JComboBox<>();
        txtTeste = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtCargaHoraria = new javax.swing.JTextField();
        lblCargaHoraria = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblModalidade = new javax.swing.JLabel();
        txtModalidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 130, 203));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        lblNomeCurso.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNomeCurso.setText("Nome do curso");

        lblCodCurso.setBackground(new java.awt.Color(255, 255, 255));
        lblCodCurso.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblCodCurso.setText("Codigo do Curso");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(51, 204, 0));
        btnCadastrar.setText("CONCLUIR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblStatusCurso.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblStatusCurso.setText("Status do Curso");

        cmbStatusCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));

        txtTeste.setBackground(new java.awt.Color(204, 255, 255));
        txtTeste.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTeste.setForeground(new java.awt.Color(255, 255, 255));

        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCargaHoraria.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblCargaHoraria.setText("Carga Horária");

        lblDescricao.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblDescricao.setText("Descrição Do Curso");

        lblModalidade.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblModalidade.setText("Modalidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStatusCurso)
                                    .addComponent(cmbStatusCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDescricao)
                                    .addComponent(lblModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodCurso)
                                    .addComponent(txtCodCurso)
                                    .addComponent(txtNomeCurso))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNomeCurso)
                                    .addGap(41, 41, 41)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblStatusCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbStatusCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCargaHoraria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addComponent(lblDescricao)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        String descricao= txtDescricao.getText();
    if (descricao.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Descrição do curso é obrigatória.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String cargaHorariaText= txtCargaHoraria.getText();
    int cargaHoraria;
    try {
        cargaHoraria = Integer.parseInt(cargaHorariaText);
        if (cargaHoraria <= 0) {
            throw new NumberFormatException("Carga horária deve ser maior que zero.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Carga horária inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
        // Cria uma nova instância da classe Curso e define seus atributos com base nos campos da interface gráfica
        Curso curso = new Curso();
        curso.setNome(txtNomeCurso.getText()); // Define o nome do curso com base no texto inserido no campo txtNomeCurso
        curso.setNumeroCurso(txtCodCurso.getText()); // Define o número do curso com base no texto inserido no campo txtCodCurso
        curso.setDescricao(descricao);
        curso.setModalidade(txtModalidade.getText());
        curso.setCargaHoraria(cargaHoraria);
        // Obtém o estado do curso selecionado no componente cmbStatusCurso e define o estado do curso
        String estado = cmbStatusCurso.getSelectedItem().toString();
        if (estado.equals("ATIVO")) {
            curso.setEstado(true);
        } else {
            curso.setEstado(false); // Define o estado como false para qualquer estado diferente de "ATIVO"
        }

        //Salvando o curso
        cursoController.save(curso);

        // Fecha a janela atual após a operação de inserção ter sido concluída com sucesso
        this.dispose();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
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

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });*/
        
             ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03sceduApplication.class)
            .headless(false)
            .run(args);

            TelaCadastro telaListar = context.getBean(TelaCadastro.class);
            telaListar.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbStatusCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblCodCurso;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblModalidade;
    private javax.swing.JLabel lblNomeCurso;
    private javax.swing.JLabel lblStatusCurso;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtCodCurso;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtModalidade;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JLabel txtTeste;
    // End of variables declaration//GEN-END:variables
}