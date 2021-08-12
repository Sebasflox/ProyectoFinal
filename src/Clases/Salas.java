
package Clases;


public class Salas extends sedes{
    
    private String sede;
    private String Total_Asientos;
    private String Asientos_preferenciales;
    private String Asientos_VIP;
    private String Asientos_generales;
    
    public Salas (){}
    
    public Salas (String nombre, String Total_Asientos, String Asientos_preferenciales, String Asientos_VIP, String Asientos_generales, String sede){
        
        super(nombre);
        this.sede = sede;
        this.Total_Asientos = Total_Asientos;
        this.Asientos_preferenciales = Asientos_preferenciales;
        this.Asientos_VIP = Asientos_VIP;
        this.Asientos_generales = Asientos_generales;
        
    }
    
    
    public String getsede(){
    return sede;    
    }
    public void setsede(String Sede){
    sede=Sede;
    }
    
    public String getTotal_Asientos(){
    return Total_Asientos;    
    }
    public void setTotal_Asientos(String total_Asientos){
    Total_Asientos=total_Asientos;
    }
    
    public String getAsientos_preferenciales(){
    return Asientos_preferenciales;
    }
    public void setAsientos_preferenciales(String asientos_preferenciales){
    Asientos_preferenciales=asientos_preferenciales;
    }
    
    public String getAsientos_VIP(){
    return Asientos_VIP;
    }
    public void setAsientos_VIP(String asientos_VIP){
    Asientos_VIP=asientos_VIP;
    }
    
    public String getAsientos_generales(){
    return Asientos_generales;
    }
    public void setAsientos_generales(String asientos_generales){
    Asientos_generales=asientos_generales;
    }
}