
package Clases;


public class sedes {
    
    private String nombre;
    private String direccion;
    
    public sedes (){}
    
    public sedes (String nombre){
    
        this.nombre = nombre;
    }
    
    
    public String getnombre(){
    return nombre;
    }
    public void setnombre(String Nombre){
    nombre=Nombre;
    }
    
    public String getdireccion(){
    return direccion;
    }
    public void setdireccion(String Direccion){
    direccion=Direccion;
    }
}
