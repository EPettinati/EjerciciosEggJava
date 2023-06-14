package ejoficial01;

import ejoficial01.entidades.Perro;
import ejoficial01.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjOficial01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> listaPersonas = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Persona p = new Persona();
            System.out.println("Ingrese su nombre");
            p.setNombre(sc.nextLine());
            System.out.println("Ingrese su apellido");
            p.setApellido(sc.nextLine());
            System.out.println("Ingrese su edad");
            p.setEdad(sc.nextByte());
            System.out.println("Ingrese su documento");
            p.setDocumento(sc.nextInt());
            sc.nextLine();

            Perro perro = new Perro();
            System.out.println("Introduzca el nombre del perro");
            perro.setNombre(sc.nextLine());
            System.out.println("Introduzca la raza del perro");
            perro.setRaza(sc.nextLine());
            System.out.println("Introduzca la edad del perro");
            perro.setEdad(sc.nextByte());
            System.out.println("Introduzca el tamaño del perro");
            perro.setTamano(sc.nextFloat());
            sc.nextLine();

            p.setPerro(perro);

            listaPersonas.add(p);
        }

        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
