package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    // Se deja como final porque no cambiara la referencia de la lista
    private static final List<Snack> snacks;

    // Bloque static inicializador
    // Es como un constructor pero constructor para objectos y este ini cuando se hace la clase
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 30));
        snacks.add(new Snack("Sandwich", 90));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for( var snack : snacks){
            inventarioSnacks = inventarioSnacks + snack.toString() + "\n";
        }

        System.out.println(" --- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
