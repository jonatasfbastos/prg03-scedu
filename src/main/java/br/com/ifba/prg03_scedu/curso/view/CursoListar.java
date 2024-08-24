
package br.com.ifba.prg03_scedu.curso.view;


import br.com.ifba.prg03_scedu.curso.controller.CursoIController;
import br.com.ifba.prg03_scedu.curso.entity.Curso;
import br.com.ifba.prg03_scedu.Prg03sceduApplication;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


//@Component
public class CursoListar extends javax.swing.JFrame {
 
    
    private final CursoIController cursoController;
    
    
    // Método para carregar os dados da tabela
private void carregarTabela() {
    // Obtém todos os cursos do banco de dados
    List<Curso> dadosTabela = cursoController.findAll();
    
    // Obtém o modelo da tabela (DefaultTableModel) da tabela exibida na interface gráfica
    DefaultTableModel dtmCursos = (DefaultTableModel) TblDados.getModel();
    // Limpa todas as linhas atuais da tabela para preparar a inserção de novos dados
    dtmCursos.setRowCount(0);
    
    // Itera sobre a lista de cursos obtida do banco de dados
    for (Curso lista : dadosTabela) {
        // Cria um array de objetos contendo os dados de cada curso
        Object[] dados = {
            lista.getId(),    // Código
            lista.getNome(),          // Curso
            lista.getNumeroCurso(),   // Número do Curso
            lista.isEstado() ? "Ativo" : "Inativo", // Status
            lista.getCargaHoraria(),  // Carga Horária
            lista.getDescricao(),     // Descrição
            lista.getModalidade()     // Modalidade
        };
        // Adiciona os dados do curso como uma nova linha no modelo da tabela
        dtmCursos.addRow(dados);
    }
    // Notifica a tabela que os dados foram atualizados para que a interface gráfica seja atualizada
    dtmCursos.fireTableDataChanged();
    TblDados.revalidate();
    TblDados.repaint();
}

    
    /**
     * Creates new form CursoListar
     */
    public CursoListar(CursoIController cursoController) {
        initComponents();
        this.cursoController = cursoController;
        carregarTabela();
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
        BtnIncluir = new javax.swing.JButton();
        TxtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDados = new javax.swing.JTable();
        BtnAlterar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(39, 130, 203));

        BtnIncluir.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BtnIncluir.setText("CADASTRO");
        BtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIncluirActionPerformed(evt);
            }
        });

        TxtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPesquisaActionPerformed(evt);
            }
        });

        TblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Curso", "Código do Curso", "Status", "Carga Horária", "Descrição", "Modalidade"
            }
        ));
        TblDados.setAutoscrolls(false);
        TblDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblDados);

        BtnAlterar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BtnAlterar.setText("EDITAR");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        BtnExcluir.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BtnExcluir.setText("REMOVER");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        btnPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnPesquisa.setText("SEARCH");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnAtualizar.setText("REFRESH");
        btnAtualizar.setToolTipText("");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(TxtPesquisa))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPesquisaActionPerformed

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
int row= TblDados.getSelectedRow(); 

    if (row != -1) { 
        Object idObj= TblDados.getValueAt(row, 0); 

        long id=0;
          try {
            System.out.println("ID Object: " + idObj); // Log para verificar o valor
            System.out.println("ID Object Class: " + idObj.getClass()); // Log para verificar a classe do valorif (idObj instanceof Number) {
              
            if (idObj instanceof Number) {
                id = ((Number) idObj).longValue();
            } else if (idObj instanceof String) {
                id = Long.parseLong((String) idObj);
            } else {
                throw new IllegalArgumentException("Tipo de dado inválido para o ID do curso.");
            }

            Curso curso= cursoController.findById(id);

            if (curso != null) { 
                TelaEditar newFrame =new TelaEditar(cursoController, curso); 
                newFrame.setVisible(true); 
    
                newFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override public void windowClosed (java.awt.event.WindowEvent e) {
                        carregarTabela(); 
                    }
                });

           } else {
                JOptionPane.showMessageDialog(null, "Curso não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                carregarTabela(); 
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato do ID inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar o curso.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    } else {
        JOptionPane.showMessageDialog(null, "Nenhum curso selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIncluirActionPerformed
        // TODO add your handling code here:
        
         // Cria uma nova instância da tela de cadastro
         TelaCadastro newFrame = new TelaCadastro(cursoController);

         // Torna a tela de cadastro visível para o usuário
         newFrame.setVisible(true);

         // Adiciona um WindowListener para capturar o evento de fechamento da janela
         newFrame.addWindowListener(new java.awt.event.WindowAdapter() {
             @Override
             public void windowClosed(java.awt.event.WindowEvent e) {
                 // Quando a janela de cadastro é fechada, atualiza a tabela de cursos
                 carregarTabela();
             }
         });               
    }//GEN-LAST:event_BtnIncluirActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        
   int row= TblDados.getSelectedRow();
    if (row != -1) {
        Object value= TblDados.getValueAt(row, 0); 
        
        if (value == null) {
            JOptionPane.showMessageDialog(null, "ID não pode ser nulo.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String idString= value.toString(); 
        
        if (idString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        long id;
        try {
            id = Long.parseLong(idString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Curso curso= cursoController.findById(id);
            
            if (curso != null) {
                int resposta= JOptionPane.showConfirmDialog(null, "Deseja remover o curso?", "Confirmar Remoção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (resposta == JOptionPane.YES_OPTION) {
                    cursoController.delete(curso);
                    JOptionPane.showMessageDialog(null, "Curso removido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    carregarTabela();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Remoção cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Curso não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao remover o curso.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Nenhum curso selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
       String nomeCurso= TxtPesquisa.getText().trim(); // Use trim() para remover espaços em branco desnecessários// Criação da variável para dar início à pesquisa
            List<Curso> cursos;

    try {
        // Passa as informações caso encontre o curso
        cursos = cursoController.findByNome(nomeCurso);
            
    
        // Se encontrado, atualiza a tabela com os cursos encontrados
        DefaultTableModel dtmCursos= (DefaultTableModel) TblDados.getModel();
        dtmCursos.setRowCount(0);  // Limpa todos os dados da tabela
        if (cursos.isEmpty()) {
       
            JOptionPane.showMessageDialog(null, "Curso não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
            carregarTabela(); // Carregar tabela com todos os cursos após a pesquisa
        } else {
            for (Curso curso : cursos) {
               Object[] dados = {
                    curso.getId(),
                    curso.getNome(),
                    curso.getNumeroCurso(),
                    curso.getCargaHoraria(), // Incluindo carga horária
                    curso.getDescricao(), // Incluindo descrição
                    curso.getModalidade(), // Incluindo modalidade
                    curso.isEstado()
                };
                dtmCursos.addRow(dados);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao buscar curso: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void TblDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDadosMouseClicked

    }//GEN-LAST:event_TblDadosMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        carregarTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03sceduApplication.class)
            .headless(false)
            .run(args);

            CursoListar telaListar = context.getBean(CursoListar.class);
            telaListar.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnIncluir;
    private javax.swing.JTable TblDados;
    private javax.swing.JTextField TxtPesquisa;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}