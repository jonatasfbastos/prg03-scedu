package br.com.ifba.prg03_scedu.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Component;

@Component
public class CredenciaisManager {

    private static final Logger LOGGER = Logger.getLogger(CredenciaisManager.class.getName());

    // Caminho do arquivo onde as credenciais serão armazenadas
    private final String caminhoArquivo;

    // Criptografador de texto para proteger as credenciais
    private final BasicTextEncryptor textEncryptor;

    // Chave secreta para criptografia (deve ser mantida em segredo)
    private static final String CHAVE_SECRETA = "!A4r@8Lp$9Xz^cTq&7vWm*o#Np2zLk%3fJw!1D8+Rg";

    public CredenciaisManager() {
        // Obtém o diretório do projeto para construir o caminho do arquivo
        String pastaProjeto = System.getProperty("user.dir");

        // Define o caminho do arquivo 'credenciais.bin'
        this.caminhoArquivo = pastaProjeto + File.separator 
                              + "src" + File.separator 
                              + "main" + File.separator 
                              + "java" + File.separator 
                              + "br" + File.separator 
                              + "com" + File.separator 
                              + "ifba" + File.separator 
                              + "prg03_scedu" + File.separator 
                              + "usuario" + File.separator 
                              + "view" + File.separator 
                              + "credenciais.bin";

        // Configura o encriptador de texto com a chave secreta
        textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(CHAVE_SECRETA);

        // Verifica se o arquivo já existe; se não, tenta criá-lo
        File arquivo = new File(caminhoArquivo);
        if (!arquivo.exists()) {
            try {
                if (arquivo.createNewFile()) {
                    LOGGER.info("Arquivo 'credenciais.bin' criado com sucesso.");
                } else {
                    LOGGER.warning("Arquivo 'credenciais.bin' não foi criado.");
                }
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Erro ao criar o arquivo 'credenciais.bin': ", e);
            }
        } else {
            LOGGER.info("Arquivo 'credenciais.bin' já existe.");
        }
    }

    /**
     * Salva as credenciais criptografadas no arquivo.
     *
     * @param email O email a ser salvo.
     * @param senha A senha a ser salva.
     */
    public void salvarCredenciais(String email, String senha) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            // Criptografa o email e a senha
            String encryptedEmail = textEncryptor.encrypt(email);
            String encryptedSenha = textEncryptor.encrypt(senha);
            // Escreve as credenciais criptografadas no arquivo
            writer.write(encryptedEmail + "\n");
            writer.write(encryptedSenha);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao salvar as credenciais no arquivo 'credenciais.bin'.", e);
            throw new RuntimeException("Erro ao salvar as credenciais.", e);
        }
    }

    /**
     * Carrega as credenciais do arquivo e as descriptografa.
     *
     * @return Um array contendo o email e a senha descriptografados.
     */
    public String[] carregarCredenciais() {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            // Lê as credenciais criptografadas do arquivo
            String encryptedEmail = reader.readLine();
            String encryptedSenha = reader.readLine();
            // Descriptografa o email e a senha
            String email = textEncryptor.decrypt(encryptedEmail);
            String senha = textEncryptor.decrypt(encryptedSenha);
            return new String[]{email, senha};
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar as credenciais do arquivo 'credenciais.bin'.", e);
            throw new RuntimeException("Erro ao carregar as credenciais.", e);
        }
    }

    /**
     * Remove o arquivo de credenciais.
     */
    public void limparCredenciais() {
        try {
            File arquivo = new File(caminhoArquivo);
            if (arquivo.delete()) {
                LOGGER.info("Arquivo 'credenciais.bin' apagado com sucesso.");
            } else {
                LOGGER.warning("Não foi possível apagar o arquivo 'credenciais.bin'.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao limpar o arquivo 'credenciais.bin'.", e);
            throw new RuntimeException("Erro ao limpar as credenciais.", e);
        }
    }
}
