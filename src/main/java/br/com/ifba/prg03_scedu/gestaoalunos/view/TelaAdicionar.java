
package br.com.ifba.prg03_scedu.gestaoalunos.view;

import br.com.ifba.prg03_scedu.gestaoalunos.controller.GestaoAlunoIController;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import br.com.ifba.prg03_scedu.endereco.controller.EnderecoIController;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.Responsaveis;
import br.com.ifba.prg03_scedu.endereco.entity.Endereco;
import br.com.ifba.prg03_scedu.endereco.entity.EnderecoId;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


//@RequiredArgsConstructor
public class TelaAdicionar extends javax.swing.JFrame {
    //Atributo usado na classe
    private static final Logger log = LoggerFactory.getLogger(TelaAdicionar.class);
    private final GestaoAlunoIController gestaoAlunoController;
    private final EnderecoIController enderecoController;

    public TelaAdicionar(GestaoAlunoIController gestaoAlunoController, EnderecoIController enderecoController) {
        this.gestaoAlunoController = gestaoAlunoController;
        this.enderecoController = enderecoController;
        log.info("Inicializando componentes da tela de listagem de alunos");
        initComponents();
        pnlAlergiaOutro.setVisible(false);
        pnlCondicoesMedicasOutro.setVisible(false);
        pnlDeficienciaOutro.setVisible(false);
        pnlMedicamentosOutro.setVisible(false);
        pnlResponsavelOutro.setVisible(false);
        pnlReponsaveis.setVisible(false);
    }
    
    private boolean validarCampos(){
        int verificacao = 0;
        if(txtNomeAluno.getText().isEmpty()){
            txtNomeAluno.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtNomeAluno.setBackground(Color.WHITE);
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtEmail.setBackground(Color.WHITE);
        }
        if(txtRg.getText().isEmpty()){
            txtRg.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtRg.setBackground(Color.WHITE);
        }
        if(txtOrgaoExpedidor.getText().isEmpty()){
            txtOrgaoExpedidor.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtOrgaoExpedidor.setBackground(Color.WHITE);
        }
        if(txtDataEmissao.getText().isEmpty()){
            txtDataEmissao.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtDataEmissao.setBackground(Color.WHITE);
        }
        if(txtCpf.getText().isEmpty()){
            txtCpf.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtCpf.setBackground(Color.WHITE);
        }
        if(txtTituloEleitor.getText().isEmpty()){
            txtTituloEleitor.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtTituloEleitor.setBackground(Color.WHITE);
        }
        if(txtDataNascimento.getText().isEmpty()){
            txtDataNascimento.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtDataNascimento.setBackground(Color.WHITE);
        }
        if(txtTelefone.getText().isEmpty()){
            txtTelefone.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtTelefone.setBackground(Color.WHITE);
        }
        if(txtTelefoneResponsavel.getText().isEmpty()){
            txtTelefoneResponsavel.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtTelefoneResponsavel.setBackground(Color.WHITE);
        }
        
        if(cbxResponsavelEscolha.getSelectedItem().equals(" ")){
            cbxResponsavelEscolha.setBackground(Color.RED);
            verificacao = 1;
        }else{
            cbxResponsavelEscolha.setBackground(Color.WHITE);
            if(cbxResponsavelEscolha.getSelectedItem().equals("Outro")){
                txtNomePai.setBackground(Color.WHITE);
                txtCpfPai.setBackground(Color.WHITE);
                txtRg.setBackground(Color.WHITE);
                txtOrgaoExpedidorPai.setBackground(Color.WHITE);
                txtDataEmissaoPai.setBackground(Color.WHITE);
                txtProfissaoPai.setBackground(Color.WHITE);
                
                txtNomeMae.setBackground(Color.WHITE);
                txtCpfMae.setBackground(Color.WHITE);
                txtRgMae.setBackground(Color.WHITE);
                txtOrgaoExpedidorMae.setBackground(Color.WHITE);
                txtDataEmissaoMae.setBackground(Color.WHITE);
                txtProfissaoMae.setBackground(Color.WHITE);
                
                if(txtTipoResponsavel.getText().isEmpty()){
                    txtTipoResponsavel.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtTipoResponsavel.setBackground(Color.WHITE);
                }
                if(txtNomeResponsavelOutro.getText().isEmpty()){
                    txtNomeResponsavelOutro.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtNomeResponsavelOutro.setBackground(Color.WHITE);
                }
                if(txtCpfResponsavelOutro.getText().isEmpty()){
                    txtCpfResponsavelOutro.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtCpfResponsavelOutro.setBackground(Color.WHITE);
                }
            }
            if(cbxResponsavelEscolha.getSelectedItem().equals("Pai")){
                txtNomeResponsavelOutro.setBackground(Color.WHITE);
                txtTipoResponsavel.setBackground(Color.WHITE);
                txtCpfResponsavelOutro.setBackground(Color.WHITE);
                
                txtNomeMae.setBackground(Color.WHITE);
                txtCpfMae.setBackground(Color.WHITE);
                txtRgMae.setBackground(Color.WHITE);
                txtOrgaoExpedidorMae.setBackground(Color.WHITE);
                txtDataEmissaoMae.setBackground(Color.WHITE);
                txtProfissaoMae.setBackground(Color.WHITE);
                
                if(txtNomePai.getText().isEmpty()){
                    txtNomePai.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtNomePai.setBackground(Color.WHITE);
                }
                if(txtCpfPai.getText().isEmpty()){
                    txtCpfPai.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtCpfPai.setBackground(Color.WHITE);
                }
                if(txtRgResponsavelOutro.getText().isEmpty()){
                    txtRgResponsavelOutro.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtRgResponsavelOutro.setBackground(Color.WHITE);
                }
                if(txtOrgaoExpedidorPai.getText().isEmpty()){
                    txtOrgaoExpedidorPai.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtOrgaoExpedidorPai.setBackground(Color.WHITE);
                }
                if(txtDataEmissaoPai.getText().isEmpty()){
                    txtDataEmissaoPai.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtDataEmissaoPai.setBackground(Color.WHITE);
                }
                if(txtProfissaoPai.getText().isEmpty()){
                    txtProfissaoPai.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtProfissaoPai.setBackground(Color.WHITE);
                }
            }
            if(cbxResponsavelEscolha.getSelectedItem().equals("Mãe")){
                txtNomeResponsavelOutro.setBackground(Color.WHITE);
                txtTipoResponsavel.setBackground(Color.WHITE);
                txtCpfResponsavelOutro.setBackground(Color.WHITE);
                
                txtNomePai.setBackground(Color.WHITE);
                txtCpfPai.setBackground(Color.WHITE);
                txtRgResponsavelOutro.setBackground(Color.WHITE);
                txtOrgaoExpedidorPai.setBackground(Color.WHITE);
                txtDataEmissaoPai.setBackground(Color.WHITE);
                txtProfissaoPai.setBackground(Color.WHITE);
                
                if(txtNomeMae.getText().isEmpty()){
                    txtNomeMae.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtNomeMae.setBackground(Color.WHITE);
                }
                if(txtCpfMae.getText().isEmpty()){
                    txtCpfMae.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtCpfMae.setBackground(Color.WHITE);
                }
                if(txtRgMae.getText().isEmpty()){
                    txtRgMae.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtRgMae.setBackground(Color.WHITE);
                }
                if(txtOrgaoExpedidorMae.getText().isEmpty()){
                    txtOrgaoExpedidorMae.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtOrgaoExpedidorMae.setBackground(Color.WHITE);
                }
                if(txtDataEmissaoMae.getText().isEmpty()){
                    txtDataEmissaoMae.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtDataEmissaoMae.setBackground(Color.WHITE);
                }
                if(txtProfissaoMae.getText().isEmpty()){
                    txtProfissaoMae.setBackground(Color.RED);
                    verificacao = 1;
                }else{
                    txtProfissaoMae.setBackground(Color.WHITE);
                }
            }
        }
        if(txtCep.getText().isEmpty()){
            txtCep.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtCep.setBackground(Color.WHITE);
        }
        if(txtRua.getText().isEmpty()){
            txtRua.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtRua.setBackground(Color.WHITE);
        }
        if(txtCidade.getText().isEmpty()){
            txtCidade.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtCidade.setBackground(Color.WHITE);
        }
        if(txtBairro.getText().isEmpty()){
            txtBairro.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtBairro.setBackground(Color.WHITE);
        }
        if(cbxUf.getSelectedItem().equals(" ")){
            cbxUf.setBackground(Color.RED);
            verificacao = 1;
        }else{
            cbxUf.setBackground(Color.WHITE);
        }
        if(cbxDeficiencia.getSelectedItem().equals("Outro")){
            txtDeficienciaOutro.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtDeficienciaOutro.setBackground(Color.WHITE);
        }
        if(cbxAlergia.getSelectedItem().equals("Outro")){
            txtAlergiaOutro.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtAlergiaOutro.setBackground(Color.WHITE);
        }
        if(cbxCondicoesMedicas.getSelectedItem().equals("Outro")){
            txtCondicoesMedicasOutro.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtCondicoesMedicasOutro.setBackground(Color.WHITE);
        }
        if(cbxMedicamentos.getSelectedItem().equals("Outro")){
            txtMedicamentosOutro.setBackground(Color.RED);
            verificacao = 1;
        }else{
            txtMedicamentosOutro.setBackground(Color.WHITE);
        }
        if(verificacao == 1){
            return false;
        }
        return true;
    }
    
