package excepciones;

public class PruebaArimetica {
    public static void main(String[] args) {
        try {
            var resultado = Arimetica.division(10, 0);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            // Siempre se ejecuta sin importar si hubo error o no
            System.out.println("Fin");
        }
    }
}
