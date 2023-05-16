package ejoficiales;

import ejoficiales.Servicios.PeliculaServicio04;
import java.util.Scanner;

public class EjOficiales04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeliculaServicio04 p = new PeliculaServicio04();
        String rep;

        do {
            p.CrearPelicula();

            System.out.println("¿Quieres seguir agregando alumnos? S/N");
            rep = sc.nextLine();
        } while (rep.equalsIgnoreCase("s"));

        p.MostrarPeliculas();
        p.MostrarPeliculasDur();
        p.OrdenarPeliculasPorDuracion(true);  // Orden ascendente (menor a mayor)
        p.OrdenarPeliculasPorDuracion(false); // Orden descendente (mayor a menor)
        System.out.println("Las peliculas ordenadas por titulo son: ");
        p.OrdenarPeliculasPorTituloDirector(true); // Alfabeticamente los Titulos
        System.out.println("Las peliculas ordenadas por director son: ");
        p.OrdenarPeliculasPorTituloDirector(false);// Alfabeticamente los Directores

    }
}
