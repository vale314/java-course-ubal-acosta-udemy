public class ClaseAbstracta {
    public static void main(String[] args) {

        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        // No se puede hacer lo anterior

        FiguraGeometrica figuraGeometrica = new Rectangle();
        figuraGeometrica.dibujar();
        // El tipo de objecto es definido como la clase padre y la instancia de la clase hijo

    }
}

// No se pueden hacer instancias
abstract class FiguraGeometrica{

    // No sabemos que va hacer el metodo hasta que el hijo lo defina en su clase
    public abstract void dibujar();
}

class Rectangle extends FiguraGeometrica{
    // Se obliga a darle una definicion de los metodos abstractos del padre de lo contrario debe ser abs
    public void dibujar(){
        System.out.println("Dibujando el rectangulo");
    }
}