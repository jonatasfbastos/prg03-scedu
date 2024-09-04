package br.com.ifba.prg03_scedu.faltas.view;

import br.com.ifba.prg03_scedu.faltas.controller.GestaoFaltasIController;
import br.com.ifba.prg03_scedu.faltas.entity.Falta;

import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import org.springframework.stereotype.Component;

@Component
public class FaltasListar extends javax.swing.JFrame {

    private final GestaoFaltasIController gestaoFaltasController;

    public FaltasListar(GestaoFaltasIController gestaoFaltasController) {
        this.gestaoFaltasController = gestaoFaltasController;
        initComponents();
        carregarFaltas();
    }

    private List<Falta> loadFaltas() {
        try {
            // Buscar as faltas do banco de dados
            List<Falta> faltas = gestaoFaltasController.findAll();
            return faltas;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    void carregarFaltas() {
        DefaultTableModel model = (DefaultTableModel) t_list.getModel();
        model.setRowCount(0); // Limpar tabela antes de carregar novos dados

        List<Falta> faltas = loadFaltas();

        // Adicionar os dados à tabela
        for (Falta falta : faltas) {
            model.addRow(new Object[]{falta.getAluno().getNomeSocial(), falta.getDisciplina().getNome(), falta.isJustificada()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_addFoul = new javax.swing.JButton();
        bnt_editar = new javax.swing.JButton();
        bnt_remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_list = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestão de Faltas");

        txt_search.setForeground(new java.awt.Color(51, 51, 51));
        txt_search.setBorder(null);
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        btn_search.setForeground(new java.awt.Color(51, 51, 51));
        btn_search.setText("Pesquisar");
        btn_search.setBorder(null);
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
        });
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_addFoul.setForeground(new java.awt.Color(51, 51, 51));
        btn_addFoul.setText("Adicionar falta");
        btn_addFoul.setBorder(null);
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

        bnt_editar.setForeground(new java.awt.Color(51, 51, 51));
        bnt_editar.setText("Editar");
        bnt_editar.setBorder(null);
        bnt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_editarMouseClicked(evt);
            }
        });

        bnt_remover.setBackground(new java.awt.Color(255, 51, 51));
        bnt_remover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bnt_remover.setForeground(new java.awt.Color(255, 255, 255));
        bnt_remover.setText("Remover");
        bnt_remover.setBorder(null);
        bnt_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_removerActionPerformed(evt);
            }
        });

        t_list.setForeground(new java.awt.Color(51, 51, 51));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(btn_addFoul, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_addFoul, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        FaltasEditar telaEditar = new FaltasEditar(this, gestaoFaltasController); // Passa a janela principal e o controller
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
            AlunosPrincipal aluno = gestaoFaltasController.getAlunoByNome(nomeAluno);

            // Busca a falta correspondente
            List<Falta> faltas = gestaoFaltasController.findAll();
            Falta faltaToEdit = null;
            for (Falta falta : faltas) {
                if (falta.getAluno().equals(aluno) && falta.getDisciplina().getNome().equals(disciplina)) {
                    faltaToEdit = falta;
                    break;
                }
            }

            if (faltaToEdit != null) {
                // Abre a tela de edição com a falta selecionada
                FaltasEditar telaEditar = new FaltasEditar(this, gestaoFaltasController, faltaToEdit);
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
            AlunosPrincipal aluno = gestaoFaltasController.getAlunoByNome(nomeAluno);

            // Buscar a falta correspondente
            List<Falta> faltas = gestaoFaltasController.findAll();
            Falta faltaToRemove = null;
            for (Falta falta : faltas) {
                if (falta.getAluno().equals(aluno) && falta.getDisciplina().getNome().equals(disciplina)) {
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

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {
        String alunoNome = txt_search.getText();
        DefaultTableModel model = (DefaultTableModel) t_list.getModel();
        model.setRowCount(0); // Limpar a tabela antes de carregar novos dados

        if (!alunoNome.isEmpty()) {
            // Carregar a lista de faltas
            List<Falta> faltas = loadFaltas();

            // Filtrar as faltas pelo nome do aluno
            List<Falta> faltasFiltradas = faltas.stream()
                    .filter(falta -> falta.getAluno() != null
                            && falta.getAluno().getNomeSocial()!= null
                            && falta.getAluno().getNomeSocial().equalsIgnoreCase(alunoNome))
                    .collect(Collectors.toList());

            // Exibir resultados na tabela
            if (!faltasFiltradas.isEmpty()) {
                for (Falta falta : faltasFiltradas) {
                    model.addRow(new Object[]{
                            falta.getAluno() != null ? falta.getAluno().getNomeSocial() : "Nome não disponível",
                            falta.getDisciplina().getNome(),
                            falta.isJustificada()
                    });
                }
            } else {
                // Se não houver resultados, pesquise no banco de dados
                AlunosPrincipal aluno = new AlunosPrincipal();
                aluno.setNome(alunoNome);

                // Pesquisar no banco de dados
                List<Falta> faltasBanco = gestaoFaltasController.findByAluno(aluno);

                if (!faltasBanco.isEmpty()) {
                    for (Falta falta : faltasBanco) {
                        model.addRow(new Object[]{
                                falta.getAluno() != null ? falta.getAluno().getNomeSocial() : "Nome não disponível",
                                falta.getDisciplina().getNome(),
                                falta.isJustificada()
                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Nenhum resultado encontrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, insira um termo para pesquisar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            carregarFaltas(); // Recarregar a tabela com todas as faltas se o termo de busca estiver vazio
        }
    }


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t_list;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
