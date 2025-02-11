public class Excepciones {
    public static void main(String[] args) {

        int valor  = 10;
        int valor1  = 0;

        try {
            int resultado = valor / valor1;

            System.out.println(resultado);
        }catch (Exception e) {
            // La excepcion Exception es la mas generica que existe
            // Para Excepciones arimeticas es ArithmeticException
            System.out.println(e.getMessage());
        }
    }
}
