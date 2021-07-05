
package Clases;


public class Salas {
    
    private String sede;
    private String nombre_sala;
    private int total_asientos;
    private int preferenciales;
    private int vip;
    private int generales;
    
    
    public String getsede(){
    return sede;
    }
    public void setsede(String Sede){
    sede=Sede;
    }
    
    public String getnombre_sala(){
    return nombre_sala;
    }
    public void setnombre_sala(String Nombre_sala){
    nombre_sala=Nombre_sala;
    }
    
    public int gettotal_asientos(){
    return total_asientos;
    }
    public void settotal_sala(int Total_asientos){
    total_asientos=Total_asientos;
    }
    
    public int getpreferenciales(){
    return preferenciales;
    }
    public void setpreferenciales(int Preferenciales){
    preferenciales=Preferenciales;
    }
    
    public int getvip(){
    return vip;
    }
    public void setvip(int Vip){
    vip=Vip;
    }
    
    public int getgenerales(){
    return generales;
    }
    public void setgenerales(int Generales){
    generales=Generales;
    }
    
}
