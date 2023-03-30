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
public class EjExtras6 {

    /* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont1 = 0, cont2 = 0;
        double proMen = 0, promGel = 0, altura;
        System.out.println("Ingrese la cantidad de personas a medir");
        int cantPer = sc.nextInt(); // Lee la cantidad de personas
        for (int i = 0; i < cantPer; i++) { // Se intera hasta la cantidad de personas que se ingresaron anteriormente
            System.out.print("Ingrese la altura ");
            altura = sc.nextDouble();
            if (altura <= 1.60) {
                cont1++;
                proMen += altura;
            } else {
                cont2++;
                promGel += altura;
            }
        }
        System.out.println("El promedio general es: " + promGel / cont2 + " y la cantidad de personas que son mayor a 1.60 son: " + cont2);
        System.out.println("El promedio menor es: " + proMen / cont1 + " y la cantidad de personas que son mayor a 1.60 son: " + cont1);
    }

}
