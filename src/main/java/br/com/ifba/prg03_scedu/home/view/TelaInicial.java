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
import br.com.ifba.prg03_scedu.gestaoprofessor.controller.ProfessorIController;
import br.com.ifba.prg03_scedu.gestaoprofessor.view.ProfessorView;
import br.com.ifba.prg03_scedu.gestavaliacao.controller.AvaliacaoIController;
import br.com.ifba.prg03_scedu.gestavaliacao.view.TelaAvaliacoes;
import br.com.ifba.prg03_scedu.serie.controller.SerieIController;
import br.com.ifba.prg03_scedu.serie.view.SerieCadastrar;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioController;
import br.com.ifba.prg03_scedu.usuario.controller.UsuarioIController;
import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import br.com.ifba.prg03_scedu.usuario.view.TelaLogin;
import br.com.ifba.prg03_scedu.usuario.view.UsuarioListar;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private final ProfessorIController professorController;
    private final SerieIController serieController;
    private JLabel lblHora;
    
    public TelaInicial(
        DisciplinaIController disciplinaController,
        CurriculoIController curriculoController,
        GestaoFaltasIController gestaoFaltasController,
        CursoIController cursoController,
        UsuarioIController usuarioController,
        EscolaIController escolaController,
        AvaliacaoIController avaliacaoController,
        GestaoAlunoIController gestaoAlunoController,
        ProfessorIController professorController,
        SerieIController serieController

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
        this.professorController = professorController;
        this.serieController = serieController;

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        adicionarRelogio();
        atualizarInformacoesUsuario();
    }
    
    public void setUsuarioInfo(Usuario usuario) {
        lblNome.setText(usuario.getNome());
        lblEmail.setText(usuario.getEmail());
    }
    
    private void atualizarInformacoesUsuario() {
    // Obtenha o usuário logado e defina as informações nas labels
    Usuario usuario = UsuarioController.getUsuarioLogado();
    if (usuario != null) {
        setUsuarioInfo(usuario);
    } else {
        // Trate o caso onde não há usuário logado, se necessário
        lblNome.setText("Usuário não logado");
        lblEmail.setText("");
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDisciplina = new javax.swing.JButton();
        bntFaltas = new javax.swing.JButton();
        btnCurriculo = new javax.swing.JButton();
        btnCurso1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEscolas = new javax.swing.JButton();
        btnAva = new javax.swing.JButton();
        btnGestaoAluno = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSerie = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelRelogio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        btnDisciplina.setBackground(new java.awt.Color(0, 51, 255));
        btnDisciplina.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        btnDisciplina.setText("Disciplina");
        btnDisciplina.setAlignmentX(0.5F);
        btnDisciplina.setBorder(null);
        btnDisciplina.setBorderPainted(false);
        btnDisciplina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisciplinaActionPerformed(evt);
            }
        });

        bntFaltas.setBackground(new java.awt.Color(0, 51, 255));
        bntFaltas.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        bntFaltas.setForeground(new java.awt.Color(255, 255, 255));
        bntFaltas.setText("Faltas");
        bntFaltas.setAlignmentX(0.5F);
        bntFaltas.setBorder(null);
        bntFaltas.setBorderPainted(false);
        bntFaltas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bntFaltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntFaltasMouseClicked(evt);
            }
        });

        btnCurriculo.setBackground(new java.awt.Color(0, 51, 255));
        btnCurriculo.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnCurriculo.setForeground(new java.awt.Color(255, 255, 255));
        btnCurriculo.setText("Curriculo");
        btnCurriculo.setAlignmentX(0.5F);
        btnCurriculo.setBorder(null);
        btnCurriculo.setBorderPainted(false);
        btnCurriculo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurriculoActionPerformed(evt);
            }
        });

        btnCurso1.setBackground(new java.awt.Color(0, 51, 255));
        btnCurso1.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnCurso1.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso1.setText("Curso");
        btnCurso1.setAlignmentX(0.5F);
        btnCurso1.setBorder(null);
        btnCurso1.setBorderPainted(false);
        btnCurso1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Gestão de Usuários");
        jButton1.setAlignmentX(0.5F);
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEscolas.setBackground(new java.awt.Color(0, 51, 255));
        btnEscolas.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnEscolas.setForeground(new java.awt.Color(255, 255, 255));
        btnEscolas.setText("Escolas");
        btnEscolas.setAlignmentX(0.5F);
        btnEscolas.setBorder(null);
        btnEscolas.setBorderPainted(false);
        btnEscolas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEscolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolasActionPerformed(evt);
            }
        });

        btnAva.setBackground(new java.awt.Color(0, 51, 255));
        btnAva.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnAva.setForeground(new java.awt.Color(255, 255, 255));
        btnAva.setText("Gestao Avaliacoes");
        btnAva.setAlignmentX(0.5F);
        btnAva.setBorder(null);
        btnAva.setBorderPainted(false);
        btnAva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaActionPerformed(evt);
            }
        });

        btnGestaoAluno.setBackground(new java.awt.Color(0, 51, 255));
        btnGestaoAluno.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnGestaoAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnGestaoAluno.setText("Alunos");
        btnGestaoAluno.setAlignmentX(0.5F);
        btnGestaoAluno.setBorder(null);
        btnGestaoAluno.setBorderPainted(false);
        btnGestaoAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestaoAlunoActionPerformed(evt);
            }
        });

        btnProfessor.setBackground(new java.awt.Color(0, 51, 255));
        btnProfessor.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btnProfessor.setText("Gestão de Professor");
        btnProfessor.setAlignmentX(0.5F);
        btnProfessor.setBorder(null);
        btnProfessor.setBorderPainted(false);
        btnProfessor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("nome");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("email");

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSerie.setBackground(new java.awt.Color(0, 51, 255));
        btnSerie.setFont(new java.awt.Font("Alef", 0, 14)); // NOI18N
        btnSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnSerie.setText("Serie");
        btnSerie.setAlignmentX(0.5F);
        btnSerie.setBorder(null);
        btnSerie.setBorderPainted(false);
        btnSerie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAva, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEscolas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGestaoAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntFaltas)
                .addGap(18, 18, 18)
                .addComponent(btnCurso1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnEscolas)
                .addGap(18, 18, 18)
                .addComponent(btnAva)
                .addGap(18, 18, 18)
                .addComponent(btnGestaoAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfessor)
                .addGap(18, 18, 18)
                .addComponent(btnCurriculo)
                .addGap(15, 15, 15)
                .addComponent(btnSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Seja Bem-Vindo.");

        painelRelogio.setBackground(new java.awt.Color(255, 255, 255));
        painelRelogio.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelRelogioLayout = new javax.swing.GroupLayout(painelRelogio);
        painelRelogio.setLayout(painelRelogioLayout);
        painelRelogioLayout.setHorizontalGroup(
            painelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );
        painelRelogioLayout.setVerticalGroup(
            painelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


// Método para adicionar o relógio
private void adicionarRelogio() {
    lblHora = new JLabel();
    lblHora.setFont(new java.awt.Font("Segoe UI", 0, 14));
    lblHora.setForeground(Color.WHITE);
    lblHora.setHorizontalAlignment(SwingConstants.RIGHT);
    
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            lblHora.setText(sdf.format(new Date()));
        }
    });
    timer.start();
    
    // Adicionar lblHora ao painelTopo
    painelRelogio.add(lblHora, BorderLayout.EAST);
}

