package Eje3_colecciones.servicios;

import Eje3_colecciones.entidades.Alumno;
import java.util.Scanner;

public class ServiciosAlumnos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {

        Alumno alu = new Alumno();
        System.out.println("Ingrese nombre de alumno: ");
        alu.setNombre(leer.next());
        
        return alu;
    }
}
