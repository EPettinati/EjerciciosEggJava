/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Am02
 */
public class EjOficial03 {

    /* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
    Después haremos otra función o procedimiento que imprima el vector. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[10];
        llenarVector(vector);
        imprimirVector(vector);
    }

    public static void llenarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            int numero = (int) (Math.random() * 10 + 1);
            vector[i] = rand.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
