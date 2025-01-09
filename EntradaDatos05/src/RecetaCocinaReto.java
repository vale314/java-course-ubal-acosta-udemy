import java.util.Scanner;

public class RecetaCocinaReto {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("*** Recetas de Cocina ***");
        System.out.print("Nombre del receta cocina es: ");
        var nombre = consola.nextLine();

        System.out.print("Ingresa Los Ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Ingresa el tiempo de preparacion");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("*** Recetas de Cocina ***");
        System.out.println("Nombre del receta cocina es: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultad);

    }
}
