package br.com.ifba.gestaofaltas.view;

import br.com.ifba.gestaofaltas.controller.GestaoFaltasIController;
import br.com.ifba.gestaofaltas.entity.Alunos;
import br.com.ifba.gestaofaltas.entity.Falta;
import br.com.ifba.gestaofaltas.repository.GestaoFaltasRepository;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TelaListar extends javax.swing.JFrame {

    private final GestaoFaltasIController gestaoFaltasController;

    public TelaListar(GestaoFaltasIController gestaoFaltasController) {
        this.gestaoFaltasController = gestaoFaltasController;
        initComponents();
        carregarFaltas();
    }

    void carregarFaltas() {
        DefaultTableModel model = (DefaultTableModel) t_list.getModel();
        model.setRowCount(0); // Limpar tabela antes de carregar novos dados

        try {
            // Buscar as faltas do banco de dados
            List<Falta> faltas = gestaoFaltasController.findAll();

            // Adicionar os dados à tabela
            for (Falta falta : faltas) {
                model.addRow(new Object[]{falta.getAluno().getNomeSocial(), falta.getDisciplina(), falta.isJustificada()});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t_list = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_addFoul = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        bnt_editar = new javax.swing.JButton();
        bnt_remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Aluno", "Disciplina", "Justificada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t_list);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestão de Faltas");

        btn_addFoul.setText("Adicionar falta");
        btn_addFoul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addFoulMouseClicked(evt);
            }
        });
        btn_addFoul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addFoulActionPerformed(evt);
            }
        });

        txt_search.setText("Pesquisar");
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        btn_search.setText("Pesquisar");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        bnt_editar.setText("Editar");
        bnt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_editarMouseClicked(evt);
            }
        });

        bnt_remover.setText("Remover");
        bnt_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41)))
                        .addComponent(btn_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addFoul)
                        .addGap(18, 18, 18)
                        .addComponent(bnt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addFoul)
                    .addComponent(btn_search)
                    .addComponent(bnt_remover)
                    .addComponent(bnt_editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addFoulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addFoulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addFoulActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_addFoulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addFoulMouseClicked
        TelaEditar telaEditar = new TelaEditar(this, gestaoFaltasController); // Passa a janela principal e o controller
        telaEditar.setVisible(true); // Exibe o diálogo modal
    }//GEN-LAST:event_btn_addFoulMouseClicked

    private void bnt_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_editarMouseClicked
        // Verifica se há uma linha selecionada na tabela
    int selectedRow = t_list.getSelectedRow();
    if (selectedRow >= 0) {
        // Obtém o nome do aluno e a disciplina da linha selecionada
        String nomeAluno = t_list.getValueAt(selectedRow, 0).toString();
        String disciplina = t_list.getValueAt(selectedRow, 1).toString();
        boolean justificada = (Boolean) t_list.getValueAt(selectedRow, 2);

        try {
            // Busca o aluno pelo nome
            Alunos aluno = gestaoFaltasController.getAlunoByNome(nomeAluno);

            // Busca a falta correspondente
            List<Falta> faltas = gestaoFaltasController.findAll();
            Falta faltaToEdit = null;
            for (Falta falta : faltas) {
                if (falta.getAluno().equals(aluno) && falta.getDisciplina().equals(disciplina)) {
                    faltaToEdit = falta;
                    break;
                }
            }

            if (faltaToEdit != null) {
                // Abre a tela de edição com a falta selecionada
                TelaEditar telaEditar = new TelaEditar(this, gestaoFaltasController, faltaToEdit);
                telaEditar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Falta não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar a falta para edição.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma falta para editar.", "Erro", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_bnt_editarMouseClicked

    private void bnt_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_removerActionPerformed
         // Verifica se há uma linha selecionada na tabela
    int selectedRow = t_list.getSelectedRow();
    if (selectedRow >= 0) {
        // Obter o nome do aluno e a disciplina da linha selecionada
        String nomeAluno = t_list.getValueAt(selectedRow, 0).toString();
        String disciplina = t_list.getValueAt(selectedRow, 1).toString();

        try {
            // Buscar o aluno pelo nome
            Alunos aluno = gestaoFaltasController.getAlunoByNome(nomeAluno);

            // Buscar a falta correspondente
            List<Falta> faltas = gestaoFaltasController.findAll();
            Falta faltaToRemove = null;
            for (Falta falta : faltas) {
                if (falta.getAluno().equals(aluno) && falta.getDisciplina().equals(disciplina)) {
                    faltaToRemove = falta;
                    break;
                }
            }

            if (faltaToRemove != null) {
                // Remover a falta
                gestaoFaltasController.delete(faltaToRemove);

                // Atualizar a tabela
                carregarFaltas();

                // Exibir mensagem de sucesso
                JOptionPane.showMessageDialog(this, "Falta removida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Falta não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao remover a falta.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma falta para remover.", "Erro", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_bnt_removerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_editar;
    private javax.swing.JButton bnt_remover;
    private javax.swing.JButton btn_addFoul;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t_list;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
