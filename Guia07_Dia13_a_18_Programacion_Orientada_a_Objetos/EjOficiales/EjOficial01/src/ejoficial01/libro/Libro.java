package ejoficial01.libro;

import java.util.Scanner;

public class Libro {
    // Declaración de atributos de la clase Libro
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor sin argumentos (por defecto)
    public Libro() {
        // Este constructor no hace nada
    }

    // Constructor con argumentos para inicializar los atributos de la clase
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Método para cargar los atributos de un libro a través de la entrada del usuario
    public void cargarLibro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cargar isbn");
        isbn = sc.nextLine();

        System.out.println("Cargar titulo");
        titulo = sc.nextLine();

        System.out.println("Cargar autor");
        autor = sc.nextLine();

        System.out.println("Cargar cantidad de paginas");
        numPaginas = sc.nextInt();
    }

    // Método para mostrar los datos de un libro
    public void mostrardAtos() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de paginas: " + numPaginas);
    }
}