package excepciones;

public class Arimetica {
    public static int division(int a, int b) throws Exception {
        if(a == 0)
            throw new Exception("Division by zero"); // Es una forma de crear un excepcion

        return a / b;
    }
}
