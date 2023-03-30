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
public class EjOficiales05 {

    /* Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
    pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y
    se obtiene cambiando sus filas por columnas (o viceversa).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario ingresar el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        int n = sc.nextInt();

        // Creamos la matriz y una variable para indicar si es antisimétrica
        int[][] matriz = new int[n][n];
        boolean antisimetrica = true;

        // Pedimos al usuario ingresar los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Verificamos si la matriz es antisimétrica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Comparamos el elemento con su simétrico en la diagonal
                if (matriz[i][j] != -matriz[j][i]) {
                    // Si no cumple la propiedad de antisimetría, cambiamos la variable
                    antisimetrica = false;
                    break;
                }
            }
            // Salimos del bucle si encontramos un elemento que no cumple la propiedad
            if (!antisimetrica) {
                break;
            }
        }

        // Mostramos el resultado
        if (antisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
}

// {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}}; Utilizar los siguientes numeros para comprobar si la matriz es antisimétrica.
