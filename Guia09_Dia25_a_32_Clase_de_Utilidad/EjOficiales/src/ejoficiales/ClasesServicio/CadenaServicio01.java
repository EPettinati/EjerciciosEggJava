package ejoficiales.ClasesServicio;

import ejoficiales.Entidades.Cadena01;

public class CadenaServicio01 {

    // Declaración de variable privada tipo Cadena01 con nombre "fra".
    private Cadena01 fra;

// Constructor que recibe un objeto Cadena01 como parámetro y lo asigna a la variable fra.
    public CadenaServicio01(Cadena01 fra) {
        this.fra = fra; // Asignación del objeto recibido al atributo fra de la clase.
    }

// Método público que cuenta las vocales presentes en la frase almacenada en la variable fra.
    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < fra.getLongitud(); i++) {
            char c = fra.getFrase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Tiene un total de: " + contador + " vocales."); // Imprime el número de vocales encontradas.
    }

// Método público que invierte la frase almacenada en la variable fra.
    public String invertirFrase(String frase) {
        String nuevaFrase = "";
        for (int i = fra.getLongitud() - 1; i >= 0; i--) {
            nuevaFrase += fra.getFrase().charAt(i);
        }
        return nuevaFrase; // Devuelve la frase invertida.
    }

    // Método público que cuenta cuántas veces se repite una letra en la frase almacenada en la variable fra.
    public int vecesRepetido(char letra) {
        int contador = 0;
        for (int i = 0; i < fra.getLongitud(); i++) {
            char c = fra.getFrase().charAt(i);
            if (letra == c) {
                contador++;
            }
        }
        return contador; // Devuelve la cantidad de veces que se repitió la letra en la frase.
    }

// Método público que compara la longitud de la frase almacenada en la variable fra con otra frase ingresada como parámetro.
    public void compararLongitud(String frase) {
        int res = Integer.compare(fra.getLongitud(), frase.length());
        if (res < 0) {
            System.out.println("La frase ingresada es más larga que la frase original.");
        } else if (res > 0) {
            System.out.println("La frase original es más larga que la frase ingresada.");
        } else {
            System.out.println("Las dos frases tienen la misma longitud.");
        }
    }

// Método público que une la frase almacenada en la variable fra con otra frase ingresada como parámetro, separadas por un espacio.
    public String unirFrases(String frase) {
        return fra.getFrase() + " " + frase; // Devuelve la frase resultante de unir ambas frases.
    }

// Método que reemplaza todas las apariciones de la letra 'a' en la cadena de caracteres con otra letra
    public String reemplazar(char letra) {
        String nuevaFrase = "";
        for (int i = 0; i < fra.getLongitud(); i++) {
            if (fra.getFrase().charAt(i) == 'a') {
                nuevaFrase += letra;
            } else {
                nuevaFrase += fra.getFrase().charAt(i);
            }
        }
        return nuevaFrase;
    }

// Método que verifica si una letra está presente en la cadena de caracteres
    public boolean contiene(char letra) {
        boolean res = false;
        for (int i = 0; i < fra.getLongitud(); i++) {
            if (fra.getFrase().charAt(i) == letra) {
                res = true;
            }
        }
        return res;
    }
}
