public class ArgumentosVariables {

    public static void main(String[] args) {
        //imprimirNumeros(1, 2, 3, 4, 5);

        variosParametros("Karla", 10, 20, 30);
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println(nombre);
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    private static void imprimirNumeros(int... numeros) {

        for(int i = 0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");

    }
}
