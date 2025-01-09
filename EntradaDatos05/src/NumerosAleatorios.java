import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        System.out.println("*** Numeros Aleatorios ***");
        var random = new Random();

        // Generar un numero aleatorio
        var aleatorio = random.nextInt(10);
        System.out.println(aleatorio);
    }
}
