/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestavaliacao.view;

import br.com.ifba.prg03_scedu.gestavaliacao.controller.AvaliacaoIController;
import br.com.ifba.prg03_scedu.gestavaliacao.entity.Avaliacao;
import br.com.ifba.prg03_scedu.gestavaliacao.view.TelaEditar;
import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.gestaoprofessor.controller.ProfessorIController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author rian1
 */
public class TelaAvaliacoes extends javax.swing.JFrame {
    
    private final AvaliacaoIController avaliacaoController; // Controlador para gerenciar as operações de avaliação
    private final DisciplinaIController disciplinaController; // Controlador para gerenciar as operações de disciplina
    private final ProfessorIController profController; // Controlador para gerenciar as operações de Professor

    private void carregarTabela() {
        // Método responsável por carregar e exibir os dados na tabela

        if (avaliacaoController != null) { // Verifica se o controlador de avaliação foi inicializado
            List<Avaliacao> dadosTabela = avaliacaoController.findAll(); // Obtém a lista de todas as avaliações

            // Obtém o modelo de tabela do componente tableInfo, que é do tipo DefaultTableModel
            DefaultTableModel dtmAvalicoes = (DefaultTableModel) tableInfo.getModel();

            dtmAvalicoes.setRowCount(0); // Limpa as linhas existentes na tabela

            // Itera sobre a lista de avaliações e adiciona cada uma como uma nova linha na tabela
            for (Avaliacao lista : dadosTabela) {
                Object[] dados = {
                    lista.getId(), // ID da avaliação
                    lista.getData(), // Data da avaliação
                    lista.getDisciplina(), // Nome da disciplina
                    lista.getTipo(), // Tipo da avaliação
                    lista.getPeso(), // Peso da avaliação
                    lista.getDescricao(), // Descrição da avaliação
                    lista.getProfessores().getNome(), // Nome do professor
                    lista.isStatus() ? "Aplicado" : "Pendente" // Status da avaliação como string
                };

                dtmAvalicoes.addRow(dados); // Adiciona a nova linha com os dados à tabela
            }

            dtmAvalicoes.fireTableDataChanged(); // Notifica o modelo de tabela que os dados foram alterados
        } else {
            System.err.println("Erro: AvaliacaoIController nao foi inicializado."); // Mensagem de erro caso o controlador não tenha sido inicializado
        }
    }

