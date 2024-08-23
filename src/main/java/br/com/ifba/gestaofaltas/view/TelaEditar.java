package br.com.ifba.gestaofaltas.view;

import br.com.ifba.gestaofaltas.controller.GestaoFaltasIController;
import br.com.ifba.gestaofaltas.entity.Alunos;
import br.com.ifba.gestaofaltas.entity.Falta;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TelaEditar extends JDialog {

    private final GestaoFaltasIController gestaoFaltasController;
    private Falta faltaAtual;

    public TelaEditar(TelaListar parent, GestaoFaltasIController gestaoFaltasController) {
        super(parent, "Editar", true); // Configura o JDialog como modal
        this.gestaoFaltasController = gestaoFaltasController;
        initComponents();
        setLocationRelativeTo(parent); // Centraliza o diálogo em relação à janela pai
        postAluno();
        getAlunos();
    }
    
     public TelaEditar(TelaListar parent, GestaoFaltasIController gestaoFaltasController, Falta falta) {
        super(parent, "Editar", true); // Configura o JDialog como modal
        this.gestaoFaltasController = gestaoFaltasController;
        this.faltaAtual = falta;
        initComponents();
        setLocationRelativeTo(parent); // Centraliza o diálogo em relação à janela pai
        postAluno();
        getAlunos();
        populateFields();
    }
     
     private void populateFields() {
        if (faltaAtual != null) {
            jComboBox2.setSelectedItem(faltaAtual.getAluno().getNomeSocial());
            jComboBox1.setSelectedItem(faltaAtual.getDisciplina());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            jTextField1.setText(sdf.format(faltaAtual.getData()));
            jCheckBox1.setSelected(faltaAtual.isJustificada());
            jTextArea1.setText(faltaAtual.getObservacoes());
        }
    }

    public void postAluno() {
        Date agora = new Date();
        Alunos aluno = new Alunos();

        aluno.setNomeSocial("Vittorio");
        aluno.setSexo('M');
        aluno.setGenero("Masculino");
        aluno.setRg("523456789");
        aluno.setOrgaoExpedidor("SSP");
        aluno.setDataEmissao(agora);
        aluno.setTituloEleitor("5234567890");

        try {
            gestaoFaltasController.saveAluno(aluno);
            JOptionPane.showMessageDialog(this, "Aluno cadastrado.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao cadastrar os alunos.", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void getAlunos() {
        try {
            // Buscar a lista de alunos do banco de dados
            List<Alunos> alunosList = gestaoFaltasController.getAllAlunos();

            // Limpar os itens existentes no JComboBox
            jComboBox2.removeAllItems();

            // Adicionar os alunos ao JComboBox
            for (Alunos aluno : alunosList) {
                jComboBox2.addItem(aluno.getNomeSocial());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao buscar os alunos.", "Sucesso", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Alunos buscarAlunoPorNome(String nome) throws RuntimeException {
        // Buscar todos os alunos
        List<Alunos> alunosList = gestaoFaltasController.getAllAlunos();

        // Procurar o aluno pelo nome
        for (Alunos aluno : alunosList) {
            if (aluno.getNomeSocial().equals(nome)) {
                return aluno;
            }
        }

        throw new RuntimeException("Aluno não encontrado: " + nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_save = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(0, 102, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aluno:");

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setEditable(true);
        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setBorder(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Disciplina:");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setEditable(true);
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programação Orientada a Objetos", "Análise de Sistemas" }));
        jComboBox1.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data:");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setText("22/09/2024");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(0, 102, 255));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Justificada");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Observações");

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 0, 0));
        btn_save.setText("Salvar");
        btn_save.setBorder(null);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 410, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addGap(59, 59, 59)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1))
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            // Obter os dados da interface
            String alunoName = jComboBox2.getSelectedItem().toString();
            String disciplina = jComboBox1.getSelectedItem().toString();
            String data = jTextField1.getText();
            boolean justificada = jCheckBox1.isSelected();
            String observacoes = jTextArea1.getText();

            // Verificação básica de campos obrigatórios
            if (alunoName.isEmpty() || disciplina.isEmpty() || data.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataEmissao = sdf.parse(data);

            Alunos aluno = buscarAlunoPorNome(alunoName);

            if (faltaAtual == null) {
                System.out.println("Adicionando nova falta.");
                // Criar uma nova falta
                Falta falta = new Falta();
                falta.setAluno(aluno);
                falta.setDisciplina(disciplina);
                falta.setData(dataEmissao);
                falta.setJustificada(justificada);
                falta.setObservacoes(observacoes);
                falta.setAula(data);

                // Salvar a nova falta
                gestaoFaltasController.save(falta);
                JOptionPane.showMessageDialog(this, "Falta salva com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Atualizando falta.");
                // Atualizar a falta existente
                faltaAtual.setAluno(aluno);
                faltaAtual.setDisciplina(disciplina);
                faltaAtual.setData(dataEmissao);
                faltaAtual.setJustificada(justificada);
                faltaAtual.setObservacoes(observacoes);
                faltaAtual.setAula(data);

                // Salvar as alterações
                gestaoFaltasController.update(faltaAtual);
                JOptionPane.showMessageDialog(this, "Falta atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }

            // Fechar a janela de edição
            this.dispose();

            // Atualizar a lista de faltas na tela principal (TelaListar)
            TelaListar parent = (TelaListar) getParent();
            parent.carregarFaltas();

        } catch (Exception e) {
            e.printStackTrace();
            // Exibir mensagem de erro
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao salvar a falta. Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
