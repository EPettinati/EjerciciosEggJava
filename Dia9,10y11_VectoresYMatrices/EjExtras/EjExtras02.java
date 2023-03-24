/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Am02
 */
public class EjOficial02 {

    /* Escriba un programa que averigüe si dos vectores de N enteros son
    iguales (la comparación deberá detenerse en cuanto se detecte alguna
    diferencia entre los elementos). */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vectorA[] = new int[4];
        int vectorB[] = new int[4];

        for (int i = 0; i < vectorA.length; i++) { // Inicia vectorA y vectorB
            System.out.println("Ingrese un valor para el vector A");
            vectorA[i] = sc.nextInt();
            System.out.println("Ingrese un valor para el vector B");
            vectorB[i] = sc.nextInt();
            if (vectorA[i] == vectorB[i]) { // Compara los 2 vectores
                System.out.println("Son iguales");
            } else {
                System.out.println("No son iguales, fin del programa");
                break;
            }
        }
    }
}
