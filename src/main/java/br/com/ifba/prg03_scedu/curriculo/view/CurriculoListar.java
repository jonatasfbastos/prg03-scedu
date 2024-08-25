/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.prg03_scedu.curriculo.view;

import br.com.ifba.prg03_scedu.curriculo.controller.CurriculoIController;
import br.com.ifba.prg03_scedu.curriculo.entity.Curriculo;
import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Gabriel
 */
public class CurriculoListar extends javax.swing.JFrame {
    
    /**
     * Creates new form CurriculoListar
     */
    //Cria um objeto que não pode ser trocado para outro
    @Autowired
    private final CurriculoIController curriculoController;
    
    @Autowired
    private DisciplinaIController disciplinaController;
    
    @Autowired
    private ApplicationContext applicationContext;
    
    
    //Além de inicializar a tela já com os dados, inicializa o repository
    public CurriculoListar(CurriculoIController curriculoController, DisciplinaIController disciplinaController) {
        this.disciplinaController = disciplinaController;
        this.curriculoController = curriculoController;
        initComponents();
        jtxtPesquisar.setText("");
        setTitle("Grade Curricular");
        setLocationRelativeTo(null);
        listarCurriculo();
    }
    
    public void listarCurriculo() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Reseta a tabela para receber os dados
        model.setRowCount(0);

        // Busca todos os currículos e coloca em uma lista
        List<Curriculo> cadastros = curriculoController.findAll();

