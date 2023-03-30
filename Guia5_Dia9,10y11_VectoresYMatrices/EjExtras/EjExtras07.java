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
public class EjExtras07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cuantas veces quiere sumar la sucesión de Fibonacci");
        // Leer la cantidad de veces que se quiere sumar la sucesión de Fibonacci
        int fibonacci = sc.nextInt();

        // Crear un array de tamaño fibonacci para almacenar los números de la sucesión de Fibonacci
        int[] calcFibonacci = new int[fibonacci];

        // El primer y segundo número de la sucesión son siempre 1, es por eso que los declaramos previamente.
        calcFibonacci[0] = 1;
        calcFibonacci[1] = 1;

        // Este bucle nos permite calcular los números de la sucesión de Fibonacci a partir del tercer número
        for (int i = 2; i < fibonacci; i++) {
            calcFibonacci[i] = calcFibonacci[i - 1] + calcFibonacci[i - 2];
        }

        // Imprimir los números de la sucesión de Fibonacci
        System.out.println("Los " + fibonacci + " primeros números de la sucesión de Fibonacci son:");
        for (int i = 0; i < fibonacci; i++) {
            System.out.print("[ " + calcFibonacci[i] + " ]");
        }
    }
}