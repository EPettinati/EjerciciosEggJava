package ejoficiales02.Servicio;

import ejoficiales02.entidades.Jugador;
import ejoficiales02.entidades.RevolverAgua;
import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.revolver = new RevolverAgua();
    }

    public void llenarJuego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.revolver.llenarRevolver();
    }

    public void Ronda() {
        byte aux = 0;
        boolean mojado = false;

        while (!mojado) {
            Jugador jugadorActual = jugadores.get(aux);
            mojado = jugadorActual.disparo(revolver);
            aux = (byte) ((aux + 1) % jugadores.size());
        }

        for (Jugador jugador : jugadores) {
            if (jugador.isMojado()) {
                System.out.println("El jugador mojado es: " + jugador.toString());
                break;
            }
        }
    }
}