        // Adiciona os dados na tabela
        for (Curriculo curriculo : cadastros) {
            // Formata a lista de disciplinas em uma string simples
            String disciplinasString = curriculo.getDisciplinas().stream()
                    .map(Disciplina::getNome) // Supondo que Disciplina tenha um método getNome()
                    .collect(Collectors.joining(", ")); // Une os nomes das disciplinas com vírgulas

            model.addRow(new Object[]{
                curriculo.getId(),
                curriculo.getCodigoEscola(),
                curriculo.getCodigoSerie(),
                disciplinasString // Exibe a lista de disciplinas como uma string
            });
        }
        //Notifica a tela que teve mudanças
        model.fireTableDataChanged();
    }
    
    public void listarPesquisa(String pesquisar){
    
        //Cria os model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //seta como nada antes de receber os valores
        model.setRowCount(0);

        try {
            //Pesquisa a disciplina pela string recebida
            List<Disciplina> disciplinas = disciplinaController.findByNome(pesquisar);

            //Verificação caso não ache uma disciplina
            if (disciplinas == null || disciplinas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não encontrado, informe outro nome.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            //Busca a lista de encontrados
            for (Disciplina disciplina : disciplinas) {
                //Removido o vinculo com curriculo_id, agora findall para encontrar
                List<Curriculo> curriculos = curriculoController.findAll();

                for (Curriculo curriculo : curriculos) {
                    //Encontra a lista pesquisada
                    if (curriculo.getDisciplinas().contains(disciplina)) {
                        //Transforma a lista em strings
                        String disciplinasString = curriculo.getDisciplinas().stream()
                                .map(Disciplina::getNome)
                                .collect(Collectors.joining(", "));

                        //Adiciona o model novamente com a lista recebida
                        model.addRow(new Object[]{
                            curriculo.getId(),
                            curriculo.getCodigoEscola(),
                            curriculo.getCodigoSerie(),
                            disciplinasString //Exibi a disciplica em lista
                        });
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
        btnCadastrar = new javax.swing.JButton();
        jtxtPesquisar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEditar1 = new javax.swing.JButton();
        jPesquisar = new javax.swing.JButton();
        jAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(72, 71, 97));

        jPanel1.setBackground(new java.awt.Color(8, 102, 255));
        jPanel1.setLayout(null);

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("+");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(300, 20, 107, 30);

        jtxtPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtPesquisar.setText("Pesquisar");
        jPanel1.add(jtxtPesquisar);
        jtxtPesquisar.setBounds(40, 20, 170, 30);

        jPanel2.setBackground(new java.awt.Color(5, 79, 200));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editar");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Excluir");

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cod_Serie");

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cod_Escola");

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cod_Curriculo");

        btnDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletar.setForeground(new java.awt.Color(0, 0, 0));
        btnDeletar.setText("+");
        btnDeletar.setBorderPainted(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("+");
        btnEditar.setBorderPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Disciplinas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeletar)
                            .addComponent(btnEditar))))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 110, 560, 70);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cod_Escola", "Cod_Serie", "Disciplinas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(300);

        // Define o modo de redimensionamento da tabela
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Cria um JScrollPane e adiciona a JTable
        JScrollPane jScrollPane1 = new JScrollPane(jTable1);

        // Define as políticas de rolagem para o JScrollPane
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setViewportView(jTable1);

        btnEditar1.setBackground(new java.awt.Color(70, 73, 75));
        btnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar1.setText("< - Voltar");
        btnEditar1.setBorderPainted(false);
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar1)
                .addGap(96, 96, 96))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 180, 560, 320);

        jPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPesquisar.setText("+");
        jPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(jPesquisar);
        jPesquisar.setBounds(220, 20, 40, 30);

        jAtualizar.setText("ATUALIZAR");
        jAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jAtualizar);
        jAtualizar.setBounds(500, 20, 100, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        CurriculoEditar curriculoEditar = new CurriculoEditar(curriculoController, disciplinaController);
        curriculoEditar.setTitle("Editar curriculo");
        curriculoEditar.setLocationRelativeTo(null);
        curriculoEditar.setVisible(true);
        //Adiciona um WindowListener para capturar o evento de fechamento da janela
         curriculoEditar.addWindowListener(new java.awt.event.WindowAdapter() {
             @Override
             public void windowClosed(java.awt.event.WindowEvent e) {
                 //Quando a janela de cadastro é fechada, atualiza a tabela de curriculo
                 listarCurriculo();
             }
         });
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CurriculoCadastro curriculoCadastro = new CurriculoCadastro(curriculoController, disciplinaController);
        curriculoCadastro.setTitle("Editar curriculo");
        curriculoCadastro.setLocationRelativeTo(null);
        curriculoCadastro.setVisible(true);
        //Adiciona um WindowListener para capturar o evento de fechamento da janela
         curriculoCadastro.addWindowListener(new java.awt.event.WindowAdapter() {
             @Override
             public void windowClosed(java.awt.event.WindowEvent e) {
                 //Quando a janela de cadastro é fechada, atualiza a tabela de curriculo
                 listarCurriculo();
             }
         });
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String idStr = JOptionPane.showInputDialog("Digite o ID do currículo a ser excluído:");

        try {
            //Pega a String e converte em long, depois deleta pelo ID
            long id = Long.parseLong(idStr);
            curriculoController.deleteById(id);
            JOptionPane.showMessageDialog(null, "Currículo excluído com sucesso!");
            listarCurriculo();
            //Verificações caso não ache ou ID invalido
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o currículo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        listarCurriculo();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisarActionPerformed
        String pesquisar = jtxtPesquisar.getText();
        //Caso não tenha nada na caixa de pesquisa, ele retorna os valores padrões
        if(pesquisar.isEmpty()){
            listarCurriculo();
        //Caso receba uma string, ele pesquisa ela e depois reseta o campo
        }else{
            listarPesquisa(pesquisar);
            jtxtPesquisar.setText("");
        }
    }//GEN-LAST:event_jPesquisarActionPerformed

    private void jAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarActionPerformed
        //Botão que atualiza, só para testes
        listarCurriculo();
    }//GEN-LAST:event_jAtualizarActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        //Volta para a tela que chamou
        this.dispose();
    }//GEN-LAST:event_btnEditar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CurriculoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurriculoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurriculoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurriculoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CursoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton jAtualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtPesquisar;
    // End of variables declaration//GEN-END:variables
}
