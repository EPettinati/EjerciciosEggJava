package ejoficiales.ClasesServicio; // Define el paquete de la clase

import java.util.Arrays; // Importa la clase Arrays de Java
import java.util.Random; // Importa la clase Random de Java

public class ArregloService03 { // Define la clase ArregloService03

    private final Random r = new Random(); // Crea un objeto Random llamado r, final significa que no se puede cambiar

    public void inicializarA(double[] a) { // Define un método llamado inicializarA que recibe una matriz de tipo double como argumento y no devuelve nada
        for (int i = 0; i < a.length; i++) { // Inicia un ciclo for que va desde 0 hasta la longitud de la matriz a
            a[i] = r.nextFloat() * 100; // Asigna un número aleatorio entre 0 y 100 a cada elemento de la matriz
        }
    }

    public void mostrar(double[] a) { // Define un método llamado mostrar que recibe una matriz de tipo double como argumento y no devuelve nada
        for (int i = 0; i < a.length; i++) { // Inicia un ciclo for que va desde 0 hasta la longitud de la matriz a
            System.out.print("["); // Imprime un corchete izquierdo
            System.out.printf("%.2f", a[i]); // Imprime el valor actual del elemento de la matriz con un formato de dos decimales
            System.out.print("] "); // Imprime un corchete derecho y un espacio
        }
    }

    public void ordenar(double[] a) { // Define un método llamado ordenar que recibe una matriz de tipo double como argumento y no devuelve nada
        Arrays.sort(a); // Ordena la matriz en orden ascendente utilizando el método sort de la clase Arrays
        double[] aInvertido = new double[a.length]; // Crea una nueva matriz de doble precisión llamada aInvertido con la misma longitud de la matriz original
        for (int i = 0; i < a.length; i++) { // Inicia un ciclo for que va desde 0 hasta la longitud de la matriz a
            aInvertido[i] = a[a.length - 1 - i]; // Asigna los elementos de la matriz original de manera invertida a la nueva matriz aInvertido
            a[i] = aInvertido[i]; // Asigna los elementos de la nueva matriz a la matriz original
        }
    }

    public void inicializarB(double[] a, double[] b) { // Define un método llamado inicializarB que recibe dos matrices de tipo double como argumento y no devuelve nada
        for (int i = 0; i < 10; i++) { // Inicia un ciclo for que va desde 0 hasta 9
            b[i] = a[i]; // Asigna los primeros 10 elementos de la matriz a a la matriz b
        }
        Arrays.fill(b, 10, b.length, 0.5); // Rellena los elementos restantes de la matriz b desde el índice 10 hasta el final con el valor 0.5 utilizando el método fill de la clase Arrays
    }
}