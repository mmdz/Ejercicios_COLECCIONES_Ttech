package eje1_colecciones.servicios;

import eje1_colecciones.entidades.Perros;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPerros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perros crearPerro(ArrayList<Perros> listaPerros) {
        Perros can = new Perros();

        System.out.println("Ingrese nombre del perro: ");
        can.setNombre(leer.next());

        System.out.println("Ingrese raza de perro: ");
        can.setRaza(leer.next());
        
        listaPerros.add(can);
        return can;
    }

    public void mostrarPerros(ArrayList<Perros> listaPerros) {
        //for (int i = 0; i < listaPerros.size(); i++) {
                    
        //System.out.println( p.getListaPerros().toString());//muestra el listado
            System.out.println("Listado de perros:\n"+listaPerros);
        //}
    }
}
