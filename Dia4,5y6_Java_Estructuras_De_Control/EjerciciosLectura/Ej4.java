/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Epett
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma;
        suma = 0;
        do {
            num = leer.nextInt();
            if (num > 0){
                suma = num + suma;
            }
            
        } while (num != 0);
        
        System.out.println("Hemos capturado 0 " + "Y la suma total es: " + suma);
        
    }
    
}
