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
public class EjExtras3 {

    /* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
   Nota: investigar la función equals() de la clase String. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;
        letra = sc.nextLine().toLowerCase();
        if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
