package ejextras.Entidades;

public class Rectangulo {
    private double lado1, lado2;

    // Constructor para inicializar los lados del rectángulo
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return lado1 * lado2;
    }
}