/*
// Método para adicionar o calendário
private void adicionarCalendario() {
    JCalendar calendario = new JCalendar();
    calendario.setPreferredSize(new Dimension(200, 150));
    
    JPanel painelCalendario = new JPanel(new BorderLayout());
    painelCalendario.setBorder(BorderFactory.createTitledBorder("Calendário"));
    painelCalendario.add(calendario, BorderLayout.CENTER);
    
    // Adicionar painelCalendario ao layout principal
    getContentPane().add(painelCalendario, BorderLayout.WEST);
}
*/
    
    private void btnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinaActionPerformed
        // TODO add your handling code here:
        DisciplinaListar listar = new DisciplinaListar(disciplinaController, professorController, cursoController);
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
        TelaAvaliacoes telaAva = new TelaAvaliacoes(avaliacaoController, disciplinaController, professorController);
        telaAva.setVisible(true);
    }//GEN-LAST:event_btnAvaActionPerformed

    private void btnGestaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestaoAlunoActionPerformed
        // TODO add your handling code here:
        TelaListar telaAluno = new TelaListar(gestaoAlunoController);
        telaAluno.setVisible(true);
    }//GEN-LAST:event_btnGestaoAlunoActionPerformed

    private void btnProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorActionPerformed
        ProfessorView professrView = new ProfessorView(professorController);
        professrView.setVisible(true);
        professrView.toFront();
    }//GEN-LAST:event_btnProfessorActionPerformed

    private void btnSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerieActionPerformed
        // TODO add your handling code here:
        SerieCadastrar telaSerie = new SerieCadastrar(serieController, curriculoController);
        telaSerie.setVisible(true);
    }//GEN-LAST:event_btnSerieActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        // Abrir a TelaInicial
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Prg03SceduApplication.class).headless(false).run();
        TelaLogin telaLogin = context.getBean(TelaLogin.class);
        telaLogin.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
/*
    private void btnSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurriculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCurriculo1ActionPerformed
*/
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
    private javax.swing.JButton btnProfessor;
    private javax.swing.JButton btnSerie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel painelRelogio;
    // End of variables declaration//GEN-END:variables
}
