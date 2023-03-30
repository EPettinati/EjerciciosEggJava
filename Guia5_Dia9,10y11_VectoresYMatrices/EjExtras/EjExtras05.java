/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Am02
 */
public class EjOficial05 {
/* Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese el tamaño del vector");
        int tamVec = sc.nextInt();
        int[] vector = new int[tamVec];
        for (int i = 0; i < tamVec; i++) {
            for (int j = 0; j < tamVec; j++) {
                vector[i] = rand.nextInt(9);
                System.out.print("[ " + vector[i] + " ]");
            }
            System.out.println("");
        }
    }
}