/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.disciplina.view;

import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.disciplina.entity.Disciplina;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Flavio Junior
 */
public class TelaAtualizar extends javax.swing.JFrame {

    private Disciplina disciplinaNew = new Disciplina();
    
    private final DisciplinaIController disciplinaController;
    
    
    private void carregarTabela(Disciplina newDisciplina) {
    // Obtém o modelo da tabela
    DefaultTableModel dtmDisciplinas = (DefaultTableModel) tblDados.getModel();
    
    // Limpa todos os dados da tabela
    dtmDisciplinas.setRowCount(0);

    // Verifica se uma disciplina foi encontrada
    if (newDisciplina != null) {
        // Cria um array com os dados da disciplina encontrada
        Object[] dados = {newDisciplina.getId(), newDisciplina.getNome(), newDisciplina.getNomeAbreviado(), 
                        newDisciplina.getCargaHoraria(), newDisciplina.getBaseCurricular(), newDisciplina.isEstado()};
        
        // Adiciona uma linha na tabela com os dados da disciplina
        dtmDisciplinas.addRow(dados);
    } else {
        // Se nenhuma disciplina foi encontrada, exibe uma mensagem de aviso
        JOptionPane.showMessageDialog(this, "Curso não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
}
    
    private void atualizarDisciplina(Disciplina disciplina){
        // Define o nome da disciplina com base no texto inserido no campo de texto 'txtNome'
        disciplina.setNome(txtNome.getText());

        // Define o nome abreviado da disciplina com base no texto inserido no campo de texto 'txtNomeAbreviado'
        disciplina.setNomeAbreviado(txtNomeAbreviado.getText());

        // Define a carga horária da disciplina com base no texto inserido no campo de texto 'txtCargaHoraria'
        // O texto é convertido para um inteiro usando 'Integer.parseInt'
        disciplina.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));

        // Obtém a base curricular selecionada no combo box 'cmbBaseCurricular'
        String baseCurricular = cmbBaseCurricular.getSelectedItem().toString();

        // Usa um switch case para definir o campo 'baseCurricular' da disciplina de acordo com a seleção do usuário
        switch (baseCurricular) {
            case "Nacional": 
                disciplina.setBaseCurricular("Nacional");
                break;

            case "Diversificada": 
                disciplina.setBaseCurricular("Diversificada");
                break;

            case "Profissional": 
                disciplina.setBaseCurricular("Profissional");
                break;

            case "Religiosa": 
                disciplina.setBaseCurricular("Religiosa");
                break;

            default:
                // Trata um valor inválido; lança uma exceção se a base curricular selecionada não for válida
                throw new IllegalArgumentException("Base Curricular inválida: " + baseCurricular);
        }

        // Define o estado da disciplina (ativa ou inativa) com base na seleção feita no combo box 'cmbEstado'
        String estado = cmbEstado.getSelectedItem().toString();

        if (estado.equals("ATIVO")) {
            // Define o estado como ativo (true) se o estado selecionado for "ATIVO"
            disciplina.setEstado(true);
        } else {
            // Define o estado como inativo (false) para qualquer outra opção
            disciplina.setEstado(false);
        }

        try {
            // Tenta atualizar os dados da disciplina no banco de dados usando o controlador 'disciplinaController'
            disciplinaController.update(disciplina);
        } catch (Exception e) {
            // Se ocorrer uma exceção durante a atualização, ela é capturada e tratada aqui.

            // Imprime a pilha de rastreamento da exceção para o console, útil para depuração
            e.printStackTrace();

            // Mostra uma mensagem de erro para o usuário em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Erro ao alterar a disciplina.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    
   /**
 * Construtor da classe TelaAtualizar.
 * Este construtor cria uma nova instância de TelaAtualizar, inicializa os componentes da interface gráfica
 * e carrega os dados da disciplina que será atualizada.
 * 
 * @param disciplinaController instância do controlador de disciplina para gerenciar as operações.
 * @param disciplina a instância da disciplina que será atualizada.
 */
public TelaAtualizar(DisciplinaIController disciplinaController, Disciplina disciplina) {
    // Inicializa os componentes da interface gráfica (geralmente gerado automaticamente pelo IDE).
    initComponents();
    
    // Atribui o controlador de disciplina passado como argumento ao campo disciplinaController.
    this.disciplinaController = disciplinaController;
    
    // Copia os dados da disciplina fornecida para uma nova instância de Disciplina (disciplinaNew).
    // Isso permite que os dados sejam exibidos na interface gráfica para que o usuário possa editá-los.
    disciplinaNew.setId(disciplina.getId()); // Define o ID da nova disciplina com o ID da disciplina fornecida.
    disciplinaNew.setNome(disciplina.getNome()); // Define o nome.
    disciplinaNew.setNomeAbreviado(disciplina.getNomeAbreviado()); // Define o nome abreviado.
    disciplinaNew.setCargaHoraria(disciplina.getCargaHoraria()); // Define a carga horária.
    disciplinaNew.setBaseCurricular(disciplina.getBaseCurricular()); // Define a base curricular.
    disciplinaNew.setEstado(disciplina.isEstado()); // Define o estado (ativo/inativo).

    // Carrega a tabela (ou outros elementos da interface) com os dados da disciplina.
    // Esse método provavelmente preenche os campos da interface com os dados da disciplina a ser atualizada.
    carregarTabela(disciplina);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblNomeAbreviado = new javax.swing.JLabel();
        lblCargaHoraria = new javax.swing.JLabel();
        lblBaseCurricular = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNomeAbreviado = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        cmbBaseCurricular = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        btnAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "NomeAbreviado", "CargaHoraria", "BaseCurricular", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblDados);

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Digite o nome da disciplina:");

        lblNomeAbreviado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeAbreviado.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeAbreviado.setText("Digite o nome abreviado:");

        lblCargaHoraria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargaHoraria.setForeground(new java.awt.Color(255, 255, 255));
        lblCargaHoraria.setText("Digite a carga horária:");

        lblBaseCurricular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBaseCurricular.setForeground(new java.awt.Color(255, 255, 255));
        lblBaseCurricular.setText("Escolha a base curricular:");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Escolha o estado:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNomeAbreviado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCargaHoraria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbBaseCurricular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbBaseCurricular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Diversificada", "Profissional", "Religiosa" }));

        cmbEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(51, 153, 0));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 0, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeAbreviado)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeAbreviado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCargaHoraria)
                                .addGap(18, 18, 18)
                                .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblBaseCurricular)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbBaseCurricular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(lblNomeAbreviado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCargaHoraria)
                            .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBaseCurricular)
                            .addComponent(cmbBaseCurricular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstado)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeAbreviado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        //Fecha a tela TelaAtualizar
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        //Chamada do metodo de atualizar a disciplina
        atualizarDisciplina(disciplinaNew);
        //Fecha a tela TelaAtualizar
        this.dispose();
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
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizar(null).setVisible(true);
            }
        });*/
        
        ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class)
            .headless(false)
            .run(args);

            TelaAtualizar telaListar = context.getBean(TelaAtualizar.class);
            telaListar.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbBaseCurricular;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBaseCurricular;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeAbreviado;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeAbreviado;
    // End of variables declaration//GEN-END:variables
}
