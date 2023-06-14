package Servicio;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServiciosBaraja {

    Baraja b = new Baraja();
    List<Carta> cartas = b.getCartas();
    List<Carta> removCartas = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public void barajar() {
        Collections.shuffle(cartas);
        System.out.println("Barajando...");
    }

    public void siguienteCarta() {
        for (Carta sigCart : cartas) {
            if (!cartas.isEmpty()) {
                System.out.println(sigCart);
                cartas.remove(sigCart);
                removCartas.add(sigCart);
            } else {
                System.out.println("No hay más cartas");
            }
            break;
        }
    }

    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas es: " + cartas.size());
    }

    public void darCartas() {
        System.out.print("Ingrese la cantidad de cartas que desea: ");
        byte cant = sc.nextByte();
        boolean noHayCartas = false;
        byte aux = (byte) cartas.size();
        
        for (int i = 0; i < cant && !noHayCartas; i++) {
            if (cant >= aux) {
                System.out.println("No hay más cartas");
                noHayCartas = true;
            } else {
                for (Carta sigCart : cartas) {
                    System.out.println(sigCart);
                    cartas.remove(sigCart);
                    removCartas.add(sigCart);
                    break;
                }
            }
        }
    }

    public void cartasMonton() {
        if (removCartas.isEmpty()) {
            System.out.println("No hay cartas en juego");
        } else {
            System.out.println("Las cartas que están en  el mazo son: " + removCartas);
        }
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas en la bajara.");
        } else {
            System.out.println("Las cartas que están en la baraja son: " + cartas);
        }
    }

}
