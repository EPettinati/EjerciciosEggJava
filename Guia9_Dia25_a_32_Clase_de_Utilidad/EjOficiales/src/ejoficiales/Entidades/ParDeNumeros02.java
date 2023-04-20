package ejoficiales.Entidades;

public class ParDeNumeros02 {

    private double a, b;

    public ParDeNumeros02() {
        this.a = (Math.random() * 5) + 1;
        this.b = (Math.random() * 5) + 1;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
