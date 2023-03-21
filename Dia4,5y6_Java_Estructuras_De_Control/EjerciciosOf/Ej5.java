
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Epett
 */
public class Ej5 {
/* Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite numeros al usuario hasta que la suma de los numeros introducidos supere el limite inicial.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma, num, valNum;
        suma = 0;
        valNum = leer.nextInt();
        do {            
            num = leer.nextInt();
            suma += num;
        } while (valNum > suma);
        System.out.println("Superó el limite maximo");
    }
}
