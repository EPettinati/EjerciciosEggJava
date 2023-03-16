/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de celsius");
        int c = leer.nextInt();
        int Fahrenheit;
        Fahrenheit = (9*c/5) + 32;
        System.out.println("Los celsius " + c + " en Fahrenheit es: " + Fahrenheit);
    }
    
}
