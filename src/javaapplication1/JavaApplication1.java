/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Controlador.Conexion;
import Modelo.Usuario;
import controlador.ConsultaCliente;
import Controlador.ConsultaDetalle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cala
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
        
        Conexion conexion = new Conexion();
        
        Usuario cli = ConsultaCliente.getCliente("jane_smith","securepass");
        
       
        
        
           }
    
}
