package br.com.ifba.prg03_scedu.gestaoprofessor.view;

import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.disciplina.controller.DisciplinaIController;
import br.com.ifba.prg03_scedu.gestaoprofessor.controller.ProfessorIController;
import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Component;

/**
 *
 * @author hmart
 */

@Component

public class ProfessorView extends javax.swing.JFrame {

    /**
     * Creates new form ProfessorView
     */
    
    //Chamando o Controle de professor sendo privado não podendo ser chamado fora dessa classe e Final, só sendo o construtor para ser usar
    private final ProfessorIController professorControler; 
    //Chamando o relacionamento de Disciplina
    private final DisciplinaIController disciplinaController;
    
    
    @Autowired
    
    //Inicia a Tela e e manipulação dos dados no Banco de dados
    public ProfessorView(ProfessorIController professorControler, DisciplinaIController disciplinaController) {
        //Colocando dados nos controler
        this.professorControler = professorControler;
        this.disciplinaController = disciplinaController;
        initComponents();
        //Listandno o professor no métodos
        listarProfessor();
        //Não fechar o programa
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        txtn1 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDisciplina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        setForeground(java.awt.Color.green);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtn1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtn1.setForeground(new java.awt.Color(255, 255, 255));
        txtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtn1.setText("GESTÃO DE PROFESSOR");

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdicionar.setText("ADICIONAR PROFESSOR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR PROFESSOR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR PROFESSOR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "MATERIA", "NASCIMENTO", "FORMADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnAtualizar))
                .addContainerGap())
        );

        btnDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDisciplina.setText("Disciplina");
        btnDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtn1)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnDisciplina))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       //Voltar para Tela que chamou
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //Chamando a classe de cadastrar e Tornando o a interface Visível
        new ProfessorCadastrar(professorControler).setVisible(true);
        //Atualizando a Página caso tenha alguma alterção 
        listarProfessor();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //Pesquisando o professor pelo métodos
        pesquisarProfessor();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        //Criando o atributo de inteiro, pegando o selecionando da linha da tabela
       int selectedRow = jTable1.getSelectedRow();
       //Realizando a verificação ser é Válido a Seleção
        if (selectedRow != -1) {
            // Verifica se o valor na coluna 0 pode ser convertido para Long, sendo essa coluna ID
            try {
                //Pego o valor Selecionando pelo usuário
                Long id = (Long) jTable1.getValueAt(selectedRow, 0);
                
                //Verifico se encontra o professor informado
                Professor professor = professorControler.findById(id);

                //Verificando ser é Válido ou ser encontrou o Professor
                if (professor != null) {
                    //Confirmo a exclusão dos dados
                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir as informações do Professor(a): " 
                            + professor.getNome() + " ?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if (resposta == JOptionPane.YES_OPTION) {
                        //Chama a camada de controle para realizar a exclusão pelo id informado
                        professorControler.delete(id);
                        //Informo que a realização da exclusão foi realizada com sucesso
                        JOptionPane.showMessageDialog(null, "Deletado com sucesso!");

                        //Atualizo a lista
                        listarProfessor(); // Atualiza a lista de professores
                    }
                    //Tratos as exceções 
                } else {
                    JOptionPane.showMessageDialog(null, "Professor não encontrado!");
                }
            } catch (ClassCastException e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter o ID. Verifique o tipo de dado na tabela.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir professor: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha ou ID encontrado!");
        }
       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        //Vai Realizar A pesquisar do professor pelo métodos
        listarProfessor();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       //Editando os dados pela mesma lógica de pesquisar
       //Pegando a seleção da tabela e criando no atributos de inteiro
        int selectedRow = jTable1.getSelectedRow();
        
        //Verificando ser é válido a seleção
        if(selectedRow != -1){
            //Pegando o id do tabela que está o professor
            long id = (long) jTable1.getValueAt(selectedRow, 0);
            
            //Realizando a pesquisa no Controller pelo ID
            Professor professor = professorControler.findById(id);
            
            //Verificando ser o professor encontrado é válido
            if(professor != null){
                //Chamando a tela de Editar com o controler e os dados do professor encontrado
                new ProfessorEditar(professorControler, professor).setVisible(true);
                //Realizar a atualição dos dados
                listarProfessor();
            }else{
                //erro ao encontrar Professor
                JOptionPane.showMessageDialog(null, "Professor não encontrado!");
            }
        }else {
            //Não selecionado a Linha
            JOptionPane.showMessageDialog(null, "Nenhuma linha ou ID encontrado!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
       //Chama o método de atualizar a tabela
        pesquisarProfessor();
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinaActionPerformed
        //(**Relações**)Verificando Disciplina Cadastrada
        new ProfessorDisciplina(professorControler, disciplinaController).setVisible(true);
    }//GEN-LAST:event_btnDisciplinaActionPerformed

    
    public void listarProfessor(){
        //Criando o modelo de tabela
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //Apagar todos os Dados
        model.setRowCount(0);
        
        //Busca todos os professor e jogar em um Array List pegando da entidade Professor
        List<Professor> professorList = professorControler.findAll();
        
        //Adicionado em uma linha do Jtable
        for (Professor professor : professorList){
            //Adicionando dados no ArrayList
            model.addRow(new Object[]{
               professor.getId(),
               professor.getNome(),
               professor.getCpf(),
               professor.getMateria(),
               professor.getNascimento(),
               professor.getFormado()
            });
        }
    }
    
    private void pesquisarProfessor(){
        
        //Iniciando a variável nulo da entidade de Professor
        Professor professorBusca = null;
        //Salvando o dados selecionado em String
        String idstr = txtPesquisar.getText();
        
        //Verificando Caso tenha 
        if (idstr == null || idstr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira corretamente o nome/id do professor(a).");
            return;
        }

        try {
            //Pesquisando pelo ID
            long id;
            
            //Convertendo para Pesquisar pelo Id
            id = Long.parseLong(idstr);
            
            //Verificando No Banco de dados chamando o controler
            professorBusca = professorControler.findById(id);
            
            //Verificando se não achou o professor
            if (professorBusca == null) {
                JOptionPane.showMessageDialog(this, "Professor não encontrado.");
            } else {

                //Criando a Tabela de dados na tabela criado
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                // Apagar todos os dados
                model.setRowCount(0);

                // Adicionar nova linha com os dados do professor
                model.addRow(new Object[]{
                    professorBusca.getId(),
                    professorBusca.getNome(),
                    professorBusca.getCpf(),
                    professorBusca.getMateria(),
                    professorBusca.getNascimento(),
                    professorBusca.getFormado()
                });
            }
        } catch (NumberFormatException e) {
            //Pesquisando pelo nome procurando no banco chamando no controller
            List<Professor> professores = professorControler.findByNome(idstr);
        
            //Verificando se encontrou o professor
            if(professores == null){
                JOptionPane.showMessageDialog(null, "Professor não encontrado");
                return;
            }
            
            //Criando a tabela de dados de banco de dados
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            //Adicionando cada Professor encontrado à tabela
            for(Professor p : professores){
                model.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getCpf(),
                    p.getMateria(),
                    p.getNascimento(),
                    p.getFormado()
                });
            }
            //Finalizado
            return;
        }
        
    }
    
    public static void main(String args[]) {     
        
        
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Prg03SceduApplication.class).headless(false).run(args);

        ProfessorView professorView = context.getBean(ProfessorView.class);
        professorView.setVisible(true);
            
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDisciplina;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JLabel txtn1;
    // End of variables declaration//GEN-END:variables

    

}
