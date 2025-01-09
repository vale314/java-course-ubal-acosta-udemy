import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Ingresa la edad: ");
        int edad = consola.nextInt();
        System.out.println("La edad es: " + edad);

        System.out.print("Ingresa tu altura: ");
        double altura = consola.nextDouble();
        System.out.println("La altura es: " + altura);

        //Se tiene que usar esta linea despues de usar int, souble
        consola.nextLine();

    }
}
