package ejoficial02;

import ejoficial02.Entidades.Electrodomestico;
import ejoficial02.Entidades.Lavadora;
import ejoficial02.Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class EjOficial02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();

        l.creaLavadora();
        System.out.println("Precio final de la Lavadora: $" + l.precioFinal());

        t.crearTelevisor();
        System.out.println("Precio final del Televisor: $" + t.precioFinal());
    }
}
