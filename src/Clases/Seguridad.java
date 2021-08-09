
package Clases;

import javax.swing.JOptionPane;
import proyectofinal.Inicio_sesion;


public class Seguridad {
    
    Inicio_sesion login = new Inicio_sesion();
    String res; 
    
    public void validarUsuario(String usuarios[], String user, String pwd, int intentos){
    
        boolean encontrado = false;
        
        for(int i=0; i < usuarios.length; i++){
        
            if((usuarios[i].equalsIgnoreCase(user)&& usuarios[i+1].equals(pwd))){
            
                res = "Bienvenido/a " + user;
                encontrado  = true;
                JOptionPane.showMessageDialog(null, res," Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                intentos=0;
                login.setIntentos(intentos);
                break;
            
            }
        
        }//Fin del parametro for
    
        if (encontrado == false){
        
            res=" Usuario y/o Contraseña incorrectos, lleva " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res," Inicio de sesion", JOptionPane.ERROR_MESSAGE);
        }
        
        if (intentos > 2){
        
            JOptionPane.showMessageDialog(null, "3 intentos fallidos", " Inicio de sesion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        
        }
        
    }
    
    
}
