package ejoficiales.Servicios;

import ejoficiales.Entidades.CuentaBancaria01;
import java.util.Scanner;

/*
 * a) Método para crear cuenta pidiéndole los datos al usuario. b) Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al
 * saldo actual. c) Método retirar(double): recibe una cantidad de dinero a
 * retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de
 * dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0. d)
 * Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar
 * que el usuario no saque más del 20%. e) Método consultarSaldo: permitirá
 * consultar el saldo disponible en la cuenta. f) Método consultarDatos:
 * permitirá mostrar todos los datos de la cuenta.
 */
public class CuentaBancariaServicio01 {

    // Se importa la clase Scanner para poder utilizarla para ingresar datos desde consola.
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * Método que permite crear una cuenta bancaria.
     *
     * @return retorna la cuenta bancaria creada.
     */
    public CuentaBancaria01 crearCuentaBancaria() {
        // Se instancia un objeto de la clase CuentaBancaria01.
        CuentaBancaria01 cb = new CuentaBancaria01();
        // Se solicita el ingreso del número de cuenta.
        System.out.println("Ingrese el número de cuenta");
        // Se setea el número de cuenta ingresado en la cuenta bancaria creada.
        cb.setNumeroCuenta(sc.nextInt());
        // Se solicita el ingreso del dni del cliente.
        System.out.println("Ingrese el DNI del cliente");
        // Se setea el dni del cliente ingresado en la cuenta bancaria creada.
        cb.setDniCliente(sc.nextLong());
        // Se solicita el ingreso del saldo actual de la cuenta.
        System.out.println("Ingrese el saldo actual de la cuenta");
        // Se setea el saldo actual ingresado en la cuenta bancaria creada.
        cb.setSaldoActual(sc.nextDouble());

        // Se retorna la cuenta bancaria creada.
        return cb;
    }

    /**
     * Método que permite ingresar una cantidad de dinero a la cuenta que se le
     * pase como parámetro.
     *
     * @param dinero la cantidad de dinero a ingresar.
     * @param cb la cuenta bancaria en la que se va a ingresar el dinero.
     */
    public void ingresarDinero(double dinero, CuentaBancaria01 cb) {
        // Se setea el saldo actual de la cuenta como el saldo actual más la cantidad de dinero a ingresar.
        cb.setSaldoActual(cb.getSaldoActual() + dinero);
    }

    /**
     * Método que permite retirar una cantidad de dinero de la cuenta que se le
     * pase como parámetro.
     *
     * @param dinero la cantidad de dinero a retirar.
     * @param cb la cuenta bancaria de la que se va a retirar el dinero.
     */
    public void retirarDinero(double dinero, CuentaBancaria01 cb) {
        if (cb.getSaldoActual() > dinero) {
            cb.setSaldoActual(cb.getSaldoActual() - dinero);
        } else {
            cb.setSaldoActual(0);
        }
    }

    /**
     * Método que permite realizar una extracción rápida de dinero de una cuenta
     * bancaria.
     *
     * @param dinero cantidad de dinero a retirar
     * @param cb objeto CuentaBancaria01 en el que se va a realizar la extracción
     */
    public void extraccionRapida(double dinero, CuentaBancaria01 cb) {
        if (cb.getSaldoActual() * 0.2 >= dinero) {
            cb.setSaldoActual(cb.getSaldoActual() - dinero);
        } else {
            System.out.println("No puede retirar más del 20% de su saldo");
        }
    }
    // Este método muestra el saldo actual de la cuenta proporcionada como argumento

    public void consultarSaldo(CuentaBancaria01 cb) {
        System.out.println("Su saldo es: $" + cb.getSaldoActual());
    }

    // Este método devuelve el DNI del cliente de la cuenta proporcionada como argumento
    public long consultarDNI(CuentaBancaria01 cb) {
        return cb.getDniCliente();
    }

    // Este método muestra los datos de la cuenta proporcionada como argumento
    public void consultarDatos(CuentaBancaria01 cb) {
        System.out.println(cb.toString());
    }
}