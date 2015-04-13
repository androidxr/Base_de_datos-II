/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

/**
 *
 * @author miguel
 */
import java.sql.*;
import javax.swing.JOptionPane;

 


public class Conexion {
    
    
   
   Connection conexion;

    Statement sentencia;
     
    public void mensaje (){
        System.out.println("mansaje");
    }


 public void PrepararBaseDatos() {

     

        try{

            String controlador="com.mysql.jdbc.Driver";

            Class.forName (controlador).newInstance();

        }

        catch (Exception e) {            
            JOptionPane.showMessageDialog(null, "Error al cargar el Controlador");
            
        }

        try {

            String DSN="jdbc:mysql://localhost/mysql";

            String user="root";

            String password="123456";

            conexion=DriverManager.getConnection(DSN,user,password);

        }

        catch (Exception e) {

            JOptionPane.showMessageDialog(null,"Error al realizar la conexion");

        }

        try {

            sentencia=conexion.createStatement(

                    ResultSet.TYPE_SCROLL_INSENSITIVE,

                    ResultSet.CONCUR_READ_ONLY);

        }

        catch (Exception e) {

            JOptionPane.showMessageDialog(null,"Error al crear el objeto sentencia");

        }
        

     }

    void conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
         
  
}
