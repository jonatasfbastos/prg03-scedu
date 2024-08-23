package br.com.ifba.gestaoescolas.view;

import br.com.ifba.gestaoescolas.controller.EscolaIController;
import br.com.ifba.gestaoescolas.entity.Escola;
import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import javax.swing.JOptionPane;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class AddEscola extends javax.swing.JFrame {
    
    
    
    private ListaEscola listaEscola;  
    
    private final EscolaIController escolaController;
    
    public AddEscola(EscolaIController escolaController, ListaEscola listaEscola) {
        this.escolaController = escolaController;
        this.listaEscola = listaEscola;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    public void setListaEscola(ListaEscola listaEscola) {
        this.listaEscola = listaEscola;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomeEscola = new javax.swing.JLabel();
        lblINEP = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblLogradouro = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblModalidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtINEP = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();
        txtModalidade = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 89, 152));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        lblNomeEscola.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeEscola.setText("Nome Escola");

        lblINEP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblINEP.setText("Código INEP ");

        lblCep.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCep.setText("cep");

        lblBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBairro.setText("Bairro");

        lblLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogradouro.setText("Logradouro");

        lblComplemento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblComplemento.setText("Complemento");

        lblTel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTel.setText("Telefone");

        lblModalidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModalidade.setText("Modalidade");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtINEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtINEPActionPerformed(evt);
            }
        });

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        txtLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogradouroActionPerformed(evt);
            }
        });

        txtModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModalidadeActionPerformed(evt);
            }
        });

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Adcionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblINEP)
                            .addComponent(lblCep)
                            .addComponent(lblLogradouro)
                            .addComponent(lblBairro)
                            .addComponent(lblTel)
                            .addComponent(lblComplemento)
                            .addComponent(lblModalidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtINEP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblINEP)
                    .addComponent(txtINEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogradouro)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModalidade)
                    .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtINEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtINEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtINEPActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogradouroActionPerformed

    private void txtModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModalidadeActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nomeEscola = txtNome.getText();
        String codigoINEP = txtINEP.getText();
        String cepEscola = txtCEP.getText();
        String bairroEscola = txtBairro.getText();
        String logradouroEscola = txtLogradouro.getText();
        String complementoEscola = txtComplemento.getText();
        String telefoneEscola = txtTel.getText();
        String modalidadeEscola = txtModalidade.getText();
        
        Escola escola = new Escola(nomeEscola, codigoINEP, cepEscola, bairroEscola, logradouroEscola, complementoEscola, telefoneEscola, modalidadeEscola);
        
        
        escola.setNome(nomeEscola);
        escola.setCodigoINEP(codigoINEP);
        escola.setCep(cepEscola);
        escola.setLogradouro(logradouroEscola);
        escola.setBairro(bairroEscola);
        escola.setComplemento(complementoEscola);
        escola.setModalidade(modalidadeEscola);
        escola.setTelefone(telefoneEscola);
        
        System.out.println("Nome: " + nomeEscola + " codigoINEP: " + codigoINEP + " cepEscola: " + cepEscola + " logradouroEscola: " + " bairroEscola: " +
                " complementoEscola: " + complementoEscola + " modalidadeEscola: " + modalidadeEscola + " telefoneEscola: ");
        
        try {
            System.out.println("Salvando..");
            escolaController.save(escola);
            System.out.println("Salvando...");
            listaEscola.loadAllEscolas(); // Atualiza a tabela de escola no ListaEscola
            System.out.println("teste");
            JOptionPane.showMessageDialog(this, "Escola adicionado com sucesso!");
            this.dispose(); // Fecha a Tela2 após salvar a escola
        } catch (RuntimeException e) {
            System.out.println("erro pae");
            JOptionPane.showMessageDialog(this, "Erro ao adicionar Escola: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    public static void main(String[] args) {
            ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(Prg03SceduApplication.class).
                headless(false).run(args); // Configura e inicia o contexto da aplicação Spring, desabilitando o modo headless

//            AddEscola addEscola = context.getBean(ListaEscola.class); // Obtém o bean CursoListar do contexto da aplicação
//            addEscola.setVisible(true);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblINEP;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblModalidade;
    private javax.swing.JLabel lblNomeEscola;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtINEP;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtModalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
