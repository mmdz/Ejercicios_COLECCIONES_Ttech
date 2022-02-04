package eje1_colecciones.entidades;

public class Perros {
//atributo
    private String nombre;
    private String raza;
    
//constructor    
    public Perros(){}
    public Perros(String nombre, String raza){
        this.nombre =  nombre;
        this.raza = raza;
    }
//getter y setter, tostring

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", raza: " + raza + "\n";
    } 
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre =  nombre;
    }
  
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }    
}
