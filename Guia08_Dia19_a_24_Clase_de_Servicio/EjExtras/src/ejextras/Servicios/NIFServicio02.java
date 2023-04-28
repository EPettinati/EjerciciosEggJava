package ejextras.Servicios;

import ejextras.Entidades.NIF02;
import java.util.Scanner;

public class NIFServicio02 {

    public NIF02 crearNif() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su DNI"); // Se muestra un mensaje en la consola para solicitar el DNI al usuario
        long dni = sc.nextLong(); // Se lee el DNI ingresado por el usuario
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Se define un String con las letras correspondientes a los dígitos del DNI
        int resto = (int) (dni % 23); // Se calcula el resto de la división del DNI entre 23
        System.out.println("El numero que sobra es: " + resto); // Se muestra en consola el resto de la división anterior
        char letra = letras.charAt(resto); // Se obtiene la letra correspondiente al resto calculado anteriormente
        System.out.println("La letra es: " + letra); // Se muestra en consola la letra obtenida
        NIF02 nif = new NIF02(dni, letra); // Se crea un objeto de la clase NIF02 con el DNI y la letra correspondiente
        return nif; // Se devuelve el objeto creado
    }

    public void mostrar(NIF02 nif) {
        System.out.println(nif.getDni() + "-" + nif.getLetra()); // Se muestra en consola el número de DNI y la letra correspondiente del objeto NIF pasado como parámetro
    }
}
