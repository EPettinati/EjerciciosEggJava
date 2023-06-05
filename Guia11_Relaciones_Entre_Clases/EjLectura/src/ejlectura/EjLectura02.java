package ejlectura;

import ejlectura.entidades.EJJugador02;
import ejlectura.entidades.EJJugador02.Equipo;
import ejlectura.entidades.EJJugador02.Jugador;
import java.util.Scanner;

public class EjLectura02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equipo equipo = new EJJugador02().new Equipo();
        for (int i = 0; i < 2; i++) {
            System.out.println("--------JUGADOR--------");
            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Ingrese posición: ");
            String posicion = sc.nextLine();
            System.out.print("Ingrese el numero: ");
            byte numero = sc.nextByte();
            sc.nextLine();

            Jugador e = new EJJugador02().new Jugador(nombre, apellido, posicion, numero);
            equipo.agregarJugador(e);
        }
        
        System.out.println("-------------------------");
        System.out.println("--------JUGADORES--------");
        System.out.println("-------------------------");
        for (Jugador jugador : equipo.getJugadores()) {
            System.out.println(jugador.toString());
        }
    }

}
