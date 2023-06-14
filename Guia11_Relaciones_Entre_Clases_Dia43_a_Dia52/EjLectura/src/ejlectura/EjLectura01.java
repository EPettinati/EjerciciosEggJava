package ejlectura;

import ejlectura.entidades.EJPersonaDni01;
import ejlectura.entidades.EJPersonaDni01.Dni;
import ejlectura.entidades.EJPersonaDni01.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjLectura01 {

    public static void main(String[] args) {
        List<EJPersonaDni01.Persona> personas = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("--------PERSONA--------");
            EJPersonaDni01.Persona p = new EJPersonaDni01().new Persona();
            System.out.print("Ingrese nombre: ");
            p.setNombre(sc.nextLine());
            System.out.print("Ingrese apellido: ");
            p.setApellido(sc.nextLine());
            System.out.print("Ingrese el carácter del DNI: ");
            char caracter = sc.nextLine().toUpperCase().charAt(0);
            System.out.print("Ingrese el número del DNI: ");
            int numero = sc.nextInt();
            sc.nextLine();

            Dni dni = new EJPersonaDni01().new Dni(caracter, numero);
            p.setDni(dni);

            personas.add(p);
        }

        for (Persona per : personas) {
            System.out.println(per.toString());
        }
    }

}
