package ejextras.Entidades;

public class Empleado {
    // Atributos de la clase Empleado
    private String empleado;
    private int edad;
    private double salario;

    // Constructor con parámetros
    public Empleado(String empleado, int edad, double salario) {
        this.empleado = empleado;
        this.edad = edad;
        this.salario = salario;
    }

    // Constructor por defecto
    public Empleado() {
        empleado = "Agustin";
        edad = 29;
        salario = 1000;
    }

    // Métodos getter y setter para cada atributo
    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método para calcular el aumento del salario en función de la edad
    public int calcularAumento() {
        if (edad >= 30) {
            // Si el empleado tiene 30 o más años, se le aumenta el salario un 10%
            salario += salario * 0.10;
        } else {
            // Si el empleado tiene menos de 30 años, se le aumenta el salario un 5%
            salario += salario * 0.05;
        }
        // Se devuelve el salario como un entero
        return (int) salario;
    }
}