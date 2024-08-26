/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prg03_scedu.mail.service;

/**
 *
 * @author Micro
 */
public interface MailIService {
    
    void enviarEmail(String remetente, String destinatario, String assunto, String mensagem);
   
}
