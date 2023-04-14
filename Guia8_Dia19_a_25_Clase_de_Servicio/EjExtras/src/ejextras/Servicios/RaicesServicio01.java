package ejextras.Servicios;

import ejextras.Entidades.Raices01;
import java.util.Scanner;

public class RaicesServicio01 {
    // Raiz doble ingresar a=1 - b=-5 - c=6 - Resultado = 2 y 3
    // Raiz simple ingresar a=1 - b=-4 - c=4 - Resultado = 2
    // Definimos tres variables tipo double

    double a, b, c;

// Definimos el método crearObjeto, que devuelve un objeto de la clase Raices01
    public Raices01 crearObjeto() {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los valores de a, b y c
        System.out.println("Ingrese el valor de A");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor de B");
        b = sc.nextDouble();
        System.out.println("Ingrese el valor de C");
        c = sc.nextDouble();

        // Creamos un objeto Raices01 con los valores ingresados y lo devolvemos
        Raices01 r = new Raices01(a, b, c);
        return r;
    }

// Definimos el método getDiscriminante, que calcula el discriminante de la ecuación
    public double getDiscriminante(Raices01 r) {
        return Math.pow(b, 2) - 4 * a * c;
    }

// Definimos el método tieneRaices, que verifica si la ecuación tiene raíces reales
    public boolean tieneRaices(Raices01 r) {
        return getDiscriminante(r) >= 0;
    }

// Definimos el método tieneRaiz, que verifica si la ecuación tiene una única raíz real
    public boolean tieneRaiz(Raices01 r) {
        return getDiscriminante(r) == 0;
    }

// Definimos el método obtenerRaices, que calcula y muestra las dos raíces de la ecuación
    public void obtenerRaices(Raices01 r) {
        if (tieneRaices(r)) {
            double raiz1 = (-b + Math.sqrt(getDiscriminante(r))) / (2 * a);
            double raiz2 = (-b - Math.sqrt(getDiscriminante(r))) / (2 * a);
            System.out.println("Las raíces de la ecuación son: " + raiz1 + " y " + raiz2);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }

// Definimos el método obtenerRaiz, que calcula y muestra la única raíz de la ecuación
    public void obtenerRaiz(Raices01 r) {
        if (tieneRaiz(r)) {
            double raiz = -b / (2 * a);
            System.out.println("La única raíz de la ecuación es: " + raiz);
        } else {
            System.out.println("La ecuación no tiene una única solución real.");
        }
    }

// Definimos el método calcular, que determina qué tipo de solución tiene la ecuación y la muestra
    public void calcular(Raices01 r) {
        if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else if (tieneRaices(r)) {
            obtenerRaices(r);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }

}