    private void exibirErroELog(String campo) {
        JOptionPane.showConfirmDialog(null, "Aluno Não Cadastrado: " + campo + " de Aluno Existente", "ERRO", JOptionPane.WARNING_MESSAGE);
        log.warn("Aluno não cadastrado: " + campo + " de aluno existente");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDadosPessoais = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtOrgaoExpedidor = new javax.swing.JTextField();
        lblNomeAluno = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblNomeSocial = new javax.swing.JLabel();
        txtNomeSocial = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblOrgaoExpedidor = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        lblDataEmissão = new javax.swing.JLabel();
        txtDataEmissao = new javax.swing.JTextField();
        lblTituloEleitor = new javax.swing.JLabel();
        txtTituloEleitor = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        lblNacionalide = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();
        lblNaturalidade = new javax.swing.JLabel();
        txtNaturalidade = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        lblEscolaOrigem = new javax.swing.JLabel();
        txtscolaOrigem = new javax.swing.JTextField();
        pnlSalvar = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        pnlDadosReponsaveis = new javax.swing.JPanel();
        lblResponsavelEscolha = new javax.swing.JLabel();
        cbxResponsavelEscolha = new javax.swing.JComboBox<>();
        pnlResponsavelOutro = new javax.swing.JPanel();
        lblTipoResponsavel = new javax.swing.JLabel();
        txtTipoResponsavel = new javax.swing.JTextField();
        lblNomeResponsavelOutro = new javax.swing.JLabel();
        txtNomeResponsavelOutro = new javax.swing.JTextField();
        lblCpfResponsavelOutro = new javax.swing.JLabel();
        txtCpfResponsavelOutro = new javax.swing.JTextField();
        lblRgResponsavelOutro = new javax.swing.JLabel();
        txtRgResponsavelOutro = new javax.swing.JTextField();
        lblOrgaoExpedidorResponsavelOutro = new javax.swing.JLabel();
        txtOrgaoExpedidorResponsavelOutro = new javax.swing.JTextField();
        lblDataEmissaoResponsavelOutro = new javax.swing.JLabel();
        txtDataEmissaoResponsavelOutro = new javax.swing.JTextField();
        pnlReponsaveis = new javax.swing.JPanel();
        txtOrgaoExpedidorMae = new javax.swing.JTextField();
        lblDataEmissaoPai = new javax.swing.JLabel();
        txtDataEmissaoPai = new javax.swing.JTextField();
        lblCpfPai = new javax.swing.JLabel();
        lblCpfMae = new javax.swing.JLabel();
        lblRgMae = new javax.swing.JLabel();
        txtCpfPai = new javax.swing.JTextField();
        txtProfissaoPai = new javax.swing.JTextField();
        lblOrgaoExpedidorMae = new javax.swing.JLabel();
        lblProfissaoPai = new javax.swing.JLabel();
        lblNomeMae = new javax.swing.JLabel();
        lblDataEmissaoMae = new javax.swing.JLabel();
        lblProfissaoMae = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        txtNomePai = new javax.swing.JTextField();
        lblNomePai = new javax.swing.JLabel();
        txtRgMae = new javax.swing.JTextField();
        lblRgPai = new javax.swing.JLabel();
        txtDataEmissaoMae = new javax.swing.JTextField();
        txtOrgaoExpedidorPai = new javax.swing.JTextField();
        lblOrgaoExpedidorPai = new javax.swing.JLabel();
        txtCpfMae = new javax.swing.JTextField();
        txtProfissaoMae = new javax.swing.JTextField();
        txtRgPai = new javax.swing.JTextField();
        lblTelefoneResponsavel = new javax.swing.JLabel();
        txtTelefoneResponsavel = new javax.swing.JTextField();
        pnlDadosEndereco = new javax.swing.JPanel();
        lblCep = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblRegiaoMoradia = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        cbxRegiaoMoradia = new javax.swing.JComboBox<>();
        cbxUf = new javax.swing.JComboBox<>();
        pnlDadosMedicos = new javax.swing.JPanel();
        lblDeficiencia = new javax.swing.JLabel();
        lblAlergia = new javax.swing.JLabel();
        lblCondicoesMedicas = new javax.swing.JLabel();
        lblMedicamentos = new javax.swing.JLabel();
        cbxDeficiencia = new javax.swing.JComboBox<>();
        pnlDeficienciaOutro = new javax.swing.JPanel();
        lblDeficienciaOutro = new javax.swing.JLabel();
        txtDeficienciaOutro = new javax.swing.JTextField();
        cbxAlergia = new javax.swing.JComboBox<>();
        pnlAlergiaOutro = new javax.swing.JPanel();
        lblAlergiaOutro = new javax.swing.JLabel();
        txtAlergiaOutro = new javax.swing.JTextField();
        cbxCondicoesMedicas = new javax.swing.JComboBox<>();
        pnlCondicoesMedicasOutro = new javax.swing.JPanel();
        lblCondicoesMedicasOutro = new javax.swing.JLabel();
        txtCondicoesMedicasOutro = new javax.swing.JTextField();
        cbxMedicamentos = new javax.swing.JComboBox<>();
        pnlMedicamentosOutro = new javax.swing.JPanel();
        lblMedicamentosOutro = new javax.swing.JLabel();
        txtMedicamentosOutro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlDadosPessoais.setBackground(new java.awt.Color(8, 102, 255));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("CPF");

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo");

        lblNomeAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeAluno.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeAluno.setText("Nome");

        lblRg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRg.setForeground(new java.awt.Color(255, 255, 255));
        lblRg.setText("RG");

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone");

        lblNomeSocial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeSocial.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeSocial.setText("Nome Social");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblOrgaoExpedidor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrgaoExpedidor.setForeground(new java.awt.Color(255, 255, 255));
        lblOrgaoExpedidor.setText("Orgão Expedidor");

        lblDataEmissão.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataEmissão.setForeground(new java.awt.Color(255, 255, 255));
        lblDataEmissão.setText("Data de Emissão");

        lblTituloEleitor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTituloEleitor.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEleitor.setText("Titulo de Eleitor");

        lblGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setText("Gênero");
        lblGenero.setToolTipText("");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cisgênero", "Transgênero", "Bigênero", "Não-binário", "Neutro", "Fluido", "Queer", "Em dúvida" }));

        lblNacionalide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacionalide.setForeground(new java.awt.Color(255, 255, 255));
        lblNacionalide.setText("Nacionalidade");

        lblNaturalidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNaturalidade.setForeground(new java.awt.Color(255, 255, 255));
        lblNaturalidade.setText("Naturalidade");

        lblDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNascimento.setText("Data Nascimento");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino", "Nenhum" }));

        lblEscolaOrigem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEscolaOrigem.setForeground(new java.awt.Color(255, 255, 255));
        lblEscolaOrigem.setText("Escola Origem");

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(txtOrgaoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addGap(369, 369, 369)
                                .addComponent(lblOrgaoExpedidor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDataEmissão)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloEleitor)
                            .addComponent(txtTituloEleitor, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                    .addGap(221, 221, 221)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                    .addGap(226, 226, 226)
                                    .addComponent(lblDataNascimento)))
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(lblSexo)
                                        .addGap(100, 100, 100))
                                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(cbxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenero)
                                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacionalide))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNaturalidade)
                            .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRg)
                            .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNomeAluno)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeSocial))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtscolaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEscolaOrigem))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAluno)
                    .addComponent(lblNomeSocial)
                    .addComponent(lblEmail)
                    .addComponent(lblEscolaOrigem))
                .addGap(2, 2, 2)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtscolaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDataEmissão)
                                .addComponent(lblOrgaoExpedidor)
                                .addComponent(lblCpf)
                                .addComponent(lblTituloEleitor)))
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOrgaoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTituloEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefone)
                                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNacionalide)
                                        .addComponent(lblNaturalidade))))
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRg)
                            .addComponent(lblGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataNascimento)))
                .addGap(8, 8, 8)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pnlSalvar.setBackground(new java.awt.Color(8, 102, 255));

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSalvarLayout = new javax.swing.GroupLayout(pnlSalvar);
        pnlSalvar.setLayout(pnlSalvarLayout);
        pnlSalvarLayout.setHorizontalGroup(
            pnlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalvarLayout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSalvarLayout.setVerticalGroup(
            pnlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalvarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosReponsaveis.setBackground(new java.awt.Color(8, 102, 255));

        lblResponsavelEscolha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResponsavelEscolha.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavelEscolha.setText("Reponsável");
        lblResponsavelEscolha.setToolTipText("");

        cbxResponsavelEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pai", "Mãe", "Outro" }));
        cbxResponsavelEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxResponsavelEscolhaActionPerformed(evt);
            }
        });

        pnlResponsavelOutro.setBackground(new java.awt.Color(8, 102, 255));

        lblTipoResponsavel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTipoResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoResponsavel.setText("Informe quem é o seu responsável");

        lblNomeResponsavelOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeResponsavelOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeResponsavelOutro.setText("Nome do Responsável");

        txtNomeResponsavelOutro.setText("padrao");

        lblCpfResponsavelOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpfResponsavelOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblCpfResponsavelOutro.setText("CPF");

        lblRgResponsavelOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRgResponsavelOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblRgResponsavelOutro.setText("RG");

        lblOrgaoExpedidorResponsavelOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrgaoExpedidorResponsavelOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblOrgaoExpedidorResponsavelOutro.setText("Orgão Expedidor");

        lblDataEmissaoResponsavelOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataEmissaoResponsavelOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblDataEmissaoResponsavelOutro.setText("Data de Emissão");

        txtDataEmissaoResponsavelOutro.setText("01/01/0001");

        javax.swing.GroupLayout pnlResponsavelOutroLayout = new javax.swing.GroupLayout(pnlResponsavelOutro);
        pnlResponsavelOutro.setLayout(pnlResponsavelOutroLayout);
        pnlResponsavelOutroLayout.setHorizontalGroup(
            pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResponsavelOutroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoResponsavel)
                    .addComponent(txtTipoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResponsavelOutroLayout.createSequentialGroup()
                        .addComponent(txtNomeResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRgResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlResponsavelOutroLayout.createSequentialGroup()
                        .addComponent(lblNomeResponsavelOutro)
                        .addGap(61, 61, 61)
                        .addComponent(lblRgResponsavelOutro)))
                .addGroup(pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResponsavelOutroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtOrgaoExpedidorResponsavelOutro)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataEmissaoResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlResponsavelOutroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblOrgaoExpedidorResponsavelOutro)
                        .addGap(26, 26, 26)
                        .addComponent(lblDataEmissaoResponsavelOutro)))
                .addGap(18, 18, 18)
                .addGroup(pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpfResponsavelOutro)
                    .addComponent(txtCpfResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        pnlResponsavelOutroLayout.setVerticalGroup(
            pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResponsavelOutroLayout.createSequentialGroup()
                .addGroup(pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoResponsavel)
                    .addComponent(lblNomeResponsavelOutro)
                    .addComponent(lblCpfResponsavelOutro)
                    .addComponent(lblRgResponsavelOutro)
                    .addComponent(lblOrgaoExpedidorResponsavelOutro)
                    .addComponent(lblDataEmissaoResponsavelOutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlResponsavelOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrgaoExpedidorResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataEmissaoResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlReponsaveis.setBackground(new java.awt.Color(8, 102, 255));
        pnlReponsaveis.setForeground(new java.awt.Color(255, 255, 255));

        lblDataEmissaoPai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataEmissaoPai.setForeground(new java.awt.Color(255, 255, 255));
        lblDataEmissaoPai.setText("Data de Emissão");

        lblCpfPai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpfPai.setForeground(new java.awt.Color(255, 255, 255));
        lblCpfPai.setText("CPF");

        lblCpfMae.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpfMae.setForeground(new java.awt.Color(255, 255, 255));
        lblCpfMae.setText("CPF");

        lblRgMae.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRgMae.setForeground(new java.awt.Color(255, 255, 255));
        lblRgMae.setText("RG");

        lblOrgaoExpedidorMae.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrgaoExpedidorMae.setForeground(new java.awt.Color(255, 255, 255));
        lblOrgaoExpedidorMae.setText("Orgão Expedidor");

        lblProfissaoPai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProfissaoPai.setForeground(new java.awt.Color(255, 255, 255));
        lblProfissaoPai.setText("Profissão");

        lblNomeMae.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeMae.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeMae.setText("Nome do Mãe");

        lblDataEmissaoMae.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataEmissaoMae.setForeground(new java.awt.Color(255, 255, 255));
        lblDataEmissaoMae.setText("Data de Emissão");

        lblProfissaoMae.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProfissaoMae.setForeground(new java.awt.Color(255, 255, 255));
        lblProfissaoMae.setText("Profissão");

        txtNomeMae.setText("padrao");

        txtNomePai.setText("padrao");

        lblNomePai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomePai.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePai.setText("Nome do Pai");

        lblRgPai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRgPai.setForeground(new java.awt.Color(255, 255, 255));
        lblRgPai.setText("RG");

        lblOrgaoExpedidorPai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrgaoExpedidorPai.setForeground(new java.awt.Color(255, 255, 255));
        lblOrgaoExpedidorPai.setText("Orgão Expedidor");

        javax.swing.GroupLayout pnlReponsaveisLayout = new javax.swing.GroupLayout(pnlReponsaveis);
        pnlReponsaveis.setLayout(pnlReponsaveisLayout);
        pnlReponsaveisLayout.setHorizontalGroup(
            pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeMae))
                        .addGap(29, 29, 29)
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpfMae, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpfMae))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtNomePai))
                            .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                                .addComponent(lblNomePai)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCpfPai)
                            .addComponent(txtCpfPai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRgMae)
                            .addComponent(txtRgMae, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrgaoExpedidorMae, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrgaoExpedidorMae))
                        .addGap(18, 18, 18)
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataEmissaoMae)
                            .addComponent(txtDataEmissaoMae, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                                .addComponent(txtRgPai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOrgaoExpedidorPai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReponsaveisLayout.createSequentialGroup()
                                .addComponent(lblRgPai)
                                .addGap(138, 138, 138)
                                .addComponent(lblOrgaoExpedidorPai)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataEmissaoPai)
                            .addComponent(txtDataEmissaoPai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfissaoMae)
                    .addComponent(txtProfissaoPai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfissaoPai)
                    .addComponent(txtProfissaoMae, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlReponsaveisLayout.setVerticalGroup(
            pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReponsaveisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpfPai)
                        .addComponent(lblRgPai)
                        .addComponent(lblOrgaoExpedidorPai)
                        .addComponent(lblDataEmissaoPai)
                        .addComponent(lblProfissaoPai))
                    .addComponent(lblNomePai, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrgaoExpedidorPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataEmissaoPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfissaoPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMae)
                    .addComponent(lblRgMae)
                    .addComponent(lblCpfMae)
                    .addComponent(lblOrgaoExpedidorMae)
                    .addComponent(lblDataEmissaoMae)
                    .addComponent(lblProfissaoMae))
                .addGap(4, 4, 4)
                .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRgMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpfMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrgaoExpedidorMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataEmissaoMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProfissaoMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        lblTelefoneResponsavel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefoneResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefoneResponsavel.setText("Telefone");
        lblTelefoneResponsavel.setToolTipText("");

        javax.swing.GroupLayout pnlDadosReponsaveisLayout = new javax.swing.GroupLayout(pnlDadosReponsaveis);
        pnlDadosReponsaveis.setLayout(pnlDadosReponsaveisLayout);
        pnlDadosReponsaveisLayout.setHorizontalGroup(
            pnlDadosReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosReponsaveisLayout.createSequentialGroup()
                .addGroup(pnlDadosReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDadosReponsaveisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlReponsaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosReponsaveisLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlDadosReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlResponsavelOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlDadosReponsaveisLayout.createSequentialGroup()
                                .addGroup(pnlDadosReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDadosReponsaveisLayout.createSequentialGroup()
                                        .addComponent(cbxResponsavelEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefoneResponsavel))
                                    .addGroup(pnlDadosReponsaveisLayout.createSequentialGroup()
                                        .addComponent(lblResponsavelEscolha)
                                        .addGap(90, 90, 90)
                                        .addComponent(lblTelefoneResponsavel)))
                                .addGap(636, 636, 636)))))
                .addGap(6, 6, 6))
        );
        pnlDadosReponsaveisLayout.setVerticalGroup(
            pnlDadosReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosReponsaveisLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlDadosReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResponsavelEscolha)
                    .addComponent(lblTelefoneResponsavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosReponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxResponsavelEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlResponsavelOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlReponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlDadosEndereco.setBackground(new java.awt.Color(8, 102, 255));

        lblCep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCep.setForeground(new java.awt.Color(255, 255, 255));
        lblCep.setText("CEP");

        lblRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 255, 255));
        lblRua.setText("Rua");

        lblNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número");

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade");

        lblBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("Bairro");

        lblRegiaoMoradia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegiaoMoradia.setForeground(new java.awt.Color(255, 255, 255));
        lblRegiaoMoradia.setText("Região de Moradia");

        lblUf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUf.setForeground(new java.awt.Color(255, 255, 255));
        lblUf.setText("UF");

        cbxRegiaoMoradia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Urbana", "Rural" }));

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout pnlDadosEnderecoLayout = new javax.swing.GroupLayout(pnlDadosEndereco);
        pnlDadosEndereco.setLayout(pnlDadosEnderecoLayout);
        pnlDadosEnderecoLayout.setHorizontalGroup(
            pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                        .addComponent(lblCep)
                        .addGap(135, 135, 135)
                        .addComponent(lblRua)
                        .addGap(135, 135, 135)
                        .addComponent(lblNumero))
                    .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addGap(21, 21, 21)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addGap(24, 24, 24)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxRegiaoMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegiaoMoradia))
                .addGap(29, 29, 29)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUf)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosEnderecoLayout.setVerticalGroup(
            pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblRua)
                    .addComponent(lblNumero)
                    .addComponent(lblCidade)
                    .addComponent(lblBairro)
                    .addComponent(lblRegiaoMoradia)
                    .addComponent(lblUf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRegiaoMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlDadosMedicos.setBackground(new java.awt.Color(8, 102, 255));

        lblDeficiencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeficiencia.setForeground(new java.awt.Color(255, 255, 255));
        lblDeficiencia.setText("Deficiência");

        lblAlergia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAlergia.setForeground(new java.awt.Color(255, 255, 255));
        lblAlergia.setText("Alergia");

        lblCondicoesMedicas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCondicoesMedicas.setForeground(new java.awt.Color(255, 255, 255));
        lblCondicoesMedicas.setText("Condições Medicas Relevantes");

        lblMedicamentos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamentos.setText("Medicamentos");

        cbxDeficiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Paraplegia", "Tetraplegia", "Paralisia Cerebral", "Membro Perdido", "Visual", "Auditiva", "Outro" }));
        cbxDeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeficienciaActionPerformed(evt);
            }
        });

        pnlDeficienciaOutro.setBackground(new java.awt.Color(8, 102, 255));

        lblDeficienciaOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeficienciaOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblDeficienciaOutro.setText("Informe o outro tipo de Deficiência");

        javax.swing.GroupLayout pnlDeficienciaOutroLayout = new javax.swing.GroupLayout(pnlDeficienciaOutro);
        pnlDeficienciaOutro.setLayout(pnlDeficienciaOutroLayout);
        pnlDeficienciaOutroLayout.setHorizontalGroup(
            pnlDeficienciaOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeficienciaOutroLayout.createSequentialGroup()
                .addComponent(lblDeficienciaOutro)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(pnlDeficienciaOutroLayout.createSequentialGroup()
                .addComponent(txtDeficienciaOutro)
                .addContainerGap())
        );
        pnlDeficienciaOutroLayout.setVerticalGroup(
            pnlDeficienciaOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeficienciaOutroLayout.createSequentialGroup()
                .addComponent(lblDeficienciaOutro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDeficienciaOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cbxAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pólen", "Ácaros", "Pelos de Animais", "Mofo", "Antibióticos", "Anti-inflamatorios", "Leite", "Ovos", "Amendoim e Nozes", "Frutos do Mar", "Trigo e Soja", "Dermatite de Contato", "Tintas", "Outro", " " }));
        cbxAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAlergiaActionPerformed(evt);
            }
        });

        pnlAlergiaOutro.setBackground(new java.awt.Color(8, 102, 255));

        lblAlergiaOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAlergiaOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblAlergiaOutro.setText("Informe o outro tipo de Alergia");

        javax.swing.GroupLayout pnlAlergiaOutroLayout = new javax.swing.GroupLayout(pnlAlergiaOutro);
        pnlAlergiaOutro.setLayout(pnlAlergiaOutroLayout);
        pnlAlergiaOutroLayout.setHorizontalGroup(
            pnlAlergiaOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlergiaOutroLayout.createSequentialGroup()
                .addComponent(lblAlergiaOutro)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(pnlAlergiaOutroLayout.createSequentialGroup()
                .addComponent(txtAlergiaOutro)
                .addContainerGap())
        );
        pnlAlergiaOutroLayout.setVerticalGroup(
            pnlAlergiaOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlergiaOutroLayout.createSequentialGroup()
                .addComponent(lblAlergiaOutro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlergiaOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        cbxCondicoesMedicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ansiedade", "Depressão", "Escoliose", "Asma", "Diabete", "Hipertensão", "Epilepsia", "TDAH", "Síndrome de Down", "Autismo", "Anemia", "Obesidade", "Outro", " " }));
        cbxCondicoesMedicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCondicoesMedicasActionPerformed(evt);
            }
        });

        pnlCondicoesMedicasOutro.setBackground(new java.awt.Color(8, 102, 255));

        lblCondicoesMedicasOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCondicoesMedicasOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblCondicoesMedicasOutro.setText("Informe o outro tipo de Condicão Médica");

        javax.swing.GroupLayout pnlCondicoesMedicasOutroLayout = new javax.swing.GroupLayout(pnlCondicoesMedicasOutro);
        pnlCondicoesMedicasOutro.setLayout(pnlCondicoesMedicasOutroLayout);
        pnlCondicoesMedicasOutroLayout.setHorizontalGroup(
            pnlCondicoesMedicasOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCondicoesMedicasOutroLayout.createSequentialGroup()
                .addComponent(lblCondicoesMedicasOutro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlCondicoesMedicasOutroLayout.createSequentialGroup()
                .addComponent(txtCondicoesMedicasOutro)
                .addContainerGap())
        );
        pnlCondicoesMedicasOutroLayout.setVerticalGroup(
            pnlCondicoesMedicasOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCondicoesMedicasOutroLayout.createSequentialGroup()
                .addComponent(lblCondicoesMedicasOutro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCondicoesMedicasOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        cbxMedicamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Paracetamol", "Ibuprofeno", "Loratadina", "Amoxicilina", "Insulina", "Omeprazol", "Diazepam", "Outro", " " }));
        cbxMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedicamentosActionPerformed(evt);
            }
        });

        pnlMedicamentosOutro.setBackground(new java.awt.Color(8, 102, 255));

        lblMedicamentosOutro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMedicamentosOutro.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamentosOutro.setText("Informe o outro tipo de Medicamento");

        javax.swing.GroupLayout pnlMedicamentosOutroLayout = new javax.swing.GroupLayout(pnlMedicamentosOutro);
        pnlMedicamentosOutro.setLayout(pnlMedicamentosOutroLayout);
        pnlMedicamentosOutroLayout.setHorizontalGroup(
            pnlMedicamentosOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedicamentosOutroLayout.createSequentialGroup()
                .addComponent(lblMedicamentosOutro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMedicamentosOutroLayout.createSequentialGroup()
                .addComponent(txtMedicamentosOutro)
                .addContainerGap())
        );
        pnlMedicamentosOutroLayout.setVerticalGroup(
            pnlMedicamentosOutroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedicamentosOutroLayout.createSequentialGroup()
                .addComponent(lblMedicamentosOutro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMedicamentosOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDadosMedicosLayout = new javax.swing.GroupLayout(pnlDadosMedicos);
        pnlDadosMedicos.setLayout(pnlDadosMedicosLayout);
        pnlDadosMedicosLayout.setHorizontalGroup(
            pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosMedicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeficiencia)
                    .addComponent(pnlDeficienciaOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlergia)
                    .addGroup(pnlDadosMedicosLayout.createSequentialGroup()
                        .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlAlergiaOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCondicoesMedicasOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCondicoesMedicas)
                            .addComponent(cbxCondicoesMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedicamentos)
                    .addComponent(cbxMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMedicamentosOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        pnlDadosMedicosLayout.setVerticalGroup(
            pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosMedicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeficiencia)
                    .addComponent(lblAlergia)
                    .addComponent(lblCondicoesMedicas)
                    .addComponent(lblMedicamentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCondicoesMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCondicoesMedicasOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAlergiaOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDeficienciaOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMedicamentosOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosReponsaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosReponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        int veref = 1;
        //if(!validarCampos()){
        if(veref == 0){
            JOptionPane.showMessageDialog(null, "Dados do aluno não preenchidos", "ERRO", JOptionPane.ERROR_MESSAGE);
            log.error("Erro ao salvar: Campos obrigatórios não preenchidos");
        }else{
            AlunosPrincipal novoAluno = new AlunosPrincipal();
            try{
                novoAluno.setNome(txtNomeAluno.getText());
                novoAluno.setNomeSocial(txtNomeSocial.getText());
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
                Date dataRg = sdf.parse(txtDataEmissao.getText()); // Converte a String para Date
                novoAluno.setDataEmissaoRg(dataRg);
                Date dataNascimento = sdf.parse(txtDataNascimento.getText()); // Converte a String para Date
                novoAluno.setNascimento(dataNascimento);
                
                novoAluno.setGenero(cbxGenero.getSelectedItem().toString());
                novoAluno.setSexo(cbxSexo.getSelectedItem().toString());
                novoAluno.setDeficiencia(cbxDeficiencia.getSelectedItem().toString());
                novoAluno.setAlergia(cbxAlergia.getSelectedItem().toString());
                novoAluno.setCondicoesMedicas(cbxCondicoesMedicas.getSelectedItem().toString());
                novoAluno.setMedicamentos(cbxMedicamentos.getSelectedItem().toString());
                
                List<Responsaveis> responsaveis = gestaoAlunoController.findAllResponsavel();
                if(!(cbxResponsavelEscolha.getSelectedItem().equals(" "))){
                    Responsaveis responsavelLegalSave = new Responsaveis();
                    if(gestaoAlunoController.findByNomeResponsavel(txtNomeResponsavelOutro.getText()) == null){
                        if(cbxResponsavelEscolha.getSelectedItem().equals("Outro")){
                            for(Responsaveis responsavel: responsaveis){
                                if(responsavel.getCpf().equals(txtCpfResponsavelOutro.getText())){
                                    exibirErroELog("CPF do Responsável Legal");
                                    return;
                                }
                                if (responsavel.getTelefone().equals(txtTelefone.getText())) {
                                    exibirErroELog("Telefone do responsável");
                                    return;
                                }
                            }
                        }
                        responsavelLegalSave.setTipo(txtTipoResponsavel.getText());
                        responsavelLegalSave.setNome(txtNomeResponsavelOutro.getText());
                        responsavelLegalSave.setCpf(txtCpfResponsavelOutro.getText());
                        responsavelLegalSave.setRg(txtRgResponsavelOutro.getText());
                        responsavelLegalSave.setOrgaoExpedidorRg(txtOrgaoExpedidorResponsavelOutro.getText());
                        Date dataRgResponsavelOutro = sdf.parse(txtDataEmissaoResponsavelOutro.getText());
                        responsavelLegalSave.setDataEmissaoRg(dataRgResponsavelOutro);
                        if(cbxResponsavelEscolha.getSelectedItem().equals("Outro"))
                            responsavelLegalSave.setTelefone(txtTelefoneResponsavel.getText());
                        gestaoAlunoController.save(responsavelLegalSave);
                    }else{
                        responsavelLegalSave = gestaoAlunoController.findByNomeResponsavel(txtNomeResponsavelOutro.getText());
                    }
                    novoAluno.setReponsavelLegal(responsavelLegalSave);

                    Responsaveis responsavelPaiSave = new Responsaveis();
                    if(gestaoAlunoController.findByNomeResponsavel(txtNomePai.getText()) == null){
                        for(Responsaveis responsavel: responsaveis){
                            if (responsavel.getCpf().equals(txtCpfPai.getText())) {
                                exibirErroELog("CPF do Pai");
                                return;
                            }
                            if (responsavel.getCpf().equals(txtCpfMae.getText())) {
                                exibirErroELog("CPF da Mãe");
                                return;
                            }
                            if (responsavel.getRg().equals(txtRgResponsavelOutro.getText())) {
                                exibirErroELog("RG do Pai");
                                return;
                            }
                            if (responsavel.getRg().equals(txtRgMae.getText())) {
                                exibirErroELog("RG da Mãe");
                                return;
                            }
                            if (responsavel.getTelefone().equals(txtTelefone.getText())) {
                                exibirErroELog("Telefone do responsável");
                                return;
                            }
                        }
                        //Configuracoes Pai
                        responsavelPaiSave.setTipo("Pai");
                        responsavelPaiSave.setNome(txtNomePai.getText());
                        responsavelPaiSave.setCpf(txtCpfPai.getText());
                        responsavelPaiSave.setRg(txtRgResponsavelOutro.getText());
                        if(cbxResponsavelEscolha.getSelectedItem().equals("Pai")){
                            responsavelPaiSave.setTelefone(txtTelefoneResponsavel.getText());
                        }
                        responsavelPaiSave.setOrgaoExpedidorRg(txtOrgaoExpedidorPai.getText());
                        responsavelPaiSave.setProfissao(txtProfissaoPai.getText());
                        Date dataRgPai = sdf.parse(txtDataEmissaoPai.getText());
                        responsavelPaiSave.setDataEmissaoRg(dataRgPai);
                        gestaoAlunoController.save(responsavelPaiSave);
                    }else{
                        responsavelPaiSave = gestaoAlunoController.findByNomeResponsavel(txtNomePai.getText());
                    }
                    novoAluno.setPai(responsavelPaiSave);

                    Responsaveis responsavelMaeSave = new Responsaveis();
                    if(gestaoAlunoController.findByNomeResponsavel(txtNomeMae.getText()) == null){
                        //Configuracoes Mae
                        responsavelMaeSave.setTipo("Mãe");
                        responsavelMaeSave.setNome(txtNomeMae.getText());
                        responsavelMaeSave.setCpf(txtCpfMae.getText());
                        responsavelMaeSave.setRg(txtRgMae.getText());
                        if(cbxResponsavelEscolha.getSelectedItem().equals("Mãe")){
                            responsavelMaeSave.setTelefone(txtTelefoneResponsavel.getText());
                        }
                        responsavelMaeSave.setOrgaoExpedidorRg(txtOrgaoExpedidorMae.getText());
                        responsavelMaeSave.setProfissao(txtProfissaoMae.getText());
                        Date dataRgMae = sdf.parse(txtDataEmissaoMae.getText());
                        responsavelMaeSave.setDataEmissaoRg(dataRgMae);
                        gestaoAlunoController.save(responsavelMaeSave);
                    }else{
                        responsavelMaeSave = gestaoAlunoController.findByNomeResponsavel(txtNomeMae.getText());
                    }
                    novoAluno.setMae(responsavelMaeSave);
                }
                
                List<AlunosPrincipal> alunos = this.gestaoAlunoController.findAll();
                String cpf = txtCpf.getText();
                String email = txtEmail.getText();
                String rg = txtRg.getText();
                String tituloEleitor = txtTituloEleitor.getText();
                String telefone = txtTelefone.getText();
                for(AlunosPrincipal aluno: alunos){
                    //Verificação da existência e algum aluno com o mesmo código do escolhido pelo usuário
                    if (aluno.getCpf().equals(cpf)) {
                        exibirErroELog("CPF");
                        return;
                    }
                    if (aluno.getEmail().equals(email)) {
                        exibirErroELog("Email");
                        return;
                    }
                    if (aluno.getRg().equals(rg)) {
                        exibirErroELog("RG");
                        return;
                    }
                    if (aluno.getTituloEleitor().equals(tituloEleitor)) {
                        exibirErroELog("Título de Eleitor");
                        return;
                    }
                    if (aluno.getTelefone().equals(telefone)) {
                        exibirErroELog("Telefone");
                        return;
                    }
                }
                
                EnderecoId id = new EnderecoId(txtRua.getText(), Integer.parseInt(txtNumero.getText()), txtCep.getText());
                Endereco endereco = new Endereco();
                if(this.enderecoController.findById(id) == null){
                    endereco.setBairro(txtBairro.getText());
                    endereco.setCep(txtCep.getText());
                    endereco.setCidade(txtCidade.getText());
                    endereco.setNumero(Integer.parseInt(txtNumero.getText()));
                    endereco.setRua(txtRua.getText());
                    endereco.setUf(cbxUf.getSelectedItem().toString());
                }else{
                    endereco = this.enderecoController.findById(id);
                }
                novoAluno.setEnderecos(endereco);

                //Salva o aluno no Banco de Dados
                this.gestaoAlunoController.save(novoAluno);
                log.info("Aluno salvo com sucesso: {}", novoAluno);
                // Fecha a janela atual
                this.dispose();
            }catch(Exception e){
                log.error("Erro ao salvar o aluno: ", e);
                JOptionPane.showMessageDialog(null, "Erro ao salvar o aluno", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbxResponsavelEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxResponsavelEscolhaActionPerformed
        // TODO add your handling code here:
        if(!(cbxResponsavelEscolha.getSelectedItem().equals("  "))){
            if(cbxResponsavelEscolha.getSelectedItem().equals("Outro")){
                pnlResponsavelOutro.setVisible(true);
                pnlReponsaveis.setVisible(false);
            }    
            else{
                pnlReponsaveis.setVisible(true);
                pnlResponsavelOutro.setVisible(false);
            }
        }
    }//GEN-LAST:event_cbxResponsavelEscolhaActionPerformed

    private void cbxDeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDeficienciaActionPerformed
        // TODO add your handling code here:
        if(cbxDeficiencia.getSelectedItem().equals("Outro"))
                pnlDeficienciaOutro.setVisible(true);
    }//GEN-LAST:event_cbxDeficienciaActionPerformed

    private void cbxAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAlergiaActionPerformed
        // TODO add your handling code here:
        if(cbxAlergia.getSelectedItem().equals("Outro"))
                pnlAlergiaOutro.setVisible(true);
    }//GEN-LAST:event_cbxAlergiaActionPerformed

    private void cbxCondicoesMedicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCondicoesMedicasActionPerformed
        // TODO add your handling code here:
        if(cbxCondicoesMedicas.getSelectedItem().equals("Outro"))
                pnlCondicoesMedicasOutro.setVisible(true);
    }//GEN-LAST:event_cbxCondicoesMedicasActionPerformed

    private void cbxMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedicamentosActionPerformed
        // TODO add your handling code here:
        if(cbxMedicamentos.getSelectedItem().equals("Outro"))
                pnlMedicamentosOutro.setVisible(true);
    }//GEN-LAST:event_cbxMedicamentosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form*/
        
        ConfigurableApplicationContext context = 
        new SpringApplicationBuilder(Prg03SceduApplication.class)
        .headless(false)
        .run(args);

        TelaAdicionar telaAdd = context.getBean(TelaAdicionar.class);
        telaAdd.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxAlergia;
    private javax.swing.JComboBox<String> cbxCondicoesMedicas;
    private javax.swing.JComboBox<String> cbxDeficiencia;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxMedicamentos;
    private javax.swing.JComboBox<String> cbxRegiaoMoradia;
    private javax.swing.JComboBox<String> cbxResponsavelEscolha;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel lblAlergia;
    private javax.swing.JLabel lblAlergiaOutro;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCondicoesMedicas;
    private javax.swing.JLabel lblCondicoesMedicasOutro;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfMae;
    private javax.swing.JLabel lblCpfPai;
    private javax.swing.JLabel lblCpfResponsavelOutro;
    private javax.swing.JLabel lblDataEmissaoMae;
    private javax.swing.JLabel lblDataEmissaoPai;
    private javax.swing.JLabel lblDataEmissaoResponsavelOutro;
    private javax.swing.JLabel lblDataEmissão;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDeficiencia;
    private javax.swing.JLabel lblDeficienciaOutro;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEscolaOrigem;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblMedicamentosOutro;
    private javax.swing.JLabel lblNacionalide;
    private javax.swing.JLabel lblNaturalidade;
    private javax.swing.JLabel lblNomeAluno;
    private javax.swing.JLabel lblNomeMae;
    private javax.swing.JLabel lblNomePai;
    private javax.swing.JLabel lblNomeResponsavelOutro;
    private javax.swing.JLabel lblNomeSocial;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOrgaoExpedidor;
    private javax.swing.JLabel lblOrgaoExpedidorMae;
    private javax.swing.JLabel lblOrgaoExpedidorPai;
    private javax.swing.JLabel lblOrgaoExpedidorResponsavelOutro;
    private javax.swing.JLabel lblProfissaoMae;
    private javax.swing.JLabel lblProfissaoPai;
    private javax.swing.JLabel lblRegiaoMoradia;
    private javax.swing.JLabel lblResponsavelEscolha;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblRgMae;
    private javax.swing.JLabel lblRgPai;
    private javax.swing.JLabel lblRgResponsavelOutro;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneResponsavel;
    private javax.swing.JLabel lblTipoResponsavel;
    private javax.swing.JLabel lblTituloEleitor;
    private javax.swing.JLabel lblUf;
    private javax.swing.JPanel pnlAlergiaOutro;
    private javax.swing.JPanel pnlCondicoesMedicasOutro;
    private javax.swing.JPanel pnlDadosEndereco;
    private javax.swing.JPanel pnlDadosMedicos;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlDadosReponsaveis;
    private javax.swing.JPanel pnlDeficienciaOutro;
    private javax.swing.JPanel pnlMedicamentosOutro;
    private javax.swing.JPanel pnlReponsaveis;
    private javax.swing.JPanel pnlResponsavelOutro;
    private javax.swing.JPanel pnlSalvar;
    private javax.swing.JTextField txtAlergiaOutro;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCondicoesMedicasOutro;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpfMae;
    private javax.swing.JTextField txtCpfPai;
    private javax.swing.JTextField txtCpfResponsavelOutro;
    private javax.swing.JTextField txtDataEmissao;
    private javax.swing.JTextField txtDataEmissaoMae;
    private javax.swing.JTextField txtDataEmissaoPai;
    private javax.swing.JTextField txtDataEmissaoResponsavelOutro;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtDeficienciaOutro;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMedicamentosOutro;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    private javax.swing.JTextField txtNomeResponsavelOutro;
    private javax.swing.JTextField txtNomeSocial;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOrgaoExpedidor;
    private javax.swing.JTextField txtOrgaoExpedidorMae;
    private javax.swing.JTextField txtOrgaoExpedidorPai;
    private javax.swing.JTextField txtOrgaoExpedidorResponsavelOutro;
    private javax.swing.JTextField txtProfissaoMae;
    private javax.swing.JTextField txtProfissaoPai;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRgMae;
    private javax.swing.JTextField txtRgPai;
    private javax.swing.JTextField txtRgResponsavelOutro;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTelefoneResponsavel;
    private javax.swing.JTextField txtTipoResponsavel;
    private javax.swing.JTextField txtTituloEleitor;
    private javax.swing.JTextField txtscolaOrigem;
    // End of variables declaration//GEN-END:variables
}
