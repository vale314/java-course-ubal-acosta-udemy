import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // Leer linea de consola creamos una instancia de tipo Scanner, y pasamos el parametro Syste
           var scanner = new Scanner(System.in);
           System.out.println("Introduzca una linea de texto: ");
           // Leer la siguiente entrada de texto hasta un asalto de linea
           var linea = scanner.nextLine();
           System.out.println("La linea introducida es: " + linea);
        }
    }
