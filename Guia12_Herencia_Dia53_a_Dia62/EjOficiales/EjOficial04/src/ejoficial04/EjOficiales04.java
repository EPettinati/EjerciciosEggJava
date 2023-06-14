package ejoficial04;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

public class EjOficiales04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        Circulo c = new Circulo();
        
        System.out.println("Ingrese el valor de radio");
        c.setRadio(sc.nextDouble());
        
        System.out.println("Ingrese el valor de base");
        r.setBase(sc.nextDouble());
        System.out.println("Ingrese el valor de altura");
        r.setAltura(sc.nextDouble());
        
        System.out.println("Área del círculo: " + c.calcularArea());
        System.out.println("Perímetro del círculo: " + c.calcularPerimetro());
        
        System.out.println("Área del rectángulo: " + r.calcularArea());
        System.out.println("Perímetro del rectángulo: " + r.calcularPerimetro());
    }

}
