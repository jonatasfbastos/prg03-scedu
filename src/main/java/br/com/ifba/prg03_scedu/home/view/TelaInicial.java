/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.home.view;

import br.com.ifba.prg03_scedu.disciplina.view.DisciplinaListar;
import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.curriculo.controller.CurriculoIController;
import br.com.ifba.prg03_scedu.curriculo.view.CurriculoListar;
import br.com.ifba.prg03_scedu.curso.controller.CursoIController;
import br.com.ifba.prg03_scedu.curso.view.CursoListar;
import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.escola.controller.EscolaIController;
import br.com.ifba.prg03_scedu.escola.view.ListaEscola;
import br.com.ifba.prg03_scedu.faltas.controller.GestaoFaltasIController;
import br.com.ifba.prg03_scedu.faltas.view.FaltasListar;
import br.com.ifba.prg03_scedu.gestaoalunos.controller.GestaoAlunoIController;
import br.com.ifba.prg03_scedu.gestaoalunos.view.TelaListar;
import br.com.ifba.prg03_scedu.gestavaliacao.controller.AvaliacaoIController;
import br.com.ifba.prg03_scedu.gestavaliacao.view.TelaAvaliacoes;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioIController;
import br.com.ifba.prg03_scedu.usuario.view.UsuarioListar;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Micro
 */
public class TelaInicial extends javax.swing.JFrame {

    private final CurriculoIController curriculoController;
    private final CursoIController cursoController;
    private final DisciplinaIController disciplinaController;
    private final GestaoFaltasIController gestaoFaltasController;
    private final UsuarioIController usuarioController;
    private final EscolaIController escolaController;
    private final AvaliacaoIController avaliacaoController;
    private final GestaoAlunoIController gestaoAlunoController;
    
    public TelaInicial(
        DisciplinaIController disciplinaController,
        CurriculoIController curriculoController,
        GestaoFaltasIController gestaoFaltasController,
        CursoIController cursoController,
        UsuarioIController usuarioController,
        EscolaIController escolaController,
        AvaliacaoIController avaliacaoController,
        GestaoAlunoIController gestaoAlunoController
    ) {
        initComponents();
        this.curriculoController = curriculoController;
        this.disciplinaController = disciplinaController;
        this.cursoController = cursoController;
        this.gestaoFaltasController = gestaoFaltasController;
        this.usuarioController = usuarioController;
        this.escolaController = escolaController;
        this.avaliacaoController = avaliacaoController;
        this.gestaoAlunoController = gestaoAlunoController;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDisciplina = new javax.swing.JButton();
        bntFaltas = new javax.swing.JButton();
        btnCurriculo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCurso1 = new javax.swing.JButton();
        btnEscolas = new javax.swing.JButton();
        btnAva = new javax.swing.JButton();
        btnGestaoAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDisciplina.setText("Disciplina");
        btnDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisciplinaActionPerformed(evt);
            }
        });

        bntFaltas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntFaltas.setText("Faltas");
        bntFaltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntFaltasMouseClicked(evt);
            }
        });

        btnCurriculo.setText("Curriculo");
        btnCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurriculoActionPerformed(evt);
            }
        });

        jButton1.setText("Gestão de Usuários");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCurso1.setText("Curso");
        btnCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso1ActionPerformed(evt);
            }
        });

        btnEscolas.setText("Escolas");
        btnEscolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolasActionPerformed(evt);
            }
        });

        btnAva.setText("GestaoAvaliacoes");
        btnAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaActionPerformed(evt);
            }
        });

        btnGestaoAluno.setText("Alunos");
        btnGestaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestaoAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAva)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(btnCurriculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEscolas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCurso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(118, 118, 118)
                .addComponent(btnGestaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnCurso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestaoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscolas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAva)
                .addContainerGap(714, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinaActionPerformed
        // TODO add your handling code here:
        DisciplinaListar listar = new DisciplinaListar(disciplinaController);
        listar.setVisible(true);
        listar.toFront();
    }//GEN-LAST:event_btnDisciplinaActionPerformed

    private void btnCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurriculoActionPerformed
        // TODO add your handling code here:
        CurriculoListar curriculoListar = new CurriculoListar(curriculoController, disciplinaController);
        curriculoListar.setVisible(true);
        curriculoListar.toFront();
    }//GEN-LAST:event_btnCurriculoActionPerformed

    private void bntFaltasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntFaltasMouseClicked
        FaltasListar listar = new FaltasListar(gestaoFaltasController);
        listar.setVisible(true);
        listar.toFront();
    }//GEN-LAST:event_bntFaltasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UsuarioListar usuarioListar = new UsuarioListar(usuarioController);
        usuarioListar.setVisible(true);
        usuarioListar.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso1ActionPerformed
        CursoListar listar = new CursoListar(cursoController);
        listar.setVisible(true);
        listar.toFront();
    }//GEN-LAST:event_btnCurso1ActionPerformed

    private void btnEscolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolasActionPerformed
        ListaEscola listaEscola = new ListaEscola(escolaController);
        listaEscola.setVisible(true);
        listaEscola.toFront();
    }//GEN-LAST:event_btnEscolasActionPerformed

    private void btnAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaActionPerformed
        // TODO add your handling code here:
        TelaAvaliacoes telaAva = new TelaAvaliacoes(avaliacaoController);
        telaAva.setVisible(true);
    }//GEN-LAST:event_btnAvaActionPerformed

    private void btnGestaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestaoAlunoActionPerformed
        // TODO add your handling code here:
        TelaListar telaAluno = new TelaListar(gestaoAlunoController);
        telaAluno.setVisible(true);
    }//GEN-LAST:event_btnGestaoAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(Prg03SceduApplication.class)
                        .headless(false)
                        .run(args);

        TelaInicial telaInicial = context.getBean(TelaInicial.class);
        telaInicial.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntFaltas;
    private javax.swing.JButton btnAva;
    private javax.swing.JButton btnCurriculo;
    private javax.swing.JButton btnCurso1;
    private javax.swing.JButton btnDisciplina;
    private javax.swing.JButton btnEscolas;
    private javax.swing.JButton btnGestaoAluno;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
