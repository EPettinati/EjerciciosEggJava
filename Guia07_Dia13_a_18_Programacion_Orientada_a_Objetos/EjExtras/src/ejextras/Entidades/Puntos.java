package ejextras.Entidades;

import java.util.Scanner;

public class Puntos {
    // Variables para almacenar las coordenadas de los puntos
    private double x1, y1, x2, y2;
    
    // Método para solicitar las coordenadas de los puntos al usuario
    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca x1: ");
        x1 = sc.nextDouble();
        System.out.print("Introduzca y1: ");
        y1 = sc.nextDouble();
        System.out.print("Introduzca x2: ");
        x2 = sc.nextDouble();
        System.out.print("Introduzca y2: ");
        y2 = sc.nextDouble();
    }
    
    // Método para calcular la distancia entre los dos puntos
    public double calcDistancia() {
        // Se utiliza la fórmula de distancia entre dos puntos en un plano cartesiano: √((x2-x1)²+(y2-y1)²)
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
        return distancia;
    }
}