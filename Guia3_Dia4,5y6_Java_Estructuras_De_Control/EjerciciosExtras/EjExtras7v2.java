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
public class EjExtras7v1 {

    /* Realice un programa que calcule y visualice el valor mÃ¡ximo, el valor mÃ­nimo y el promedio de n nÃºmeros (n>0). 
    El valor de n se solicitarÃ¡ al principio del programa y los nÃºmeros serÃ¡n introducidos por el usuario. 
    Realice dos versiones del programa, una usando el bucle â€œwhileâ€� y otra con el bucle â€œdo - whileâ€�. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont = 0, prom = 0, num, may = 0;
        double min = Double.MAX_VALUE;
        System.out.println("Ingrese la cantidad de valores a introducir");
        n = sc.nextInt();
        do  {
            System.out.print("Ingrese el nÃºmero ");
            num = sc.nextInt();
            prom += num;
            if (num < min) {
                min = num;
            } else if (num > may) {
                may = num;
            }
            cont++;
        } while (n != cont);
        System.out.println("El valor maximo es: " + may);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio general es: " + prom / n);
    }
}