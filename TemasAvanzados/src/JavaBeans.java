// Un javaBean es una clase que debe impletar ciertas propiedades

// Constructor sin parametros
// Getters and setters con sus atributos privados o protejidos
// Implementar la interface serializable

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
           var persona = new Persona();
           persona.setNombre("Jose");
           persona.setApellido("Michael");
           System.out.println(persona);
    }
}

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona() {}

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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}