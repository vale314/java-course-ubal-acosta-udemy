package arimetica.prueba;

import arimetica.Arimetica;

public class PruebaArimetica {

    public static void main(String[] args) {
        var arimetica1 = new Arimetica(1,2);
        arimetica1.sumar();
        arimetica1.setOperando1(18);
        arimetica1.sumar();
    }

}
