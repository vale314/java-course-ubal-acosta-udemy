package arimetica;

public class Arimetica {
    private int operando1;
    private int operando2;

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public int getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public Arimetica(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println(resultado);
    }

    public void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println(resultado);
    }
}
