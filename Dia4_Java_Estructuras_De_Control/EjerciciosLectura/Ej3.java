/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class JavaApplication13 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int nota;
         nota = leer.nextInt();
        while (nota<0 || nota>10) {
        System.out.println("Ingrese una opcion correcta");
        nota = leer.nextInt();
        } 
        }
    }