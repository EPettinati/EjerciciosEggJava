package ejextra02;

import ejextra02.Servicios.ServicioPelicula;
import java.util.Scanner;

public class EjExtra02 {

    public static void main(String[] args) {
        ServicioPelicula sP = new ServicioPelicula();
        Scanner sc = new Scanner(System.in);
        
        sP.crearPeli();
        sP.matrizCine();
        
        System.out.println("¿Cuantas personas van a ir al cine?");
        byte cant = sc.nextByte();
        sP.crearEspectadores(cant);
        
        sP.matrizCine();
        
    }
}