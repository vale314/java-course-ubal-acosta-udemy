public interface Traductor {
    // Los metodos son publicos y abstractos si no se agrega nada

    void traducir();

    //Cuando tenemos default ya no es obligatorio que las clases implementen el metodo
    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor");
    }
}


class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traducciendo Ingles");
    }
}

class Frances implements Traductor {
    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando Traductor En Frances");
    }

    @Override
    public void traducir() {
        System.out.println("Traducciendo Frances");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        // Siempre el tipo de datos debe ser el mas generíco o mas arriba posible
        Traductor traductor = new Ingles();
        traductor.iniciarTraductor();
        traductor.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
    }
}