/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.usuario.view;

import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioIController;
import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class UsuarioListar extends javax.swing.JFrame {

    private final UsuarioIController usuarioController;
    
    public UsuarioListar(UsuarioIController usuarioController) {
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
        boolean corresponde = false;
        int relevancia = 0;

        // Verifica a relevância de cada filtro selecionado
        if (idSelectBtm.isSelected()) {
            if (String.valueOf(usuario.getId()).contains(pesquisa)) {
                corresponde = true;
                relevancia = Math.max(relevancia, 1); // Define uma prioridade baixa para ID
            }
        }
        if (nomeSelectBtm.isSelected()) {
            if (usuario.getNome().toLowerCase().contains(pesquisa)) {
                corresponde = true;
                relevancia = Math.max(relevancia, 2); // Define uma prioridade média para Nome
            }
        }
        if (emailSelectBtm.isSelected()) {
            if (usuario.getEmail().toLowerCase().contains(pesquisa)) {
                corresponde = true;
                relevancia = Math.max(relevancia, 3); // Define uma prioridade mais alta para E-mail
            }
        }
        if (nivelAcessSelectBtm.isSelected()) {
            if (usuario.getNivelAcesso().toLowerCase().contains(pesquisa)) {
                corresponde = true;
                relevancia = Math.max(relevancia, 4); // Define a maior prioridade para Nível de Acesso
            }
        }

        // Se nenhum filtro estiver selecionado, avalia todos os campos
        if (!idSelectBtm.isSelected() && !nomeSelectBtm.isSelected() && 
            !emailSelectBtm.isSelected() && !nivelAcessSelectBtm.isSelected()) {
            corresponde = usuario.getId().toString().contains(pesquisa) || 
                          usuario.getNome().toLowerCase().contains(pesquisa) || 
                          usuario.getEmail().toLowerCase().contains(pesquisa) || 
                          usuario.getNivelAcesso().toLowerCase().contains(pesquisa);
            relevancia = corresponde ? 5 : 0; // Define a maior prioridade se nenhum filtro for selecionado
        }

        // Adiciona o usuário à tabela se corresponder aos critérios
        if (corresponde) {
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
        RemoverButtom = new javax.swing.JButton();
        editarButtom = new javax.swing.JButton();
        atualizarButtom = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        idSelectBtm = new javax.swing.JRadioButton();
        nomeSelectBtm = new javax.swing.JRadioButton();
        emailSelectBtm = new javax.swing.JRadioButton();
        nivelAcessSelectBtm = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        pesquisaTextf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cadastroButtom = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        RemoverButtom.setBackground(new java.awt.Color(255, 51, 51));
        RemoverButtom.setForeground(new java.awt.Color(255, 255, 255));
        RemoverButtom.setText("Remover");
        RemoverButtom.setBorder(null);
        RemoverButtom.setMaximumSize(new java.awt.Dimension(100, 100));
        RemoverButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverButtomActionPerformed(evt);
            }
        });

        editarButtom.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        editarButtom.setForeground(new java.awt.Color(51, 51, 51));
        editarButtom.setText("Editar");
        editarButtom.setBorder(null);
        editarButtom.setMaximumSize(new java.awt.Dimension(53, 22));
        editarButtom.setPreferredSize(new java.awt.Dimension(53, 22));
        editarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtomActionPerformed(evt);
            }
        });

        atualizarButtom.setBackground(new java.awt.Color(255, 255, 255));
        atualizarButtom.setForeground(new java.awt.Color(0, 102, 255));
        atualizarButtom.setText("🔁");
        atualizarButtom.setBorder(null);
        atualizarButtom.setBorderPainted(false);
        atualizarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtomActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        idSelectBtm.setBackground(new java.awt.Color(204, 204, 204));
        idSelectBtm.setForeground(new java.awt.Color(255, 255, 255));
        idSelectBtm.setText("ID");

        nomeSelectBtm.setBackground(new java.awt.Color(204, 204, 204));
        nomeSelectBtm.setForeground(new java.awt.Color(255, 255, 255));
        nomeSelectBtm.setText("Nome");
        nomeSelectBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeSelectBtmActionPerformed(evt);
            }
        });

        emailSelectBtm.setBackground(new java.awt.Color(204, 204, 204));
        emailSelectBtm.setForeground(new java.awt.Color(255, 255, 255));
        emailSelectBtm.setText("E-mail");
        emailSelectBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailSelectBtmActionPerformed(evt);
            }
        });

        nivelAcessSelectBtm.setBackground(new java.awt.Color(204, 204, 204));
        nivelAcessSelectBtm.setForeground(new java.awt.Color(255, 255, 255));
        nivelAcessSelectBtm.setText("Nível de Acesso");
        nivelAcessSelectBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelAcessSelectBtmActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Filtros:");

        pesquisaTextf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaTextfActionPerformed(evt);
            }
        });

        jLabel2.setText("🔍");

        cadastroButtom.setBackground(new java.awt.Color(8, 102, 255));
        cadastroButtom.setForeground(new java.awt.Color(255, 255, 255));
        cadastroButtom.setText("Cadastrar");
        cadastroButtom.setBorder(null);
        cadastroButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nomeSelectBtm)
                                .addComponent(emailSelectBtm))
                            .addComponent(nivelAcessSelectBtm))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(idSelectBtm)
                            .addContainerGap(72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pesquisaTextf, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaTextf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idSelectBtm)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(nomeSelectBtm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailSelectBtm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nivelAcessSelectBtm)))
                .addGap(187, 187, 187)
                .addComponent(cadastroButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Gestão de Usuários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(editarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoverButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atualizarButtom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoverButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void emailSelectBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailSelectBtmActionPerformed
        // TODO add your handling code here:
        atualizarTabela();
    }//GEN-LAST:event_emailSelectBtmActionPerformed

    private void nomeSelectBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeSelectBtmActionPerformed
        // TODO add your handling code here:
        atualizarTabela();
    }//GEN-LAST:event_nomeSelectBtmActionPerformed

    private void nivelAcessSelectBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelAcessSelectBtmActionPerformed
        // TODO add your handling code here:
        atualizarTabela();
    }//GEN-LAST:event_nivelAcessSelectBtmActionPerformed

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
    private javax.swing.JRadioButton emailSelectBtm;
    private javax.swing.JRadioButton idSelectBtm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton nivelAcessSelectBtm;
    private javax.swing.JRadioButton nomeSelectBtm;
    private javax.swing.JTextField pesquisaTextf;
    // End of variables declaration//GEN-END:variables
}
