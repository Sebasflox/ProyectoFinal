
package Clases;


public class Peliculas extends sedes{
    
    private String titulo;
    private String director;
    private String actor;
    private String actriz;
    private String genero;
    
    public Peliculas (){}
    
    public Peliculas (String nombre, String titulo, String director, String actor, String actriz, String genero){
        
        super(nombre);
        this.actor = actor;
        this.actriz = actriz;
        this.director = director;
        this.genero = genero;
        this.titulo = titulo;
        
    }
    
    
    public String gettitulo(){
    return titulo;    
    }
    public void settitulo(String Titulo){
    titulo=Titulo;
    }
    
    public String getdirector(){
    return director;    
    }
    public void setdirector(String Director){
    director=Director;
    }
    
    public String getactor(){
    return actor;
    }
    public void setactor(String Actor){
    actor=Actor;
    }
    
    public String getactriz(){
    return actriz;
    }
    public void setactriz(String Actriz){
    actriz=Actriz;
    }
    
    public String getgenero(){
    return genero;
    }
    public void setgenero(String Genero){
    genero=Genero;
    }
}