package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

// un java bean debe tener un constructor vacio
// getter y setter y los atrubutos privados
// es un estandar
public class Snack implements Serializable {
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack(){
        this.idSnack = ++contadorSnacks;
    }

    public Snack(String nombre, double precio){
        this(); //manda llamar el constructor vacio
        // Debe ser siempre la primera linea del cosntructor
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    // Se crean estos metodos para la comparacion de estos objetos en nuestra lista que usaremos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    // Es para tener un hash con los datos del objeto y siempre sera unico por nuestro Id incluido
    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
