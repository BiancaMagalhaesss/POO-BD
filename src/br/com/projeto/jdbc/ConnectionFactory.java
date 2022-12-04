/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 01bia
 */
public class ConnectionFactory {
    
    // metodo chamado get connection que vai retornar o objeto do tipo connection
    public Connection getConnection(){
        
        //tratamento de erro
        try {
            // conexão com o BD
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas","usuario","123");
            
        } catch (Exception erro) { //capture o erro na variavel e,do tipo exception e lance uma nova RuntimeException com esse erro
            throw new RuntimeException(erro);
        }
        
    }
    
}
