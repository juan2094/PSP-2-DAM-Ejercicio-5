/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.*;
import Modelo.Usuario;

/**
 *
 * @author Cala
 */
public class ConsultaCliente {
    
    public ConsultaCliente(){
        
        
    }
    
   static public Usuario getCliente(String usuario, String contraseña) throws SQLException{
        
        Usuario user = null;
        Connection conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/Examen","examen","examen");
        Statement st = conexion.createStatement();
        
        ResultSet rs = st.executeQuery("Select IDUSUARIO, USUARIO, contrasenia from USUARIO where usuario = '"+usuario+"'"+" AND contrasenia = '"+contraseña+"'");
        
       
        
        while (rs.next()) {
  
        String nombreUsuario = rs.getString("USUARIO");
        String pass = rs.getString("contrasenia");
        int id= rs.getInt("Idusuario");
    
        user = new Usuario(id,nombreUsuario,pass);
    
         System.out.println("Nombre de usuario: " + nombreUsuario +" "+ pass);
}
      
      return  user;
    }
   
   static public int idUsuario(String usuario, String contraseña) throws SQLException{
        
        Usuario user = null;
        Connection conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/Examen","examen","examen");
        Statement st = conexion.createStatement();
        
        ResultSet rs = st.executeQuery("Select IDUSUARIO, USUARIO, contrasenia from USUARIO where usuario = '"+usuario+"'"+" AND contrasenia = '"+contraseña+"'");
        
       int id=-1;

        String nombreUsuario = rs.getString("USUARIO");
        String pass = rs.getString("contrasenia");
        id= rs.getInt("Idusuario");
    
        user = new Usuario(id,nombreUsuario,pass);
    
        System.out.println("id de usuario: "+id);
      
        return  id;
    
    }
   
   static public void updateCli() throws SQLException{
       
       Usuario user = null;
       Connection conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/Examen","examen","examen");
       Statement st = conexion.createStatement();
       //EN CONSTRUCCION;
      // st.executeUpdate("Delete from ");
   }
   
   
}
