package ejoficiales.Servicios;

import ejoficiales.Entidades.PeliculaEntidad04;
import ejoficiales.Entidades.PeliculaEntidad04.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PeliculaServicio04 {

    PeliculaEntidad04 p = new PeliculaEntidad04();
    List<PeliculaEntidad04> listaPeliculas = new ArrayList();
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public PeliculaEntidad04 CrearPelicula() {
        System.out.print("Ingrese el Titulo de la Pelicula: ");
        p.setTitulo(sc.nextLine());

        System.out.print("Ingrese al Director de la Pelicula: ");
        p.setDirector(sc.nextLine());

        p.setMinutos(r.nextInt(181));

        PeliculaEntidad04 pelicula = new PeliculaEntidad04(p.getTitulo(), p.getDirector(), p.getMinutos());
        listaPeliculas.add(pelicula);
        return pelicula;
    }

    public void MostrarPeliculas() {
        System.out.println("\nLas peliculas agregadas son: ");
        for (PeliculaEntidad04 peli : listaPeliculas) {
            System.out.println(peli.toString());
        }
    }

    public void MostrarPeliculasDur() {
        System.out.println("\nLas peliculas mayores a 1 Horas son: ");
        for (PeliculaEntidad04 peli : listaPeliculas) {
            if (peli.calcularHoras() >= 1.0) {
                System.out.println(peli.toString());
            }
        }
    }

    // Ordena las películas por duración en orden ascendente o descendente
    public void OrdenarPeliculasPorDuracion(boolean ordenAscendente) {
        System.out.println("\nLas peliculas ordenadas son: ");
        Collections.sort(listaPeliculas, new Duracion(ordenAscendente));
        for (PeliculaEntidad04 peli : listaPeliculas) {
            System.out.println(peli.toString());
        }
    }

    // Ordena las películas por título y director en orden alfabético ascendente o descendente
    public void OrdenarPeliculasPorTituloDirector(boolean ordenAscendente) {
        Collections.sort(listaPeliculas, new TituloDirectorComparator(ordenAscendente));
        for (PeliculaEntidad04 peli : listaPeliculas) {
            System.out.println(peli.toString());
        }
    }
}