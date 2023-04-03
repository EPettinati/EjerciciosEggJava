package ejextras.Entidades;

import java.util.Scanner;

public class Juego {

    private int j1, j2, g1, g2; //variables para los jugadores y los puntajes
    private String p1, p2; //variables para los nombres de los jugadores

    public Juego() {
    }

    public Juego(int j1, int j2, int g1, int g2, String p1, String p2) {
        this.j1 = j1;
        this.j2 = j2;
        this.g1 = g1;
        this.g2 = g2;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1: Introduzca nombre: ");
        p1 = sc.nextLine(); //se pide el nombre del jugador 1 al usuario
        System.out.print("Jugador 2: Introduzca nombre: ");
        p2 = sc.nextLine(); //se pide el nombre del jugador 2 al usuario
        System.out.print(p1 + ": Introduzca un numero: ");
        j1 = sc.nextInt(); //se pide un número al jugador 1

        int intentos = 5;
        boolean adivino = false;
        while (intentos > 0 && !adivino) {
            System.out.print(p2 + ", adivina el número de " + p1 + " (te quedan " + intentos + " intentos): ");
            j2 = sc.nextInt(); //se pide un número al jugador 2 para adivinar el número del jugador 1

            if (j1 == j2) { //si el número es adivinado, se termina el juego
                System.out.println(p2 + " ganó el juego y le quedaron: " + intentos + " intentos");
                g2 = 0;
                g2++; //se aumenta el puntaje del jugador 2
                adivino = true;
                break;
            } else {
                if (j2 >= j1) { //se informa si el número es mayor o menor que el número a adivinar
                    System.out.println("El numero es más bajo \n");
                } else {
                    System.out.println("El numero es más alto \n");
                }
            }
            intentos--; //se disminuyen los intentos después de cada intento fallido
        }

        if (adivino == false) { //si se acabaron los intentos, se termina el juego
            System.out.println("¡Se acabaron los intentos! El número era " + j1 + ".");
            g1++; //se aumenta el puntaje del jugador 1
        }

        System.out.println("Jugador 1 ha ganado " + g1 + " veces."); //se informa el puntaje del jugador 1
        System.out.println("Jugador 2 ha ganado " + g2 + " veces."); //se informa el puntaje del jugador 2
    }
}