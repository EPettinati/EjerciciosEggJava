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
public class EjExtras01 {
/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un numero: ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        System.out.println("El total de los elementos dentro del vector es: " + suma);
    }
    
}
