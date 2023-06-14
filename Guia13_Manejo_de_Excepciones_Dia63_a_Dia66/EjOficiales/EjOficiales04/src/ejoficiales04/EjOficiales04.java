package ejoficiales04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjOficiales04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        
        try {
            System.out.print("Ingrese un numero para dividir: ");
            int numerador  = sc.nextInt();
            System.out.print("Ingrese otro numero para dividir: ");
            String denominadorStr = sc.next();
            int denominador = Integer.parseInt(denominadorStr);
            
            resultado = numerador /  denominador;
        }   catch (InputMismatchException e){
                    System.out.println("Error: Ingrese un valor numerico"); // Para causar este error, introducir en la primer entrada de datos (Numerador) una letra/Cadena.
                    }
            catch (NumberFormatException e){
                    System.out.println("Error: El numero debe de ser de resultado entero"); // Para causar este error, introducir en la segunda entrada de datos (Denominador) una letra/Cadena.
                    }
            catch (ArithmeticException e){
                    System.out.println("Error: No se puede dividir por 0"); // // Para causar este error, introducir en la segunda entrada de datos (Denominador) ingresar 0.
                    }
        
        System.out.println("El resultado es: " + resultado);
    }

}
