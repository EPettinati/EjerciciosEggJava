/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9.pkg10y11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class EjOficiales03 {

    /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario.
        Random rand = new Random(); // Se crea un objeto Random para generar números aleatorios.

        System.out.println("Ingrese un numero para el vector");
        int num1 = sc.nextInt(); // Se solicita al usuario que ingrese un número entero para determinar el tamaño del vector.

        int[] vector = new int[num1]; // Se crean dos arreglos: "vector" para almacenar los números aleatorios generados y "contador" para contabilizar
        int[] contador = new int[5]; //la cantidad de números de 1, 2, 3, 4 y 5 dígitos.

        for (int i = 0; i < vector.length; i++) { // Se recorre el vector y se generan números aleatorios de hasta 5 dígitos utilizando el objeto Random. 
            vector[i] = rand.nextInt(99999);      // Luego, se determina la cantidad de dígitos de cada número utilizando el método "length" de la clase String y se incrementa el contador correspondiente en el arreglo "contador".
            System.out.println(vector[i]);
            int digitos = String.valueOf(vector[i]).length();
            contador[digitos - 1]++;
        } 

        for (int i = 0; i < 5; i++) {
            System.out.println("Existen en el indice " + (i + 1) + " " + contador[i] + " de digitos");
        }
        // Finalmente, se imprime la cantidad de números de 1, 2, 3, 4 y 5 dígitos en el vector utilizando el arreglo "contador".
    }
}
