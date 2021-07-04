
package Clases;


public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nacimiento;
    private int dia;
    private int mes;
    private int año;
    private String user;
    private String contraseña;
    
    public String getnombre(){
    return nombre;
    }
    public void setnombre(String Nombre){
    nombre = Nombre;
    }
    
    public String getapellido1(){
    return apellido1;
    }
    public void setapellido1(String Apellido1){
    apellido1 = Apellido1;
    }
    
    public String getapellido2(){
    return apellido2;
    }
    public void setapellido2(String Apellido2){
    apellido2 =Apellido2;
    }
    
    public int getdia(){
    return dia;
    }
    public void setdia(int Dia){
    dia = Dia;
    }
    
    public int getmes(){
    return mes;
    }
    public void setmes(int Mes){
    mes=Mes;
    }
    
    public int getaño(){
    return año;
    }
    public void setaño(int Año){
    año=Año;
    }
    
   /* public String getnacimiento(){
    return nacimiento;
    }
    public void setnacimiento(){
    nacimiento = (dia + mes + año);
    }*/
    
    public String getuser(){
    return user;
    }
    public void setuser(String User){
    user=User;
    }
    
    public String getcontraseña(){
    return contraseña;
    }
    public void setcontraseña(String Contraseña){
    contraseña=Contraseña;
    }
}
