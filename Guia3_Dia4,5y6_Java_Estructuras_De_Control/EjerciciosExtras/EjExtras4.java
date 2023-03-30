/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class EjExtras4 {

    /* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingresa un número entre 1 y 10: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);

        String[] unidadesRomanas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        System.out.println("El número " + numero + " en romano es: " + unidadesRomanas[numero]);
    }
} 