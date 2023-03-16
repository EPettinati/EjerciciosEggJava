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
public class Ej7 {

    /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, 
que no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Correctas = 0, Incorrectas = 0;
        String palabra;
        do {
            System.out.println("Ingrese una palabra");
            palabra = sc.nextLine();
            if ("&&&&&".equals(palabra)) {
                break;
            }
            if (palabra.length() == 5 && palabra.charAt(0) == 'X' && palabra.charAt(4) == 'O') {
                System.out.println("Secuencia correcta");
                Correctas++;
            } else {
                System.out.println("Secuencia incorrecta");
                Incorrectas++;
            }
            
        } while (true);
        System.out.println("Informe:");
        System.out.println("Cadenas correctas: " + Correctas);
        System.out.println("Cadenas incorrectas: " + Incorrectas);
    }
}