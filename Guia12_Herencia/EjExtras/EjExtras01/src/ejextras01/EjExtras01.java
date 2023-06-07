package ejextras01;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EjExtras01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alquiler> alquileres = new ArrayList<>();
                
        System.out.print("Ingrese la cantidad de barcos a crear: ");
        byte cant = sc.nextByte();
        
        for (int i = 0; i < cant; i++) {
            Alquiler alquiler = new Alquiler();

            alquiler.setNombre("Persona" + (i + 1));
            alquiler.setDni((i + 1));
            alquiler.setPosAmarre((byte) (i + 1));
            alquiler.setFechAlquiler(new Date());
            System.out.print("Ingrese el tipo de barco (1: Velero, 2: Barco a Motor, 3: Yate): ");
            int tipoBarco = sc.nextInt();

            Barco barco;
            switch (tipoBarco) {
                case 1:
                    System.out.print("Ingrese la cantidad de mástiles: ");
                    byte numeroMastiles = sc.nextByte();
                    System.out.print("Ingrese la matrícula: ");
                    String matriculaVelero = sc.next();
                    System.out.print("Ingrese la eslora: ");
                    double esloraVelero = sc.nextDouble();
                    System.out.print("Ingrese el año de fabricación: ");
                    short anioFabVelero = sc.nextShort();
                    barco = new Velero(numeroMastiles, matriculaVelero, esloraVelero, anioFabVelero);
                    break;
                case 2:
                    System.out.print("Ingrese la potencia en CV: ");
                    double potenciaMotor = sc.nextDouble();
                    System.out.print("Ingrese la matrícula: ");
                    String matriculaMotor = sc.next();
                    System.out.print("Ingrese la eslora: ");
                    double esloraMotor = sc.nextDouble();
                    System.out.print("Ingrese el año de fabricación: ");
                    short anioFabMotor = sc.nextShort();
                    barco = new BarcoMotor(potenciaMotor, matriculaMotor, esloraMotor, anioFabMotor);
                    break;
                case 3:
                    System.out.print("Ingrese la potencia en CV: ");
                    double potenciaYate = sc.nextDouble();
                    System.out.print("Ingrese la cantidad de camarotes: ");
                    byte camarotes = sc.nextByte();
                    System.out.print("Ingrese la matrícula: ");
                    String matriculaYate = sc.next();
                    System.out.print("Ingrese la eslora: ");
                    double esloraYate = sc.nextDouble();
                    System.out.print("Ingrese el año de fabricación: ");
                    short anioFabYate = sc.nextShort();
                    barco = new Yate(camarotes, potenciaYate, matriculaYate, esloraYate, anioFabYate);
                    break;
                default:
                    System.out.println("Tipo de barco inválido. Se creará un barco genérico.");
                    barco = new Barco("Barco Genérico", 10, (short) 2010);
            }
            
            alquiler.setBarco(barco);
            alquileres.add(alquiler);
        }

// Imprimir el resultado final
        for (Alquiler alquiler : alquileres) {
            System.out.println("Precio de alquiler: " + alquiler.calcularPrecioAlquiler());
            System.out.println(alquiler);
        }
    }
}
