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
public class Ej1 {

    /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        int dias = minutos / 1440;
        int horas = (minutos % 1440) / 60;
        System.out.println(minutos + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s).");
    
    }

}
