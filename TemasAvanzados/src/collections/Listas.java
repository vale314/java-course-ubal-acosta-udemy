package collections;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        // List es una interface padre y ArrayList es una de muchas clases que implementan la interface List

        List miLista = new ArrayList();
        // ArrayList agrega objectos por eso permite diferentos tipos de datos

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Martes"); // Permite elementos duplicados



        for(Object e: miLista) {
            System.out.println(e);
        }

        List<String> miLista1 = new ArrayList();
        miLista1.add("Lunes");
        miLista1.add("Martes");
        miLista1.add("Miercoles");
        miLista1.add("Jueves");
        miLista1.add("Viernes");
        miLista1.add("Sabado");
        miLista1.add("Domingo");

        for(String e: miLista1) {
            System.out.println(e);
        }

        System.out.println("Funcion Lambda");

        // Funciones Lambda o programacion funcional
        miLista1.forEach((e) -> System.out.println(e));


    }
}
