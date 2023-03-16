
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
public class Ej2 {
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        frase = leer.nextLine();
        if ("eureka".equals(frase)){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        }
    }
