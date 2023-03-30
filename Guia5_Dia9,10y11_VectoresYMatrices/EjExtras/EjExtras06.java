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
public class EjExtras06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] palabras = new String[5];
        int[] aleatorio = new int[5];
        char[][] sopa = new char[20][20];
        Random rand = new Random(); // fila aleatoria donde se ubicarán las palabras
        int columnasUsadas = 0;

        // Leer las palabras
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese la palabra " + (i + 1) + " (entre 3 y 5 caracteres): ");
                palabras[i] = sc.nextLine();
                aleatorio[i] = rand.nextInt(20);
            } while (palabras[i].length() < 3 || palabras[i].length() > 5);
        }

        // Colocar las palabras en la sopa
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            
            for (int j = 0; j < palabra.length(); j++) {
                if (rand.nextInt(20) < sopa.length && columnasUsadas + j < sopa[rand.nextInt(20)].length) {
                    sopa[aleatorio[i]][columnasUsadas + j] = palabra.charAt(j);
                }
            }
            columnasUsadas += palabra.length() + 1; // sumar la longitud de la palabra más un espacio en blanco
        }

        // Rellenar los espacios vacíos con números aleatorios
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (Math.random() * 10 + '0'); // número aleatorio entre 0 y 9
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
