/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9.pkg10y11;

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
        int[][] matriz = new int[3][3];

        // Leer la matriz desde la entrada del usuario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduzca un numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Verificar que los números introducidos son válidos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Error: los números introducidos deben estar entre 1 y 9.");
                    return;
                }
            }
        }

        // Calcular la suma de cada fila, columna y diagonal de la matriz
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            int sumaPrimaria = 0;
            int sumaSec = 0;
            for (int j = 0; j < 3; j++) {
                sumaPrimaria += matriz[j][j]; // Sumar la diagonal principal
                sumaSec += matriz[j][2 - j]; // Sumar la diagonal secundaria
                // System.out.println(sumaSec + " " + sumaPrimaria);
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            // System.out.println(sumaSec + " " + sumaFila + " " + sumaColumna + " " + sumaPrimaria);
            // Verificar que la suma de la fila, columna y diagonal sea igual
            if (sumaFila != 15 || sumaColumna != 15 || sumaPrimaria != 15 || sumaSec != 15) {
                System.out.println("La matriz no es un cuadrado mágico.");
                return;
            }
        }

        // Si la suma de todas las filas, columnas y diagonales es la misma, la matriz es un cuadrado mágico
        System.out.println("La matriz es un cuadrado mágico.");
    }
}
