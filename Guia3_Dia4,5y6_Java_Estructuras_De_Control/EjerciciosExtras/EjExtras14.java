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
public class EjExtras14 {

    /* 
    Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
    Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int numFamilias = sc.nextInt(); // Lee la cantidad de familias
        float media = 0;
        int cant = 0;
        for (int i = 0; i < numFamilias; i++) { // Intera hasta el numero de familias leeido por teclado de la linea 26
            System.out.println("Ingrese la cantidad de hijos de la: " + (i + 1) + "° familia");
            int nunHijos = sc.nextInt(); // Lee la cantidad de hijos que tiene las familias
            for (int j = 0; j < nunHijos; j++) { // Intera hasta la cantidad de hijos leeida por teclado en la linea 31
                System.out.println("Ingrese la Edad del " + (j + 1) + "° hijo");
                int edad = sc.nextInt(); // Lee la edad de cada uno de los hijos
                media += edad; // Suma la media de la edad
                cant++; // Cuenta la cantidad de hijos
            }
        }
        System.out.println("La media es: " + (media / cant)); // Se divide la suma de todas las edads con la cantidad de hijos
    }

}
