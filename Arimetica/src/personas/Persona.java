package personas;

// Todas las clases heredan de la clase Object
public class Persona extends Object{

    // Los atributos staticos se hace referencia a la clase no a la instancia

    private static int contador = 0;
    private String nombre;

    private String apellido;
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        contador++;
    }

    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static int getContador() {
        return contador;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", contador=" + contador + '}';
    }
}
