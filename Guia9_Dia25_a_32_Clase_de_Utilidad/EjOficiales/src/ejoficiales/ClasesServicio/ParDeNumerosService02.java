package ejoficiales.ClasesServicio; // Declaración del paquete

import ejoficiales.Entidades.ParDeNumeros02; // Importación de la clase ParDeNumeros02 del paquete ejoficiales.Entidades

public class ParDeNumerosService02 { // Declaración de la clase ParDeNumerosService02

    private ParDeNumeros02 n; // Declaración de un objeto de tipo ParDeNumeros02 como atributo privado de la clase

    public ParDeNumerosService02() { // Constructor de la clase que inicializa el objeto n con valores por defecto
        this.n = new ParDeNumeros02();
    }

    public void mostrarValores() { // Método que imprime los valores del objeto n formateados
        System.out.print("El primer numero es: ");
        System.out.printf("%.2f", n.getA());
        System.out.print(" Y el segundo numero es: ");
        System.out.printf("%.2f", n.getB());
    }
    
    public double devolverMayor() { // Método que devuelve el valor más grande del objeto n
        return Math.max(n.getA(), n.getB());
    }
    
    public double calcularPotencia() { // Método que calcula la potencia del número más grande elevado al número más pequeño y devuelve el resultado
        return Math.pow(Math.round(devolverMayor()), Math.round(Math.min(n.getA(), n.getB())));
    }
    
    public double calculaRaiz(){ // Método que calcula la raíz cuadrada del número más pequeño (en valor absoluto) y devuelve el resultado
        return Math.sqrt(Math.abs(Math.min(n.getA(), n.getB())));
    }
}
