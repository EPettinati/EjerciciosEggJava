package ejoficiales05;

import java.util.Random;
import java.util.Scanner;

public class EjOficiales05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(500) + 1;
        int intentos = 0;
        short intentoFallido = 0;

        int numeroUsuario;

        System.out.println(numeroAleatorio);

        System.out.println("Bienvenido al juego de adivinar el número!");
        System.out.println("La computadora ha generado un número entre 1 y 500. ¡Intenta adivinarlo!");

        do {
            try {

                System.out.print("Introduce un número: ");
                numeroUsuario = sc.nextInt();

                intentos++;

                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número que tienes que adivinar es mayor.");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número que tienes que adivinar es menor.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    break;
                }
                } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                sc.next();
                intentoFallido++;
            }
        } while (true);

        System.out.println("Número de intentos: " + intentos);
        System.out.println("Número de intentos fallidos: " + intentoFallido);
    }
}
