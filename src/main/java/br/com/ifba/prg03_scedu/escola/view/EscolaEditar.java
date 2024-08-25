package br.com.ifba.prg03_scedu.escola.view;

import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.escola.controller.EscolaIController;
import br.com.ifba.prg03_scedu.escola.entity.Escola;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Alef Almeida
 */
public class EscolaEditar extends javax.swing.JFrame {
    
    private Escola escolaNew;
    
    private final EscolaIController escolaController;
   
    public EscolaEditar(EscolaIController escolaController, Escola escolaNew) {
        initComponents();
        this.escolaController = escolaController; 
        this.escolaNew = escolaNew;
    }    
    
   private void atualizarEscola(Escola escola){
        
        
        escola.setNome(txtNovoNome.getText());
        escola.setInep(txtNovoINEP.getText());
        escola.setBairro(txtNovoBairro.getText());
        escola.setCep(txtNovoCEP.getText());
        escola.setComplemento(txtNovoComplemento.getText());
        escola.setLogradouro(txtNovoLogradouro.getText());
        escola.setModalidade(txtNovoLogradouro.getText());
        escola.setTelefone(txtNovoTelefone.getText());
      
        try {
      
        //Dando um update no banco de dados
        escolaController.update(escola);
        //escolaController.update(escola);
        
        
    } catch (Exception e) {
      
        // Trata a exceção (geralmente loga ou mostra uma mensagem de erro)
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao alterar a disciplina.", "Erro", JOptionPane.ERROR_MESSAGE);
        
    } 
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        lblNovoNome = new javax.swing.JLabel();
        txtNovoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNovoINEP = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtNovoCEP = new javax.swing.JTextField();
        lblNovoBairro = new javax.swing.JLabel();
        txtNovoBairro = new javax.swing.JTextField();
        lblNovoLogradouro = new javax.swing.JLabel();
        txtNovoLogradouro = new javax.swing.JTextField();
        lblNovoComplemento = new javax.swing.JLabel();
        txtNovoComplemento = new javax.swing.JTextField();
        lblNovaModalidade = new javax.swing.JLabel();
        txtNovaModalidade = new javax.swing.JTextField();
        lblNovoTelefone = new javax.swing.JLabel();
        txtNovoTelefone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNovoSalvar = new javax.swing.JButton();
        btnNovoCancelar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 89, 152));
        jPanel1.setForeground(new java.awt.Color(59, 89, 152));

        lblNovoNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNovoNome.setText("Novo nome");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Novo INEP");

        txtNovoINEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovoINEPActionPerformed(evt);
            }
        });

        lblCEP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCEP.setText("CEP");

        txtNovoCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovoCEPActionPerformed(evt);
            }
        });

        lblNovoBairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNovoBairro.setText("Bairro");

        lblNovoLogradouro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNovoLogradouro.setText("Logradouro");

        lblNovoComplemento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNovoComplemento.setText("Complemento");

        lblNovaModalidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNovaModalidade.setText("Modalidade");

        lblNovoTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNovoTelefone.setText("Telefone");

        jPanel2.setBackground(new java.awt.Color(59, 89, 152));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(59, 89, 152));

        btnNovoSalvar.setText("Salvar");
        btnNovoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoSalvarActionPerformed(evt);
            }
        });

        btnNovoCancelar.setText("Cancelar");
        btnNovoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnNovoSalvar)
                .addGap(37, 37, 37)
                .addComponent(btnNovoCancelar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovoNome)
                            .addComponent(jLabel1)
                            .addComponent(lblCEP)
                            .addComponent(lblNovoBairro))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNovoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNovoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNovoINEP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovoLogradouro)
                            .addComponent(lblNovoComplemento)
                            .addComponent(lblNovaModalidade)
                            .addComponent(lblNovoTelefone))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNovoLogradouro)
                            .addComponent(txtNovoComplemento)
                            .addComponent(txtNovaModalidade)
                            .addComponent(txtNovoTelefone))))
                .addGap(90, 90, 90)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNovoNome)
                            .addComponent(txtNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNovoINEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCEP)
                            .addComponent(txtNovoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNovoBairro)
                            .addComponent(txtNovoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNovoLogradouro)
                            .addComponent(txtNovoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNovoComplemento)
                            .addComponent(txtNovoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNovoTelefone)
                            .addComponent(txtNovoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNovaModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNovaModalidade))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNovoINEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovoINEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNovoINEPActionPerformed

    private void txtNovoCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovoCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNovoCEPActionPerformed

    private void btnNovoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoSalvarActionPerformed
        atualizarEscola(escolaNew);
        this.dispose();
    }//GEN-LAST:event_btnNovoSalvarActionPerformed

    private void btnNovoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnNovoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class)
            .headless(false)
            .run(args);

             EscolaEditar escolaEditar = context.getBean(EscolaEditar.class);
            escolaEditar.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoCancelar;
    private javax.swing.JButton btnNovoSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblNovaModalidade;
    private javax.swing.JLabel lblNovoBairro;
    private javax.swing.JLabel lblNovoComplemento;
    private javax.swing.JLabel lblNovoLogradouro;
    private javax.swing.JLabel lblNovoNome;
    private javax.swing.JLabel lblNovoTelefone;
    private javax.swing.JTextField txtNovaModalidade;
    private javax.swing.JTextField txtNovoBairro;
    private javax.swing.JTextField txtNovoCEP;
    private javax.swing.JTextField txtNovoComplemento;
    private javax.swing.JTextField txtNovoINEP;
    private javax.swing.JTextField txtNovoLogradouro;
    private javax.swing.JTextField txtNovoNome;
    private javax.swing.JTextField txtNovoTelefone;
    // End of variables declaration//GEN-END:variables
}
