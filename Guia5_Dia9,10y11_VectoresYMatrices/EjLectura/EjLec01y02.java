/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Am02
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de personas en tu equipo");
        int num1 = sc.nextInt();
        
        sc.nextLine();
        String[] equipo = new String[num1];

        for (int i = 0; i < num1; i++) { // Parte 01
            equipo[i] = sc.nextLine();
        }

        for (int i = 0; i < num1; i++) { // Parte 02
            System.out.println("Las peronas que forman parte del grupo son " + equipo[i]);
        }
    }
}