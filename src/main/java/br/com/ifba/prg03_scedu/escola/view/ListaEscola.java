package br.com.ifba.prg03_scedu.escola.view;

import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.escola.controller.EscolaIController;
import br.com.ifba.prg03_scedu.escola.entity.Escola;
import jakarta.persistence.NoResultException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Alef Almeida
 */
public class ListaEscola extends javax.swing.JFrame {

    private final EscolaIController escolaController;
            
    public ListaEscola(EscolaIController escolaController) {
        initComponents();
        this.escolaController = escolaController;
        carregarTabela();
    }

// Método para carregar os dados da tabela
private void carregarTabela() {
    // Verifica se o escolaController foi inicializado corretamente
    if (escolaController == null) {
        // Lança uma exceção ou loga um erro se escolaController não estiver inicializado
        throw new IllegalStateException("O controlador da escola não foi inicializado.");
    }

    // Obtém todas as escolas do banco de dados
    List<Escola> dadosTabela = escolaController.findAll();
    
    // Obtém o modelo da tabela (DefaultTableModel) da tabela exibida na interface gráfica
    DefaultTableModel dtmEscola = (DefaultTableModel) tblEscola.getModel();
    // Limpa todas as linhas atuais da tabela para preparar a inserção de novos dados
    dtmEscola.setRowCount(0);
    
    // Itera sobre a lista de escolas obtida do banco de dados
    for (Escola escola : dadosTabela) {
        // Cria um array de objetos contendo os dados de cada escola
        Object[] dados = {
            escola.getNome(),
            escola.getInep(), 
            escola.getModalidade(),
            escola.getTelefone(),
        };
        // Adiciona os dados da escola como uma nova linha no modelo da tabela
        dtmEscola.addRow(dados);
    }
    // Notifica a tabela que os dados foram atualizados para que a interface gráfica seja atualizada
    dtmEscola.fireTableDataChanged();
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEscola = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 89, 152));

        btnSearch.setText("jButton1");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setText("Adcionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblEscola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "INEP", "Modalidade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEscola);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnRefresh)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAdd)
                    .addComponent(btnVoltar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        EscolaAdd escolaAdd = new EscolaAdd(escolaController);
        escolaAdd.setVisible(true);
        
        // Adiciona um WindowListener para capturar o evento de fechamento da janela
         escolaAdd.addWindowListener(new java.awt.event.WindowAdapter() {
             @Override
             public void windowClosed(java.awt.event.WindowEvent e) {
                 // Quando a janela de cadastro é fechada, atualiza a tabela de escolas
                 carregarTabela();
             }
         });         
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        carregarTabela();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
          // TODO add your handling code here:
        
        // Obtém o nome da escola a ser pesquisado
        String nomeEscola = txtPesquisa.getText().trim(); // Use trim() para remover espaços em branco desnecessários

        // Criação da variável para dar início à pesquisa
        List<Escola> escolas;

        try {
            //Passsa as informações caso encontre a escola
            escolas = escolaController.findByNome(nomeEscola);

            // Se encontrado, atualiza a tabela com as esecola encontradas
            DefaultTableModel dtmEscolas = (DefaultTableModel) tblEscola.getModel();
            dtmEscolas.setRowCount(0);  // Limpa todos os dados da tabela

            if (escolas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Escola nao encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                carregarTabela(); // Carregar tabela com todas as escolas após a pesquisa
            } else {
                for (Escola escola : escolas) {
                    Object[] dados = {escola.getNome(), escola.getInep(), escola.getModalidade(), 
                        escola.getTelefone(), escola.getComplemento(), escola.getCep(), escola.getLogradouro(), escola.getBairro()};
                    dtmEscolas.addRow(dados);
                }
            }
        } catch (NoResultException e) {
            carregarTabela(); // Carregar tabela com todas as escolas após a pesquisa
            JOptionPane.showMessageDialog(null, "Escola nao encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar escola: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int row = tblEscola.getSelectedRow();
    if (row != -1) {
        String escolaInep = (String) tblEscola.getValueAt(row, 1); // Supondo que o Inep esteja na segunda coluna
        
        
        try {

            // Busca a escola pelo inep
            Escola escolas = new Escola();
            escolas = escolaController.findByInep(escolaInep);
            
            
            
            if (escolas != null) {
                // Pergunta ao usuário se deseja remover a escola
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja remover a escola?", "Confirmar Remoção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (resposta == JOptionPane.YES_OPTION) {
                    escolaController.delete(escolas);
                    JOptionPane.showMessageDialog(null, "escola removida com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Atualiza a tabela de dados (implementação não fornecida)
                    carregarTabela();
                    
                } else {
                    // Cancelar a operação
                    //em.getTransaction().rollback();
                    JOptionPane.showMessageDialog(null, "Remoção cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                // Escola não encontrada, lidar com isso apropriadamente
                JOptionPane.showMessageDialog(null, "Escola não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao remover a escola.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Nenhuma escola selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    
        int row = tblEscola.getSelectedRow(); // Obtém o índice da linha selecionada na tabela
        if (row != -1) { // Verifica se uma linha foi realmente selecionada
            String escolaInep = (String) tblEscola.getValueAt(row, 1); 

            try {
                Escola escola = new Escola();
                escola = escolaController.findByInep(escolaInep); // Busca a escola no banco de dados pelo ID

                if (escola != null) { // Verifica se a escola foi encontrada
                    // Abre a tela de edição e passa a escola como parâmetro
                    EscolaEditar escolaEditar = new EscolaEditar(escolaController, escola);
        escolaEditar.setVisible(true);
        
        // Adiciona um WindowListener para capturar o evento de fechamento da janela
         escolaEditar.addWindowListener(new java.awt.event.WindowAdapter() {
             @Override
             public void windowClosed(java.awt.event.WindowEvent e) {
                 // Quando a janela de cadastro é fechada, atualiza a tabela de escolas
                 carregarTabela();
             }
         });

                } else {
                    // Se a escola não for encontrada, exibe uma mensagem de aviso
                    JOptionPane.showMessageDialog(null, "Escola não encontrada.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    carregarTabela(); // Recarrega a tabela para garantir que todas as escolas estejam atualizadas
                }

            } catch (Exception e) {
                // Se ocorrer uma exceção, imprime o stack trace e exibe uma mensagem de erro
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao buscar o curso.", "Erro", JOptionPane.ERROR_MESSAGE);
            }    
    }//GEN-LAST:event_btnEditarActionPerformed
    }

    public static void main(String args[]) {
        
        ConfigurableApplicationContext context = 
            new SpringApplicationBuilder(Prg03SceduApplication.class)
            .headless(false)
            .run(args);

            ListaEscola listaEscola = context.getBean(ListaEscola.class);
            listaEscola.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEscola;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
