package ejoficiales03;

import java.util.Scanner;

public class EjOficiales03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        String num1Str = sc.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String num2Str = sc.nextLine();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int resultado = num1 / num2;

        System.out.println("El resultado de la división es: " + resultado);
    }
}