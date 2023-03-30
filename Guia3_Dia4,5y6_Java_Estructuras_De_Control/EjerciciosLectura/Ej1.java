/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class JavaApplication11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 >= 25 && num2 >= 25) {
          System.out.println("Ambos numeros son mayor a 25");
          } else if(num1 >= 25){
            System.out.println(num1 + " es mayor a 25");
            } else if(num2 >= 25){
            System.out.println(num2 + " es mayor a 25");
            } else {                
            System.out.println("Ningun numero es mayor a 25");
            }
        }
      }
    
