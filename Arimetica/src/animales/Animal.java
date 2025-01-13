package animales;

public class Animal {
    protected void comer(){
        System.out.println("Comer");
    }

    protected void dormir(){
        System.out.println("Dormir");
    }
}

class Perro extends Animal {
    // Si no se agrega public esta default solo se puede haceder desde la clase
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

    @Override
    protected void dormir(){
        super.dormir();
        System.out.println("Dormir 15 horas");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        var animal1 = new Animal();
        animal1.comer(); // SE PUEDE ACCEDER PORQUE ESTA DENTRO DEL MISMO ARCHIVO

        var animal2 = new Perro();
        animal2.hacerSonido();
        animal2.comer();
        animal2.dormir();

    }
}