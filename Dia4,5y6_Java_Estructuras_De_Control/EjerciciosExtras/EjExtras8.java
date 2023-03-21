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
public class EjExtras8 {

    /* Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        do {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            if (num < 0) {
                continue;
            }
            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            if (num % 5 == 0) {
                break;
            }

        } while (true);
        System.out.println("La cantidad de numeros Pares es: " + contPar);
        System.out.println("La cantidad de numeros Impares es: " + contImpar);
    }
}