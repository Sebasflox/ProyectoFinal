/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellido1;
        String apellido2;
        String nacimiento;
        int dia;
        String mes;
        int año;
        String user;
        String contraseña;
        
        Scanner dato = new Scanner(System.in);
        Usuario usuario = new Usuario(); 
                
        System.out.println("Bienvenido al cinema");
        System.out.println("");
        
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
        mes=dato.next();
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
        
        
        System.out.println("Su nombre es: " + usuario.getnombre() + " " + usuario.getapellido1() + " " + usuario.getapellido2());
        
        System.out.println("Usted nació el: " + usuario.getdia() + " de " + usuario.getmes() + " del año " + usuario.getaño());
        
        System.out.println("Su usuario es: " + usuario.getuser() + " y su password es: " + usuario.getcontraseña());    
    }
    
}
