
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexionBD {

    Connection con = null;
    
    public conexionBD()
    {
        try
        {
           con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Sebas\\Desktop\\bases_de_datos\\UsuarioB.accdb");
           Statement st = con.createStatement();
           JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Conexion erronea" + e);
        }
    }
    
    public Connection getConnection ()
    {
        return con;
    }
}
