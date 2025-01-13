public class Persona {
    private String nombre;
    private String apellido;
    //var nombre1; esto no se debe hacer siempre definidos

    void mostrarPersona(){
        var variableLocal = "valor1";
        System.out.println(variableLocal);
        System.out.println(nombre);
        System.out.println(apellido);
    }

    public static void main(String[] args) {
        var persona = new Persona();
        persona.nombre = "Valentina";
        persona.apellido = "Madrid";
        persona.mostrarPersona();
    }
}

///Podemos tener varias clases en un archivo solo una publica y no es recomendado hacerlo varias
//class Persona1 {}

//class Persona2 {}