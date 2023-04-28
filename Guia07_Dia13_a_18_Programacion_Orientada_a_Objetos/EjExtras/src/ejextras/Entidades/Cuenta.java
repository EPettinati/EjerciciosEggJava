package ejextras.Entidades;

import java.util.Scanner;

public class Cuenta {
    // Atributos de la clase Cuenta
    private double saldo; // Saldo de la cuenta
    private String titular; // Nombre del titular de la cuenta

    // Constructor de la clase Cuenta
    public Cuenta(double saldo, String titular) {
        this.saldo = saldo; // Asigna el saldo pasado como parámetro al atributo saldo de la cuenta
        this.titular = titular; // Asigna el titular pasado como parámetro al atributo titular de la cuenta
    }

    // Método que permite retirar dinero de la cuenta
    public void retirarDinero(double cantidad) {
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("¿Cuanto dinero deseas retirar?"); // Pide al usuario que ingrese la cantidad a retirar
        cantidad = sc.nextDouble(); // Lee la cantidad ingresada por el usuario y la asigna a la variable cantidad
        if (saldo >= cantidad) { // Si el saldo es mayor o igual que la cantidad a retirar
            saldo -= cantidad; // Resta la cantidad del saldo
            // Imprime un mensaje al usuario con el saldo actualizado y la cantidad retirada
            System.out.println("Hola " + titular + ". Te queda en la cuenta: " + saldo + ". Y retiraste: " + cantidad);
        } else { // Si el saldo es menor que la cantidad a retirar
            System.out.println("Saldo insuficiente"); // Imprime un mensaje de saldo insuficiente
        }
    }

    // Método getter para el atributo saldo
    public double getSaldo() {
        return saldo; // Retorna el saldo de la cuenta
    }

    // Constructor vacío de la clase Cuenta
    public Cuenta() {
    }

    // Método setter para el atributo saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo; // Asigna el valor pasado como parámetro al atributo saldo de la cuenta
    }

    // Método getter para el atributo titular
    public String getTitular() {
        return titular; // Retorna el nombre del titular de la cuenta
    }

    // Método setter para el atributo titular
    public void setTitular(String titular) {
        this.titular = titular; // Asigna el valor pasado como parámetro al atributo titular de la cuenta
    }
}