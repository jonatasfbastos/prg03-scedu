/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.view;

import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import jakarta.persistence.NoResultException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Flavio Junior
 */
public class DisciplinaListar extends javax.swing.JFrame {

    /**
     * Creates new form DisciplinaListar
     */
    //inserções da variaveis 
    private final DisciplinaIController disciplinaController;
    
    public DisciplinaListar(DisciplinaIController disciplinaController) {
        initComponents();
        this.disciplinaController = disciplinaController;
        carregarTabela();
    }
    
    // Método para carregar os dados da tabela
private void carregarTabela() {
    // Verifica se o disciplinaController foi inicializado corretamente
    if (disciplinaController == null) {
        // Lança uma exceção ou loga um erro se disciplinaController não estiver inicializado
        throw new IllegalStateException("O controlador da disciplina não foi inicializado.");
    }

    // Obtém todas as disciplinas do banco de dados
    List<Disciplina> dadosTabela = disciplinaController.findAll();
    
    // Obtém o modelo da tabela (DefaultTableModel) da tabela exibida na interface gráfica
    DefaultTableModel dtmDisciplinas = (DefaultTableModel) tblDados.getModel();
    // Limpa todas as linhas atuais da tabela para preparar a inserção de novos dados
    dtmDisciplinas.setRowCount(0);
    
    // Itera sobre a lista de disciplinas obtida do banco de dados
    for (Disciplina lista : dadosTabela) {
        // Cria um array de objetos contendo os dados de cada disciplina
        Object[] dados = {
            lista.getId(),
            lista.getNome(),
            lista.getNomeAbreviado(),
            lista.getCargaHoraria(),
            lista.getBaseCurricular(),
            lista.isEstado()
        };
        // Adiciona os dados da disciplina como uma nova linha no modelo da tabela
        dtmDisciplinas.addRow(dados);
    }
    // Notifica a tabela que os dados foram atualizados para que a interface gráfica seja atualizada
    dtmDisciplinas.fireTableDataChanged();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 89, 152));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "NomeAbreviado", "CargaHoraria", "BaseCurricular", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblDados);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnProfessor.setText("Professor");
        btnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisa)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        TelaCadastro newFrame = new TelaCadastro(disciplinaController);
        newFrame.setVisible(true);
        
        // Adiciona um WindowListener para capturar o evento de fechamento da janela
         newFrame.addWindowListener(new java.awt.event.WindowAdapter() {
             @Override
             public void windowClosed(java.awt.event.WindowEvent e) {
                 // Quando a janela de cadastro é fechada, atualiza a tabela de cursos
                 carregarTabela();
             }
         });    
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        // Obtém a linha selecionada na tabela
    int row = tblDados.getSelectedRow();
    if (row != -1) {
        long id = (long) tblDados.getValueAt(row, 0); // Supondo que o ID esteja na primeira coluna
        
        
        try {

            // Busca o curso pelo ID
            Disciplina disciplina = new Disciplina();
            disciplina = disciplinaController.findById(id);
            
            if (disciplina != null) {
                // Pergunta ao usuário se deseja remover o curso
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja remover a disciplina?", "Confirmar Remoção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (resposta == JOptionPane.YES_OPTION) {
                    disciplinaController.delete(disciplina);
                    JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Atualiza a tabela de dados (implementação não fornecida)
                    carregarTabela();
                    
                } else {
                    // Cancelar a operação
                    //em.getTransaction().rollback();
                    JOptionPane.showMessageDialog(null, "Remoção cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                // Curso não encontrado, lidar com isso apropriadamente
                JOptionPane.showMessageDialog(null, "Disciplina não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao remover a disciplina.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Nenhuma disciplina selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
        
    }                                          

   /* private void btnPesquisaActionPerformed() {                                             
    }//GEN-LAST:event_btnRemoverActionPerformed
*/
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        carregarTabela();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        
        // Obtém o nome do curso a ser pesquisado
        String nomeDisciplina = txtPesquisa.getText().trim(); // Use trim() para remover espaços em branco desnecessários

        // Criação da variável para dar início à pesquisa
        List<Disciplina> disciplinas;

        try {
            //Passsa as informações caso encontre o curso
            disciplinas = disciplinaController.findByNome(nomeDisciplina);

            // Se encontrado, atualiza a tabela com os cursos encontrados
            DefaultTableModel dtmCursos = (DefaultTableModel) tblDados.getModel();
            dtmCursos.setRowCount(0);  // Limpa todos os dados da tabela

            if (disciplinas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Curso nao encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                carregarTabela(); // Carregar tabela com todos os cursos após a pesquisa
            } else {
                for (Disciplina disciplina : disciplinas) {
                    Object[] dados = {disciplina.getId(), disciplina.getNome(), disciplina.getNomeAbreviado(), 
                        disciplina.getCargaHoraria(), disciplina.getBaseCurricular(), disciplina.isEstado()};
                    dtmCursos.addRow(dados);
                }
            }
        } catch (NoResultException e) {
            carregarTabela(); // Carregar tabela com todos os cursos após a pesquisa
            JOptionPane.showMessageDialog(null, "Curso nao encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar curso: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        // Obtém a linha selecionada na tabela
        int row = tblDados.getSelectedRow(); // Obtém o índice da linha selecionada na tabela
        if (row != -1) { // Verifica se uma linha foi realmente selecionada
            // Supondo que o ID esteja na primeira coluna, obtém o ID do curso
            long id = (long) tblDados.getValueAt(row, 0); // Obtém o valor da célula da primeira coluna e converte para long

            try {
                Disciplina disciplina = new Disciplina();
                disciplina = disciplinaController.findById(id); // Busca o curso no banco de dados pelo ID

                if (disciplina != null) { // Verifica se o curso foi encontrado
                    // Abre a tela de edição e passa o curso como parâmetro
                    TelaAtualizar newFrame = new TelaAtualizar(disciplinaController,disciplina); // Cria uma nova instância da tela de edição, passando o curso encontrado
                    newFrame.setVisible(true); // Torna a tela de edição visível

                    // Adiciona um ouvinte para quando a janela de edição for fechada
                    newFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosed(java.awt.event.WindowEvent e) {
                            // Recarrega a tabela quando a janela de edição for fechada
                            carregarTabela();
                        }
                    });

                } else {
                    // Se o curso não for encontrado, exibe uma mensagem de aviso
                    JOptionPane.showMessageDialog(null, "Curso não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    carregarTabela(); // Recarrega a tabela para garantir que todos os cursos estejam atualizados
                }

            } catch (Exception e) {
                // Se ocorrer uma exceção, imprime o stack trace e exibe uma mensagem de erro
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao buscar o curso.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            // Se nenhuma linha for selecionada, exibe uma mensagem de aviso
            JOptionPane.showMessageDialog(null, "Nenhum curso selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorActionPerformed
        // TODO add your handling code here:
        TelaProfessor tela = new TelaProfessor(disciplinaController);
        tela.setVisible(true);
    }//GEN-LAST:event_btnProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(DisciplinaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisciplinaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisciplinaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisciplinaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisciplinaListar().setVisible(true);
            }
        });*/
        
        ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class)
            .headless(false)
            .run(args);

            DisciplinaListar telaListar = context.getBean(DisciplinaListar.class);
            telaListar.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProfessor;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
