package ejextras.Entidades;

import java.util.Scanner;

public class Juego {

    private int j1, j2, g1, g2;
    private String p1, p2;

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
        p1 = sc.nextLine();
        System.out.print("Jugador 2: Introduzca nombre: ");
        p2 = sc.nextLine();
        System.out.print(p1 + ": Introduzca un numero: ");
        j1 = sc.nextInt();

        int intentos = 5;
        boolean adivino = false;
        while (intentos > 0 && !adivino) {
            System.out.print(p2 + ", adivina el número de " + p1 + " (te quedan " + intentos + " intentos): ");
            j2 = sc.nextInt();

            if (j1 == j2) {
                System.out.println(p2 + " ganó el juego y le quedaron: " + intentos + " intentos");
                g2 = 0;
                g2++;
                adivino = true;
                break;
            } else {
                if (j2 >= j1) {
                    System.out.println("El numero es más bajo \n");
                } else {
                    System.out.println("El numero es más alto \n");
                }
            }
            intentos--;

        }

        if (adivino == false) {
            System.out.println("¡Se acabaron los intentos! El número era " + j1 + ".");
            g1++;
        }

        System.out.println("Jugador 1 ha ganado " + g1 + " veces.");
        System.out.println("Jugador 2 ha ganado " + g2 + " veces.");
    }

}
