package ejoficiales02;

import ejoficiales02.Servicio.Juego;
import ejoficiales02.entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class EjOficiales02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de jugadores (entre 1 y 6):");
        int numJugadores = sc.nextInt();
        sc.nextLine();

        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }

        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        Juego juego = new Juego();
        juego.llenarJuego(jugadores);
        juego.Ronda();
    }

}