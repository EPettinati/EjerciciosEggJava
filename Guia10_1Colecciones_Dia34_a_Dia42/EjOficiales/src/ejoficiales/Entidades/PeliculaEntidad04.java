package ejoficiales.Entidades;

import java.text.DecimalFormat;
import java.util.Comparator;

public class PeliculaEntidad04 {

    private String titulo;
    private String director;
    private int minutos;

    public PeliculaEntidad04() {
    }

    public PeliculaEntidad04(String titulo, String director, int minutos) {
        this.titulo = titulo;
        this.director = director;
        this.minutos = minutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("0.00");
        return titulo + ", " + director + ", duración: " + formato.format(calcularHoras()) + " horas.";
    }

    public double calcularHoras() {
        double horas = minutos / 60;
        double sobrante = minutos % 60;
        double res = horas + (sobrante / 100);
        return res;
    }

    // Comparador para ordenar por duración ascendente o descendente
    public static class Duracion implements Comparator<PeliculaEntidad04> {

        private boolean ordenAscendente;

        public Duracion(boolean ordenAscendente) {
            this.ordenAscendente = ordenAscendente;
        }

        @Override
        public int compare(PeliculaEntidad04 pelicula1, PeliculaEntidad04 pelicula2) {
            double duracion1 = pelicula1.calcularHoras();
            double duracion2 = pelicula2.calcularHoras();

            if (duracion1 < duracion2) {
                return ordenAscendente ? -1 : 1; // Si es ascendente devuelve -1, sino devuelve 1
            } else if (duracion1 > duracion2) {
                return ordenAscendente ? 1 : -1; // Si es ascendente devuelve 1, sino devuelve -1
            } else {
                return 0; // Son iguales
            }
        }
    }

    // Comparador para ordenar por título y director en orden alfabético ascendente o descendente
    public static class TituloDirectorComparator implements Comparator<PeliculaEntidad04> {

        private boolean ordenAscendente;

        public TituloDirectorComparator(boolean ordenAscendente) {
            this.ordenAscendente = ordenAscendente;
        }

        @Override
        public int compare(PeliculaEntidad04 pelicula1, PeliculaEntidad04 pelicula2) {
            int resultado = pelicula1.getTitulo().compareToIgnoreCase(pelicula2.getTitulo());
            if (resultado == 0) {
                resultado = pelicula1.getDirector().compareToIgnoreCase(pelicula2.getDirector());
            }
            return ordenAscendente ? resultado : -resultado; // Si es ascendente devuelve el resultado, sino su negación
        }
    }
}