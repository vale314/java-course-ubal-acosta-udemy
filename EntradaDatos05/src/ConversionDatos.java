import java.util.Scanner;

public class ConversionDatos {
    public static void main(String[] args){

        var consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();

        var entero = Integer.parseInt(enteroString);
        System.out.println("entero: " + entero);

        System.out.println("Proporciona un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.print("flotante: " + flotante);

        //Double.parseDouble
        //Boolean.parseBoolean
    }
}
