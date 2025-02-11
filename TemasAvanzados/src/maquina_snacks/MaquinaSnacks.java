package maquina_snacks;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);

        //Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();

        System.out.println("***** Maquina de Snacks *****");
        Snacks.mostrarSnacks();

        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpiones(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }finally {
                System.out.println("***** Salir del programa *****");
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.println("""
                    1. Comprar snack
                    2. Mostrar ticket
                    3. Agregar Nuevo Snack
                    4. Salir
                    Elige una opcion:\s
                """);

        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpiones(int opcion, Scanner consola, List<Snack>productos) {
        var salir = false;

        switch (opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                    System.out.println("Salir del programa *****");
                    salir = true;
                }

        }

        return salir;
    }

    private static void agregarSnack(Scanner consola) {
        System.out.println("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.println("Precio del snack: ");
        var precio = consola.nextDouble();
        Snack snack = new Snack(nombre, precio);
        Snacks.agregarSnack(snack);

        System.out.println("El snack ha sido agregado.");
        Snacks.mostrarSnacks();
    }

    private static void mostrarTicket(List<Snack> productos) {
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;

        for (var producto : productos) {
            ticket += "\n\t" + producto.getNombre() + " - $" + producto.getPrecio() + "\n";
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal: $" + total;
        System.out.println(ticket);
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos) {
        System.out.println("Que snack quieres comprar (id): ?");
        var idSnack = Integer.parseInt(consola.nextLine());

        // Validar que el id existe
        var snackEcontrado = false;

        for( var snack: Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()){
                productos.add(snack);
                System.out.println("Snack agregado");
                snackEcontrado = true;
                break;
            }
        }

        if(!snackEcontrado){
            System.out.println("Snack no encontrado");
        }
    }
}
