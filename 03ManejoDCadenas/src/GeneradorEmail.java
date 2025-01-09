public class GeneradorEmail {
    public static void main(String[] args) {
        String nombre = "Osbaldo Acosta Soto";
        String empresa = "Java Company";
        String dominio = "com.mx";

        var resultado = nombre.trim().replace(" ", ".");
        resultado = resultado.concat("@");
        resultado = resultado.concat(empresa.trim().replace(" ", "."));
        resultado = resultado.concat(dominio.trim());

        System.out.println(resultado);
    }
}
