/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.serie.view;

import br.com.ifba.prg03_scedu.serie.controller.SerieIController;
import br.com.ifba.prg03_scedu.serie.entity.Serie;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.springframework.stereotype.Component;

/**
 *
 * @author geovana
 */
@Component
public class SerieCadastrar extends javax.swing.JFrame {
      
    private SerieListar serieListar;
    
    private final SerieIController serieController;
    
    /**
     * Creates new form SerieTela
     */
    public SerieCadastrar(SerieIController serieController) {

        initComponents();
        this.serieController = serieController;
        this.serieListar = new SerieListar(serieController);
         
        //Nao encerra o programa ao fechar a tela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Cor de fundo da tela
        getContentPane().setBackground(new java.awt.Color(8, 102, 255));
        
        //Cor de fundo do painel
        jPanel1.setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCadastrarSerie = new javax.swing.JLabel();
        lblNomeSerie = new javax.swing.JLabel();
        lblIdCurriculo = new javax.swing.JLabel();
        txtNomeSerie = new javax.swing.JTextField();
        txtIdCurriculo = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnListarSerie = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastrarSerie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadastrarSerie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrarSerie.setText("CADASTRAR SERIE");

        lblNomeSerie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeSerie.setText("Nome:");

        lblIdCurriculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdCurriculo.setText("Id Curriculo:");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnListarSerie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListarSerie.setText("Listar Series");
        btnListarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCadastrarSerie)
                .addGap(139, 139, 139))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdCurriculo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarSerie)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCadastrarSerie)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeSerie)
                        .addGap(8, 8, 8)
                        .addComponent(lblIdCurriculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtIdCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        long curriculoId = Long.parseLong(txtIdCurriculo.getText());
        Serie serie = new Serie();

        //Logica para cadastrar no banco de dados
        try {
            //Seta os dados e usa o controller para salvar no banco
            serie.setNome(txtNomeSerie.getText());
            serie.setCurriculoId(curriculoId);
           serieController.save(serie); 
        } catch (Exception error) {
            //Tratamento de execoes
            JOptionPane.showMessageDialog(null, error, "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(this, "Serie cadastrada com sucesso!");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//nao fecha a janela ao encerrar o programa

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarSerieActionPerformed
        // TODO add your handling code here:
        
        //A tela eh aberta
       this.serieListar.setVisible(true);
    }//GEN-LAST:event_btnListarSerieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new SerieCadastrar().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListarSerie;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrarSerie;
    private javax.swing.JLabel lblIdCurriculo;
    private javax.swing.JLabel lblNomeSerie;
    private javax.swing.JTextField txtIdCurriculo;
    private javax.swing.JTextField txtNomeSerie;
    // End of variables declaration//GEN-END:variables
}


