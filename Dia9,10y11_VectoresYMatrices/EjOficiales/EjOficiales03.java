/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9.pkg10y11;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class EjOficiales03 {
/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Ingrese un numero para el vector");
        int num1 = sc.nextInt();
        
        int[] vector = new int[num1];            
        int[] contador = new int[5];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(99999);
            System.out.println(vector[i]);
            int digitos = String.valueOf(vector[i]).length();
            contador[digitos -1]++;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Existen en el indice " + (i+1) + " " + contador[i] + " de digitos");
        }
    }
}