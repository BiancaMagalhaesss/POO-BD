/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author 01bia
 */
public class TestaComexao {
    
    public static void main(String[] args) {//metodo principal
        try {
            
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado com sucesso!");
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null,"Ops! Aconteceu o erro: "+erro);//mostrando o erro
        }
        
    }
   
    
}
