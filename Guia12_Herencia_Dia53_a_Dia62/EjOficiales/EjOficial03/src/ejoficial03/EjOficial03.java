package ejoficial03;

import ejoficial03.Entidades.Electrodomestico;
import ejoficial03.Entidades.Lavadora;
import ejoficial03.Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class EjOficial03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        System.out.print("Ingrese la cantidad de electrodomesticos a crear: ");
        byte cant = sc.nextByte();

        for (int i = 0; i < cant; i++) {
            sc.nextLine();
            System.out.print("Ingrese qué desea crear: Televisor (T) o Lavadora (L): ");
            String letra = sc.nextLine();
            switch (letra.toLowerCase().charAt(0)) {
                case 't':
                    System.out.print("Ingrese la resolución del televisor en pulgadas: ");
                    int resolucion = sc.nextInt();
                    System.out.print("Ingrese el precio del televisor: ");
                    double precio = sc.nextDouble();
                    System.out.print("Ingrese el color del televisor: ");
                    String color = sc.next();
                    System.out.print("Ingrese el consumo energético del televisor (letra entre A y F): ");
                    char consumo = sc.next().toUpperCase().charAt(0);
                    System.out.print("Ingrese el peso del televisor: ");
                    double peso = sc.nextDouble();
                    System.out.print("¿Tiene sintonizador TDT incorporado? (true/false): ");
                    boolean tdt = sc.nextBoolean();

                    Televisor televisor = new Televisor(peso, tdt, precio, color, consumo, resolucion);
                    electrodomesticos.add(televisor);
                    break;

                case 'l':
                    System.out.print("Ingrese la carga de la lavadora: ");
                    int carga = sc.nextInt();
                    System.out.print("Ingrese el precio de la lavadora: ");
                    precio = sc.nextDouble();
                    System.out.print("Ingrese el color de la lavadora: ");
                    color = sc.next();
                    System.out.print("Ingrese el consumo energético de la lavadora (letra entre A y F): ");
                    consumo = sc.next().toUpperCase().charAt(0);
                    System.out.print("Ingrese el peso de la lavadora: ");
                    peso = sc.nextDouble();

                    Lavadora lavadora = new Lavadora(carga, precio, color, consumo, peso);
                    electrodomesticos.add(lavadora);
                    break;

                default:
                    throw new AssertionError("Opción inválida");
            }
        }

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            System.out.println("Precio final del electrodoméstico: " + electrodomestico.precioFinal());
        }

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            precioTotalElectrodomesticos += electrodomestico.precioFinal();

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += electrodomestico.precioFinal();
            }
        }

        System.out.println("Precio total de los electrodomésticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de las lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: " + precioTotalTelevisores);
    }
}
