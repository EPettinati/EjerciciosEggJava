/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7y8;

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class EjLec02 {

    /* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
    validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar los 2 numeros"); // Se ingresan los 2 numeros.
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        esMultiplo(num1, num2); // Se llama al procedimiento, esMultiplo.
    }

    public static void esMultiplo(int num1, int num2) { // Empieza el procedimiento es multiplo..
        if (num1 % num2 == 0) { // Se realiza un mod del primer numero, sobre el segundo, si este da 0 es multiplo, caso contrario no lo es.
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}
