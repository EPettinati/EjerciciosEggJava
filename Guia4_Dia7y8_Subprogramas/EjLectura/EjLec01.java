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
public class EjLec01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese una secuencia de caracteres: ");
    String secuencia = sc.nextLine(); // Lee la secuencia de Caracteres
    String codificado = codificar(secuencia); // Llama al Subprograma/función
    System.out.println("Secuencia codificada: " + codificado); // Retorna el valor de la nueva frase
  }

  public static String codificar(String secuencia) {
    String codificado = "";
    for (int i = 0; i < secuencia.length(); i++) { // Realiza un ciclo para, hasta la cantidad de letras que tiene la frase.
      char c = secuencia.toLowerCase().charAt(i); // Recorre las letras, verificando si se encuentra dentro del Switch, si es así la codifica. toLowercase() Sirve para que lea minuscula siempre
      switch(c) {
        case 'a':
          codificado += "@";
          break;
        case 'e':
          codificado += "#";
          break;
        case 'i':
          codificado += "$";
          break;
        case 'o':
          codificado += "%";
          break;
        case 'u':
          codificado += "*";
          break;
        default:
          codificado += c;
          break;
      }
    }
    return codificado;
  }
}
