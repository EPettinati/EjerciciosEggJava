package ejoficiales02;

public class EjOficiales02 {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                int[] numeros = {1, 2, 3, 4, 5};
                int indice = i;
                int valor = numeros[i]; // Cuando llega a 5 dara ArrayIndexOutOfBoundsException
                System.out.println("Valor obtenido: " + valor);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice de arreglo fuera de rango");
        }
    }
}
