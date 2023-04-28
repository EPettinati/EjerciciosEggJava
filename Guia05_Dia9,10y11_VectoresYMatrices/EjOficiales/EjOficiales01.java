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
public class EjOficial01 {

    /* Realizar un algoritmo que llene un vector con los 100 primeros números
    enteros y los muestre por pantalla en orden descendente. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        int vector[] = new int[num1];
        for (int i = 0; i < num1; i++) {
            vector[i] = i;
        }

        for (int i = num1-1; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]");
        }
    }
}