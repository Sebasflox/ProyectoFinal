
package Clases;


public class Usuario extends sedes{
    
    private String apellido1;
    private String apellido2;
    private int dia;
    private int mes;
    private int año;
    private String user;
    private String contraseña;
    
    
    public Usuario (){}
    
    public Usuario (String nombre, String apellido1, String apellido2, int dia, int mes, int año, String user, String contraseña){
    
        super(nombre);
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.user = user;
        this.contraseña = contraseña;
    
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
