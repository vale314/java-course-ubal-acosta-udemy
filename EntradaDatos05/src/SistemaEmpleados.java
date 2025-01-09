import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args){
        System.out.println("*** Sistema De Empleados ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        var nombre = consola.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        var edad = consola.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        var salario = consola.nextDouble();

        System.out.print("Ingrese es jefe de departamento: ");
        var esJefe = consola.nextBoolean();

        var saltoDeLinea = System.lineSeparator();
        System.out.println(saltoDeLinea + "Datos del Empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.printf("Salario: %.2f%n", salario);
        System.out.println("Jefe de departamento: " + esJefe);
    }
}
