package ejlectura;

import java.util.ArrayList;
import java.util.List;

public class EjLectura06 {
    private static List<Libro> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        lista.add(new Libro("1984", "George Orwell"));
        lista.add(new Libro("El gran Gatsby", "F. Scott Fitzgerald"));
        lista.add(new Libro("Matar a un ruiseñor", "Harper Lee"));
        lista.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        
        for (Libro libro : lista) {
            System.out.println(libro.getTitulo());
        }

    }
}

    class Libro {

        private final String titulo;
        private final String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }



