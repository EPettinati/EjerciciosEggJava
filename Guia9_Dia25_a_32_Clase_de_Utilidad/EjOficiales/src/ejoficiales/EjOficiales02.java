package ejoficiales;

import ejoficiales.ClasesServicio.ParDeNumerosService02;
import ejoficiales.Entidades.ParDeNumeros02;

public class EjOficiales02 {

    public static void main(String[] args) {
        ParDeNumeros02 c = new ParDeNumeros02();
        
        ParDeNumerosService02 p = new ParDeNumerosService02();
        
        p.mostrarValores();
        System.out.print("\nEl mayor es: ");
        System.out.printf("%.2f", p.devolverMayor());
        System.out.println("\nLa potencia es: " + p.calcularPotencia());
        System.out.println("La raiz es: " + p.calculaRaiz());
    }

}
