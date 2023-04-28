package ejoficial03.Operacion;

import java.util.Scanner;

public class Operacion {

    private double n1, n2;

    public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar el numero 1: ");
        n1 = sc.nextDouble();
        System.out.print("Ingresar el numero 2: ");
        n2 = sc.nextDouble();
    }

    public double suma() {
        return n1 + n2;
    }

    public double resta() {
        return n1 - n2;
    }

    public double multi() {
        if (n1 == 0 || n2 == 0) {
            System.out.println("Estas intentando multiplicar por 0");
            return 0;
        } else {
            return n1 * n2;
        }
    }

    public double div() {
        if (n2 == 0) {
            System.out.println("Estas intentando dividir por 0");
            return 0;
        } else {
            return n1 / n2;
        }
    }

}
