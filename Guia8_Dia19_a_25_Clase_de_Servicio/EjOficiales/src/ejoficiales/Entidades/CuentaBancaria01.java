package ejoficiales.Entidades;

/* Realizar una clase llamada CuentaBancaria01 en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.
 */
public class CuentaBancaria01 {

// Declaración de los atributos de la clase
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

// Constructor vacío de la clase
    public CuentaBancaria01() {
    }

// Constructor con parámetros de la clase
    public CuentaBancaria01(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

// Getters y Setters para los atributos de la clase
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

// Método para mostrar la información de la cuenta
    @Override
    public String toString() {
        return "Número Cuenta: " + numeroCuenta + ", DNI Cliente: " + dniCliente + ", Saldo Actual: $" + saldoActual;
    }

}
