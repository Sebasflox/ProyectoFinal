
package proyectofinal;

import Clases.Usuario;
import java.util.Scanner;


public class ProyectoFinal {
    
    
    public static void main(String[] args) {
        
        
        
        String nombre;
        String apellido1;
        String apellido2;
        String nacimiento;
        int dia;
        int mes;
        int año;
        String user;
        String contraseña;
        int decision;
        String passAdmin;
        String userAdmin;
        
 
 
        
        Scanner dato = new Scanner(System.in);
        Usuario usuario = new Usuario();
                
        System.out.println("Bienvenido al cinema");
        System.out.println("");
        
        System.out.println("Digite 1 para iniciar sesión y 2 para registrarse");
        System.out.println("");
        
        System.out.print("Respuesta: ");
        decision = dato.nextInt(); 
        System.out.println("");
        
        
       if(decision==842){
           
           System.out.println("Ingrese su usuario de administrador");
           System.out.print("Usuario: ");
           System.out.print("Contraseña: ");
           System.out.println("Su usuario fue registrado");
       }
        
       if(decision==248){
           
           System.out.println("Registre su usuario de administrador");
           System.out.println("");
           System.out.print("Usuario: ");
           userAdmin=dato.next();
           System.out.print("Contraseña: ");
           passAdmin=dato.next();
           System.out.println("Su usuario fue registrado");
       }
   
       if (decision==1){
           
           System.out.println("Por favor inicie sesion");
           System.out.println("");
           System.out.println("Usuario: ");
           System.out.println("Contraseña: ");
           

       } 
        
       if (decision==2){
        
        
        System.out.println("Por favor ingrese sus datos personales");
        System.out.println("");
        
        System.out.print("Nombre: ");
        nombre = dato.next();
        usuario.setnombre(nombre);
        
        System.out.print("Primer apellido: ");
        apellido1 = dato.next();
        usuario.setapellido1(apellido1);
        
        System.out.print("Segundo apellido: ");
        apellido2 = dato.next();
        usuario.setapellido2(apellido2);
        System.out.println("");
        
        System.out.println("Por favor ingrese su fecha de nacimiento");
        System.out.println("");
        
        System.out.print("Dia: ");
        dia=dato.nextInt(); 
        usuario.setdia(dia);
        
        System.out.print("Mes: ");
        mes=dato.nextInt();
        usuario.setmes(mes);
        
        System.out.print("Año: ");
        año=dato.nextInt();
        usuario.setaño(año);
        System.out.println("");
        
        System.out.println("Creacion de Usuario");
        System.out.println("");
        
        System.out.print("Por favor cree un usuario: ");
        user=dato.next();
        usuario.setuser(user);
        
        System.out.print("Por favor cree un password: ");
        contraseña=dato.next();
        usuario.setcontraseña(contraseña);
        System.out.println("");
        
        
        //System.out.println("Su nombre es: " + usuario.getnombre() + " " + usuario.getapellido1() + " " + usuario.getapellido2());
        
        //System.out.println("Usted nació el: " + usuario.getdia() + " del " + usuario.getmes() + " del año " + usuario.getaño());
        
        //System.out.println("Su usuario es: " + usuario.getuser() + " y su password es: " + usuario.getcontraseña());
       
        }
    }
}
