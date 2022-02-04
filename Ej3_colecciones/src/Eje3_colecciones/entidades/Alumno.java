package Eje3_colecciones.entidades;

import java.util.ArrayList;

/*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.*/
public class Alumno {
//atributos

    private String nombre;
    private ArrayList<Integer> listaNotas = new ArrayList();

//constructores
    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }

//toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }

    //getter y setter     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }
}
