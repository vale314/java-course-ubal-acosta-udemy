package animales1;

public class Animal {
    protected void hacerSonido(){
        System.out.println("Hacer sonido");
    }

}

class Perro extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("Puedo hace wauf");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("Puedo hacer rrrr");
    }
}

class PruebaAnimal{

    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        imprimirSonido(animal);

        Perro perro = new Perro();
        imprimirSonido(perro);

        Gato gato = new Gato();
        imprimirSonido(gato);
    }
}