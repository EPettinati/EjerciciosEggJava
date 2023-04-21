package ejextras.Servicios;

import ejextras.Entidades.Ahorcado02; // Importar la clase Ahorcado02 del paquete Entidades
import java.util.ArrayList; // Importar la clase ArrayList del paquete util
import java.util.List; // Importar la clase List del paquete util
import java.util.Random; // Importar la clase Random del paquete util
import java.util.Scanner; // Importar la clase Scanner del paquete util

public class AhorcadoService02 {

    // Método para crear un nuevo juego de Ahorcado02
    public static Ahorcado02 crearJuego() {
        Ahorcado02 p = new Ahorcado02(); // Crear una instancia de Ahorcado02
        Random r = new Random(); // Crear una instancia de Random

        Scanner sc = new Scanner(System.in); // Crear una instancia de Scanner para leer entrada del usuario
        String[] pal = {"queso", "almohada", "pintura", "ternera", "mazo", "jugo", "juego"}; // Array de palabras para el juego
        System.out.println("Elije la cantidad de intentos!"); // Solicitar al usuario que ingrese la cantidad de intentos
        p.setJugaMax(sc.nextByte()); // Establecer la cantidad de intentos en el objeto Ahorcado02

        int palSecreta = r.nextInt(pal.length); // Seleccionar una palabra aleatoria del array de palabras
        String palAle = pal[palSecreta]; // Obtener la palabra aleatoria seleccionada
        p.setCantLetras(palAle.length()); // Establecer la cantidad de letras de la palabra aleatoria en el objeto Ahorcado02

        // Convertir la palabra aleatoria en un array de caracteres y establecerlo en el objeto Ahorcado02
        char[] letras = new char[p.getCantLetras()];
        for (int i = 0; i < p.getCantLetras(); i++) {
            letras[i] = palAle.charAt(i);
        }
        p.setPalabra(letras);

        return p; // Devolver el objeto Ahorcado02 creado
    }

    // Método para obtener la longitud de la palabra del objeto Ahorcado02
    public int longitud(Ahorcado02 p) {
        return p.getCantLetras(); // Devolver la cantidad de letras de la palabra en el objeto Ahorcado02
    }

    public void buscar(Ahorcado02 p, char letra) {
        boolean letraEncontrada = false; // Variable que indica si la letra fue encontrada
        List<Integer> posicionesLetra = new ArrayList<>(); // Lista que almacena las posiciones de la letra en la palabra

        // Obtener la palabra del objeto Ahorcado02
        char[] palabra = p.getPalabra();

        // Recorrer la palabra letra por letra
        for (int i = 0; i < palabra.length; i++) {
            // Comparar la letra dada por el usuario con la letra de la palabra
            if (letra == palabra[i]) {
                letraEncontrada = true; // La letra fue encontrada
                posicionesLetra.add(i); // Agregar la posición de la letra a la lista
            }
        }

        // Verificar si la letra fue encontrada
        if (letraEncontrada) {
            // Mostrar las posiciones de la letra en la palabra
            System.out.println("La letra " + letra + " está en la palabra en la(s) posición(es): " + posicionesLetra);
        } else {
            // Mostrar que la letra no está en la palabra
            System.out.println("La letra " + letra + " no está en la palabra.");
        }
    }

    public boolean encontradas(Ahorcado02 p, char letra) {
        boolean letraEncontrada = false;
        List<Integer> posicionesLetra = new ArrayList<>();
        int cont = 0;
        // Obtener la palabra del objeto Ahorcado02
        char[] palabra = p.getPalabra();

        // Recorrer la palabra letra por letra
        for (int i = 0; i < palabra.length; i++) {
            // Comparar la letra dada por el usuario con la letra de la palabra
            if (letra == palabra[i]) {
                letraEncontrada = true;
                posicionesLetra.add(i);
                cont++;
            }
        }

        // Si se encontró la letra en la palabra
        if (letraEncontrada) {
            System.out.println("La letra " + letra + " está en la palabra en la(s) posición(es): " + posicionesLetra);
        } else {
            // Si no se encontró la letra en la palabra
            System.out.println("La letra " + letra + " no está en la palabra.");
            // Disminuir el número de intentos restantes del jugador
            p.setJugaMax(p.getJugaMax() - 1);
        }

        // Devolver si se encontró la letra en la palabra o no
        return letraEncontrada;
    }

    public int intentos(Ahorcado02 p) {
        return p.getJugaMax();
    }

    public void juego() {
        // Crear objeto Ahorcado02 y scanner para entrada de usuario
        Ahorcado02 juego = crearJuego();
        Scanner sc = new Scanner(System.in);
        char letra;
        int letrasAdivinadas = 0;

        // Ciclo principal del juego
        while (juego.getJugaMax() > 0) {
            System.out.println("Ingresa una letra: ");
            letra = sc.next().charAt(0);

            // Verificar si la letra ingresada está en la palabra
            if (encontradas(juego, letra)) {
                letrasAdivinadas++;
                // Si todas las letras fueron adivinadas, el jugador ganó
                if (letrasAdivinadas == juego.getCantLetras()) {
                    System.out.println("¡Has ganado! La palabra era: " + new String(juego.getPalabra()));
                    return;
                } else {
                    System.out.println("Te quedan " + intentos(juego) + " intentos.");
                }
            } else {
                // Si la letra no está en la palabra, disminuir los intentos disponibles
                if (intentos(juego) == 0) {
                    System.out.println("¡Has perdido! La palabra era: " + new String(juego.getPalabra()));
                } else {
                    System.out.println("Te quedan " + intentos(juego) + " intentos.");
                }
            }
        }
    }
}
