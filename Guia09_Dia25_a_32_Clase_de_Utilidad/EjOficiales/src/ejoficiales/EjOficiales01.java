package ejoficiales;

import ejoficiales.ClasesServicio.CadenaServicio01;
import ejoficiales.Entidades.Cadena01;
import java.util.Scanner;

public class EjOficiales01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        // Crear una instancia de la clase Cadena con la frase ingresada
        Cadena01 cadena = new Cadena01(frase);

        // Crear una instancia de la clase CadenaServicio
        CadenaServicio01 servicio = new CadenaServicio01(cadena);

        // Llamar a los diferentes métodos de la clase CadenaServicio
        servicio.mostrarVocales();
        
        System.out.println("La frase invertida es: " + servicio.invertirFrase(frase));
        
        System.out.print("Elegí la letra que queres saber la cantidad de veces que se repite: ");
        char letra = sc.next().charAt(0);
        System.out.println("La letra: " + letra + " se repite: " + servicio.vecesRepetido(letra) + " vez.");
        
        // Limpiar el buffer del Scanner después de leer el next
        sc.skip(".*\n");
        
        System.out.print("Ingresa una nueva frase para comparar con la anterior: ");
        String frase1 = sc.nextLine();
        servicio.compararLongitud(frase1);    
        
        System.out.println("Ingrese otra frase para concatenarla con tu frase original");
        String frase2 = sc.nextLine();
        System.out.println(servicio.unirFrases(frase2));
        
        System.out.print("Remplazar todas las letras A del texto por: ");
        char letra1 = sc.next().charAt(0);
        System.out.println(servicio.reemplazar(letra1));

        System.out.println("Escribir una letra para devolver boolean");
        char letra2  = sc.next().charAt(0);
        System.out.println("La letra " + letra2 + " es " + servicio.contiene(letra2));
    }

}
