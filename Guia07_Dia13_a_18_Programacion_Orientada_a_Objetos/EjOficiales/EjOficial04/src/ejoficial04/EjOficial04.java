package ejoficial04;

import ejoficial04.Rectangulo.Rectangulo;

public class EjOficial04 {

    public static void main(String[] args) {
        Rectangulo c = new Rectangulo();

        System.out.println("El perimetro es: " + c.calcularPerimetro());
        System.out.println("La superficie es: " + c.calcularSuperficie());
        c.dibujarRectangulo();
    }

}
