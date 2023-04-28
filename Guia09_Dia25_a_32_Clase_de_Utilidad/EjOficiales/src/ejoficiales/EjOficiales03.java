package ejoficiales;

import ejoficiales.ClasesServicio.ArregloService03;

public class EjOficiales03 {

    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];
        ArregloService03 c = new ArregloService03();
        
        c.inicializarA(a);
        
        System.out.print("Arreglo desordenado de A: ");
        c.mostrar(a);
        
        c.ordenar(a);
        
        c.inicializarB(a, b);
        
        System.out.print("\nArreglo ordenado de A: ");
        c.mostrar(a);
        
        System.out.print("\nArreglo de B: ");
        c.mostrar(b);
    }
}
