/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un numero, para mostrar su doble, triple y raiz cuadrada");
        int c = leer.nextInt();
        System.out.println("El doble es: " + c*2 + ", el triple es: " + c*3 + ", la raiz cuadrada es: " + Math.sqrt(c));
    }
    
    
}
