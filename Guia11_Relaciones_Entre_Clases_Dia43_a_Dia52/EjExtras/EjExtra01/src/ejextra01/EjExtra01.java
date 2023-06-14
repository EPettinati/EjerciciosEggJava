package ejextra01;

import ejextra01.entidades.Perro;
import ejextra01.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjExtra01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> listaPersonas = new ArrayList<>();
        List<Perro> listaPerros = new ArrayList<>();

        System.out.print("Ingrese la Cantidad de Personas a Crear: ");
        byte cantPersonas = sc.nextByte();
        System.out.print("Ingrese la Cantidad de Perros a Crear: ");
        byte cantPerros = sc.nextByte();
        sc.nextLine();

        for (int i = 0; i < cantPerros; i++) {
            System.out.print("Introduzca el nombre del perro: ");
            String Nombre = sc.nextLine();
            System.out.print("Introduzca la raza del perro: ");
            String Raza = sc.nextLine();
            System.out.print("Introduzca la edad del perro: ");
            byte Edad = sc.nextByte();
            System.out.print("Introduzca el tamaño del perro: ");
            float Tamano = sc.nextFloat();
            sc.nextLine();

            Perro perro = new Perro(Nombre, Raza, Edad, Tamano);
            listaPerros.add(perro);
        }

        for (int i = 0; i < cantPersonas; i++) {
            Persona p = new Persona();

            System.out.print("Ingrese su nombre: ");
            String nombrePersona = sc.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellidoPersona = sc.nextLine();
            System.out.print("Ingrese su edad: ");
            byte edadPersona = sc.nextByte();
            System.out.print("Ingrese su documento: ");
            int documentoPersona = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            p.setNombre(nombrePersona);
            p.setApellido(apellidoPersona);
            p.setEdad(edadPersona);
            p.setDocumento(documentoPersona);

            boolean seguirAdoptando = true;
            while (seguirAdoptando) {
                System.out.println("¿Qué perro desea adoptar? (Ingrese el nombre del perro):");
                String nombrePerro = sc.nextLine();

                Perro perroSeleccionado = null;
                for (Perro perro : listaPerros) {
                    if (perro.getNombre().equalsIgnoreCase(nombrePerro)) {
                        perroSeleccionado = perro;
                        break;
                    }
                }

                if (perroSeleccionado != null) {
                    if (perroSeleccionado.getAdoptante() == null) {
                        p.adoptarPerro(perroSeleccionado);
                        perroSeleccionado.setAdoptante(p);
                        System.out.println("¡Enhorabuena! Ha adoptado a " + perroSeleccionado.getNombre());
                    } else {
                        System.out.println("El perro " + nombrePerro + " ya ha sido adoptado. Por favor, elija otro perro.");
                    }
                } else {
                    System.out.println("No se encontró ningún perro con el nombre " + nombrePerro + ". Por favor, elija otro perro.");
                }

                System.out.println("¿Desea adoptar otro perro? (Ingrese 'si' para seguir adoptando, o cualquier otra respuesta para finalizar):");
                String respuesta = sc.nextLine();
                seguirAdoptando = respuesta.equalsIgnoreCase("si");
            }

            listaPersonas.add(p);
        }

        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
