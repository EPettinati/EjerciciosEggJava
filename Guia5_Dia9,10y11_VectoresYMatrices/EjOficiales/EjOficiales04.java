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
public class EjOficiales04 {

    /* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int tam = sc.nextInt();
        Random rand = new Random();
        int[][] vector = new int[tam][tam];
        for (int[] vector1 : vector) {
            for (int j = 0; j < vector.length; j++) {
                vector1[j] = rand.nextInt(10);
                System.out.print("[ " + vector1[j] + " ]");
            }
            System.out.println("");
        }

        System.out.println("\nMatriz transpuesta");
        for (int j = 0; j < vector.length; j++) {
            for (int[] vector1 : vector) {
                System.out.print("[ " + vector1[j] + " ]");
            }
            System.out.println("");
        }
    }
}