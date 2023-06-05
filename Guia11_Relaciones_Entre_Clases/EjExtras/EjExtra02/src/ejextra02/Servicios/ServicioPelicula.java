package ejextra02.Servicios;

import ejextra02.Entidades.Espectadores;
import ejextra02.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    List<Espectadores> espectadores = new ArrayList();
    Espectadores esp = new Espectadores();
    Pelicula pel = new Pelicula();

    public void crearEspectadores(byte cant) {
        for (int i = 0; i < cant; i++) {
            esp.setNombre("Persona " + (i + 1));
            esp.setEdad(r.nextInt(60));
            float dinero = r.nextFloat() * 40;
            esp.setDineroDisp(dinero);

            Espectadores personas = new Espectadores(esp.getNombre(), esp.getEdad(), esp.getDineroDisp());
            espectadores.add(personas);

            System.out.print(esp.getNombre() + " Edad: " + esp.getEdad() + " Cantidad de dinero: ");
            System.out.printf("%.2f", esp.getDineroDisp());
            System.out.println("");
        }
    }

    public void crearPeli() {
        System.out.print("Nombre del Director: ");
        pel.setDirector(sc.nextLine());
        System.out.print("Titulo de la pelicula: ");
        pel.setTitulo(sc.nextLine());
        System.out.print("Duración de la pelicula: ");
        pel.setDuracion(sc.nextInt());
        System.out.println("Edad minima: " + pel.getEdadMinima());
    }

    public void matrizCine() {
        byte cant = 0;
        byte cont = 0;
        char[][] sala = new char[8][6]; // Matriz para representar la sala de cine

        // Inicializar la matriz con espacios vacíos
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = 'O';
            }
        }
        
        // Llenar la sala con los espectadores
        for (Espectadores espectador : espectadores) {
            int fila, columna;
            do {
                fila = r.nextInt(8);
                columna = r.nextInt(6);
            } while (sala[fila][columna] != 'O'); // Buscar un asiento vacío
            if (espectador.getEdad() >= pel.getEdadMinima() && espectador.getDineroDisp() >= 10) {
                sala[fila][columna] = 'X'; // Marcar el asiento como ocupado
                cant++;   
            }
            cont++;
            if (espectadores.size() == cont) {
                System.out.println("Las personas que cumplen con las condiciones son: " + cant);
            }
        }
        
        // Imprimir la matriz de la sala de cine
        for (int fila = 7; fila >= 0; fila--) {
            for (int columna = 0; columna < 6; columna++) {
                System.out.print("| " +(fila + 1) + " " + (char) ('A' + columna) + " " + sala[fila][columna] + " |");
            }
            System.out.println();
        }
    }
}
