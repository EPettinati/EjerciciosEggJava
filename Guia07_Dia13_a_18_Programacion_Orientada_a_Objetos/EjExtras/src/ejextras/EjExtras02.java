package ejextras;

import ejextras.Entidades.Puntos;

public class EjExtras02 {

    public static void main(String[] args) {
        Puntos p = new Puntos();
        p.crearPuntos();
        System.out.println("La distancia es: " + p.calcDistancia());
    }

}