    /**
     * Creates new form TelaInicial
     */
    public TelaAvaliacoes(AvaliacaoIController avaliacaoController, 
            DisciplinaIController disciplinaController,
            ProfessorIController profController) {
    this.avaliacaoController = avaliacaoController; // Inicializa o controlador de avaliação
    this.disciplinaController = disciplinaController; // Inicializa o controlador de disciplina
    this.profController = profController; // Inicializa o controlador de professor
    initComponents(); // Inicializa os componentes da interface gráfica
    carregarTabela(); // Carrega os dados na tabela usando o controlador de avaliação
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        btnCad = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(59, 89, 152));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTÃO DE AVALIAÇÕES");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBusca.setText("Informe a disciplina");

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        btnCad.setText("Nova avaliação");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRefresh.setText("Atualizar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Disciplina", "Tipo", "Peso", "Descrição", "Profº", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableInfo);

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusca)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                                .addComponent(btnRefresh)
                                .addGap(17, 17, 17)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (tableInfo.getSelectedRow() != -1) { // Verifica se uma linha está selecionada na tabela
            // Obtém o valor do ID da avaliação da coluna específica (index 0) da linha selecionada
            Object idAvaliacaoBuscar = tableInfo.getValueAt(tableInfo.getSelectedRow(), 0);

            // Recupera o objeto Avaliacao correspondente ao ID obtido usando o controlador de avaliação
            Avaliacao ava = avaliacaoController.findById((Long) idAvaliacaoBuscar);

            // Cria uma nova instância da tela de edição, passando a avaliação, o controlador de avaliação e o controlador de disciplina
            TelaEditar telaEditar = new TelaEditar(ava, avaliacaoController, disciplinaController, profController);
            telaEditar.setVisible(true); // Torna a tela de edição visível

            // Adiciona um listener para atualizar a tabela quando a janela de edição for fechada
            telaEditar.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    // Sobrescreve o método windowClosed para que, quando a janela de edição for fechada,
                    // o método carregarTabela() seja chamado para atualizar os dados na tabela
                    carregarTabela();
                }
            });
        } else {
            // Se nenhuma linha estiver selecionada, exibe uma mensagem de aviso informando ao usuário
            JOptionPane.showMessageDialog(this, "Por favor, selecione um curso para editar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        // TODO add your handling code here:
        CadastroAvaliacao telaCad = new CadastroAvaliacao(avaliacaoController, 
                disciplinaController, profController); // Cria uma nova instância do formulário CadastroAvaliacao, passando os controladores
        telaCad.setVisible(true); // Torna a tela de cadastro visível

        // Adiciona um listener para atualizar a tabela quando a janela de cadastro for fechada
        telaCad.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Quando a janela de cadastro for fechada, chama o método carregarTabela() para atualizar os dados na tabela
                carregarTabela();
            }
        });
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
        String disciplina = txtBusca.getText(); // Obtém o nome da disciplina do campo de texto
        List<Avaliacao> avaliacoes = avaliacaoController.findByDisciplina(disciplina); // Busca avaliações pela disciplina usando o controlador

        if (avaliacoes.isEmpty()) { // Verifica se a lista de avaliações está vazia
            // Exibe uma mensagem de aviso se nenhuma avaliação for encontrada
            JOptionPane.showMessageDialog(null, "Avaliacao não encontrada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            // Obtém o modelo de tabela do componente tableInfo, que é do tipo DefaultTableModel
            DefaultTableModel dtmAvaliacoes = (DefaultTableModel) tableInfo.getModel();
            // Limpa todos os dados existentes na tabela
            dtmAvaliacoes.setRowCount(0);

            // Itera sobre a lista de avaliações e adiciona cada uma como uma nova linha na tabela
            for (Avaliacao lista : avaliacoes) {
                Object[] dados = {
                    lista.getId(), // ID da avaliação
                    lista.getData(), // Data da avaliação
                    lista.getDisciplina(), // Nome da disciplina
                    lista.getTipo(), // Tipo da avaliação
                    lista.getPeso(), // Peso da avaliação
                    lista.getDescricao(), // Descrição da avaliação
                    lista.getProfessores().getNome(), // Nome do professor
                    lista.isStatus() ? "Aplicado" : "Pendente" // Status da avaliação como string
                };

                dtmAvaliacoes.addRow(dados); // Adiciona a nova linha com os dados à tabela
            }
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        carregarTabela();//atualiza a tabela
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        // Verifica se uma linha na tabela foi selecionada
        if (tableInfo.getSelectedRow() != -1) {

            int resposta_user = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a avaliacao permanentemente?", "Confirmação", JOptionPane.YES_NO_OPTION);
            // A resposta do usuário é armazenada na variável resposta_user
    
            if (resposta_user == JOptionPane.YES_OPTION) {
                // Verifica se o usuário clicou em "Sim" na caixa de diálogo de confirmação
                try {
                    // Obtém o valor do ID do curso a ser removido da tabela, na coluna 0 da linha selecionada
                    Object idAvaRemover = tableInfo.getValueAt(tableInfo.getSelectedRow(), 0);
                    // Recupera o objeto Avaliacao correspondente ao ID obtido usando o controlador de avaliacoes
                    Avaliacao removeAvaliacao = avaliacaoController.findById((Long) idAvaRemover);
                    // Remove a avaliacao do banco de dados usando o controlador de curso
                    avaliacaoController.delete(removeAvaliacao);
                // Exibe uma mensagem informando que a avaliacao foi excluída com sucesso
                JOptionPane.showMessageDialog(this, "Avaliacao excluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                // Exibe uma mensagem de erro informando que houve um problema ao excluir a avaliacao, junto com a mensagem da exceção
                JOptionPane.showMessageDialog(this, "Erro ao excluir avaliação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        // Atualiza a tabela após a exclusão
        carregarTabela();
        } else {
            // Exibe uma mensagem de erro se nenhuma linha estiver selecionada
            JOptionPane.showConfirmDialog(null, "Selecione uma avaliação para Excluir", "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfigurableApplicationContext context = 
                    new SpringApplicationBuilder(Prg03SceduApplication.class).
                    headless(false).run(args); // Configura e inicia o contexto da aplicação Spring, desabilitando o modo headless
            
            TelaAvaliacoes telaAvaliacao = context.getBean(TelaAvaliacoes.class); // Obtém o bean CursoListar do contexto da aplicação
            telaAvaliacao.setVisible(true);
                //new TelaAvaliacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
