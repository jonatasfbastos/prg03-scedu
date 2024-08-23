package br.com.ifba.gestaoescolas.view;

import br.com.ifba.gestaoescolas.entity.Escola;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.stereotype.Component;
import br.com.ifba.gestaoescolas.controller.EscolaIController;
import jakarta.annotation.PostConstruct;
import java.util.Optional;

@Component
public class ListaEscola extends javax.swing.JFrame {

    private List<Escola> escolas;

    //@Autowired
    private EscolaIController escolaController;

    
    public ListaEscola() {
        
    }
    
    @PostConstruct
    private void init(){
    
    initComponents();
      // Carrega as escolas na tabela, se necessário
}
    void carregarTabela(){
        List<Escola> dadosTabela = escolaController.findAll();

        // Obtém o modelo de tabela do componente tableInfo, que é do tipo DefaultTableModel
        DefaultTableModel dtmAvalicoes = (DefaultTableModel) tblEscola.getModel();

        dtmAvalicoes.setRowCount(0);

        for (Escola lista: dadosTabela){
            Object[] dados = {lista.getCodigoINEP(), lista.getCep(), lista.getBairro(), lista.getLogradouro(), 
                lista.getComplemento(), lista.getTelefone(), lista.getModalidade()};

            dtmAvalicoes.addRow(dados);

            }
        dtmAvalicoes.fireTableDataChanged();
    }

    private void updateTable(List<Escola> escolas) {
        DefaultTableModel model = (DefaultTableModel) tblEscola.getModel();
        model.setRowCount(0);

        for (Escola escola : escolas) {
            model.addRow(new Object[]{escola.getCodigoINEP(), escola.getNome(), escola.getCodigoINEP()});
        }
    }

   public void loadAllEscolas() {
    try {
        escolas = escolaController.findAll();
        System.out.println("Escolas carregadas: " + escolas.size()); // Verificar o número de escolas carregadas
        updateTable(escolas);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar escolas: " + e.getMessage());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEscola = new javax.swing.JTable();
        btnAddEscola = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 89, 152));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        tblEscola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cod. INEP", "Modalidade", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblEscola);

        btnAddEscola.setText("Adcionar Nova Escola");
        btnAddEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEscolaActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("jButton1");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddEscola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEscola)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnRefresh))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEscolaActionPerformed
          AddEscola addEscola = new AddEscola((EscolaIController) escolaController, this);
          addEscola.setVisible(true);        
    }//GEN-LAST:event_btnAddEscolaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultTableModel dtmEscolas = (DefaultTableModel) tblEscola.getModel();
    if (tblEscola.getSelectedRow() != -1) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == JOptionPane.YES_OPTION) {
            String codigoINEP = (String) tblEscola.getValueAt(tblEscola.getSelectedRow(), 2); // Assumindo que Código INEP está na coluna 2
            try {
                // Buscar a escola pelo código INEP
                Optional<Escola> escola = escolaController.buscarPorCodigoINEP(codigoINEP);

                if (escola != null) {
                    // Deletar a escola
                    escolaController.delete(escola);
                    // Remover a linha da tabela
                    dtmEscolas.removeRow(tblEscola.getSelectedRow());
                    JOptionPane.showMessageDialog(this, "Escola excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Escola não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir escola: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecione uma escola para excluir", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //loadAllEscolas();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String busca = txtBuscar.getText();
        try {
            Escola escola = (Escola) escolaController.findByNome(busca);
            DefaultTableModel dtmEscolas = (DefaultTableModel) tblEscola.getModel();
            dtmEscolas.setRowCount(0); // Limpa todos os dados da tabela

            if (escola != null) {
                Object[] dados = {escola.getCodigoINEP(), escola.getNome()};
                dtmEscolas.addRow(dados);
            } else {
                JOptionPane.showMessageDialog(null, "Escola não encontrada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar escola: " + e.getMessage());
        }   
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String busca = txtBuscar.getText();
        try {
            List<Escola> escolas = escolaController.findByNome(busca);
            if (!escolas.isEmpty()) {
                updateTable(escolas);
            } else {
                JOptionPane.showMessageDialog(this, "Nenhuma escola encontrada!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar escolas: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed


public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                ConfigurableApplicationContext context = 
//                    new SpringApplicationBuilder(Prg03SceduApplication.class).
//                    headless(false).run(args); // Configura e inicia o contexto da aplicação Spring, desabilitando o modo headless
//            
//            ListaEscola listaEscola = context.getBean(ListaEscola.class); // Obtém o bean CursoListar do contexto da aplicação
//            listaEscola.setVisible(true);
             new ListaEscola().setVisible(true);
            }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEscola;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEscola;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
