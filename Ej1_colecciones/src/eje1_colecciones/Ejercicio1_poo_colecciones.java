package eje1_colecciones;

import eje1_colecciones.entidades.Perros;
import eje1_colecciones.servicios.ServiciosPerros;
import java.util.ArrayList;
import java.util.Scanner;

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
public class Ejercicio1_poo_colecciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServiciosPerros serv = new ServiciosPerros();
        ArrayList<Perros> listaPerros = new ArrayList();
//        Perros pe;

        String continuar;
        do {
            Perros pe = serv.crearPerro(listaPerros);
      //      serv.cargarListaPerros(pe,listaPerros);
            System.out.println("Desea ingresar otro perro? S/N");
            continuar = leer.next();      
           // System.out.println(listaPerros);
        } while (continuar.equalsIgnoreCase("S"));
   
        serv.mostrarPerros(listaPerros);
    }

}
