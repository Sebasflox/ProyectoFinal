
package Clases;


public class Salas extends sedes{
    
    private String sede;
    private int total_asientos;
    private int preferenciales;
    private int vip;
    private int generales;
    
    public Salas (){}
    
    public Salas (String nombre, String sede, int total_asientos, int preferenciales, int vip, int generales){
    
        super(nombre);
        this.generales = generales;
        this.sede = sede;
        this.total_asientos = total_asientos;
        this.preferenciales = preferenciales;
        this.vip = vip;
    
    }
    
    public String getsede(){
    return sede;
    }
    public void setsede(String Sede){
    sede=Sede;
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
