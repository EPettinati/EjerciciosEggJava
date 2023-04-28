package Ejercicios; // Define el paquete en el que se encuentra la clase

import ejoficiales.Entidades.CuentaBancaria01; // Importa la clase CuentaBancaria01 desde el paquete ejoficiales.Entidades
import ejoficiales.Servicios.CuentaBancariaServicio01; // Importa la clase CuentaBancariaServicio01 desde el paquete ejoficiales.Servicios
import java.util.Scanner; // Importa la clase Scanner desde el paquete java.util

public class EjOficiales01Extenso { // Define la clase EjOficiales01

    public static void main(String[] args) { // Define el método principal

        CuentaBancariaServicio01 cs = new CuentaBancariaServicio01(); // Crea un objeto de tipo CuentaBancariaServicio01
        Scanner sc = new Scanner(System.in); // Crea un objeto de tipo Scanner para leer la entrada del usuario

        int op; // Declara una variable entera para almacenar la opción elegida por el usuario
        int contador = 0; // Declara una variable entera para contar la cantidad de cuentas bancarias creadas
        long dni; // Declara una variable entera larga para almacenar el número de DNI del titular de la cuenta

        System.out.println("¿Cuántas cuentas bancarias desea ingresar"); // Imprime un mensaje en la consola
        int cantidad = sc.nextInt(); // Lee un entero desde la entrada del usuario
        CuentaBancaria01[] banco = new CuentaBancaria01[cantidad]; // Crea un arreglo de objetos de tipo CuentaBancaria01 con la cantidad de cuentas bancarias especificadas

        do { // Inicia un bucle do-while que se ejecuta al menos una vez

            System.out.println("Ingrese la opción deseada"); // Imprime un mensaje en la consola
            System.out.println("1. Crear una nueva cuenta bancaria"); // Imprime un mensaje en la consola
            System.out.println("2. Realizar depósito"); // Imprime un mensaje en la consola
            System.out.println("3. Extraer dinero"); // Imprime un mensaje en la consola
            System.out.println("4. Extracción rápida"); // Imprime un mensaje en la consola
            System.out.println("5. Consultar Saldo"); // Imprime un mensaje en la consola
            System.out.println("6. Consultar datos de la cuenta bancaria"); // Imprime un mensaje en la consola
            System.out.println("7. Salir"); // Imprime un mensaje en la consola

            op = sc.nextInt(); // Lee un entero desde la entrada del usuario y lo almacena en la variable op

            switch (op) { //se evalúa la variable "op" para realizar una acción dependiendo del valor que tenga
                case 1: //si "op" tiene el valor de 1, se crea una cuenta bancaria
                    if (contador < banco.length) { //verifica si hay espacio disponible en el arreglo "banco"
                        banco[contador] = cs.crearCuentaBancaria(); //llama al método "crearCuentaBancaria" de la clase "cs" y guarda el objeto creado en la posición "contador" del arreglo "banco"
                        contador++; //incrementa el contador para llevar la cuenta de la cantidad de cuentas bancarias creadas
                    } else {
                        System.out.println("Alcanzó el límite de cuentas permitidas"); //si no hay espacio disponible, muestra un mensaje de error
                    }
                    break; //sale del switch
                case 2: //si "op" tiene el valor de 2, se realiza un depósito en una cuenta bancaria existente
                    System.out.println("Ingrese el dni del titular de la cuenta"); //muestra un mensaje pidiendo el DNI del titular de la cuenta bancaria
                    dni = sc.nextLong(); //lee el DNI ingresado por el usuario
                    for (int i = 0; i < banco.length; i++) { //itera sobre el arreglo "banco"
                        if (cs.consultarDNI(banco[i]) == dni) { //llama al método "consultarDNI" de la clase "cs" para verificar si el DNI ingresado coincide con alguno de los DNIs de las cuentas bancarias existentes
                            System.out.println("¿Cuánto dinero desea depositar?"); //si se encuentra una cuenta bancaria con el DNI ingresado, muestra un mensaje pidiendo el monto a depositar
                            double dinero = sc.nextDouble(); //lee el monto a depositar ingresado por el usuario
                            cs.ingresarDinero(dinero, banco[i]); //llama al método "ingresarDinero" de la clase "cs" para realizar el depósito en la cuenta bancaria correspondiente
                            break; //sale del ciclo for
                        }
                    }
                    break; //sale del switch
                case 3: //si "op" tiene el valor de 3, se realiza un retiro en una cuenta bancaria existente
                    System.out.println("Ingrese el dni del titular de la cuenta"); //muestra un mensaje pidiendo el DNI del titular de la cuenta bancaria
                    dni = sc.nextLong(); //lee el DNI ingresado por el usuario
                    for (int i = 0; i < banco.length; i++) { //itera sobre el arreglo "banco"
                        if (cs.consultarDNI(banco[i]) == dni) { //llama al método "consultarDNI" de la clase "cs" para verificar si el DNI ingresado coincide con alguno de los DNIs de las cuentas bancarias existentes
                            System.out.println("¿Cuánto dinero desea retirar?"); //si se encuentra una cuenta bancaria con el DNI ingresado, muestra un mensaje pidiendo el monto a retirar
                            double dinero = sc.nextDouble(); //lee el monto a retirar ingresado por el usuario
                            cs.retirarDinero(dinero, banco[i]); //llama al método "ingresarDinero" de la clase "cs" para realizar el depósito en la cuenta bancaria correspondiente
                            break; //sale del ciclo for
                        }
                    }
                    break;//sale del switch
                case 4:
                    // Solicita el DNI del titular de la cuenta
                    System.out.println("Ingrese el dni del titular de la cuenta");
                    dni = sc.nextLong();
                    // Recorre el arreglo de cuentas bancarias
                    for (int i = 0; i < banco.length; i++) {
                        // Si el DNI coincide con el de la cuenta actual
                        if (cs.consultarDNI(banco[i]) == dni) {
                            // Pide la cantidad de dinero a retirar
                            System.out.println("¿Cuánto dinero desea retirar?");
                            double dinero = sc.nextDouble();
                            // Realiza la extracción rápida
                            cs.extraccionRapida(dinero, banco[i]);
                            // Rompe el bucle ya que se encontró la cuenta deseada
                            break;
                        }
                    }
                    // Termina el case
                    break;
                case 5:
                    // Solicita el DNI del titular de la cuenta
                    System.out.println("Ingrese el dni del titular de la cuenta");
                    dni = sc.nextLong();
                    // Recorre el arreglo de cuentas bancarias
                    for (CuentaBancaria01 cb : banco) {
                        // Si el DNI coincide con el de la cuenta actual
                        if (cs.consultarDNI(cb) == dni) {
                            // Consulta el saldo de la cuenta
                            cs.consultarSaldo(cb);
                            // Rompe el bucle ya que se encontró la cuenta deseada
                            break;
                        }
                    }
                    // Termina el case
                    break;
                case 6:
                    // Solicita el DNI del titular de la cuenta
                    System.out.println("Ingrese el dni del titular de la cuenta");
                    dni = sc.nextLong();
                    // Recorre el arreglo de cuentas bancarias
                    for (CuentaBancaria01 cb : banco) {
                        // Si el DNI coincide con el de la cuenta actual
                        if (cs.consultarDNI(cb) == dni) {
                            // Consulta los datos de la cuenta
                            cs.consultarDatos(cb);
                            // Rompe el bucle ya que se encontró la cuenta deseada
                            break;
                        }
                    }
                    // Termina el case
                    break;
                case 7:
                    // Muestra mensaje de salida
                    System.out.println("Saliendo...");
                    // Termina el case
                    break;
                default:
                    // Muestra mensaje de error
                    System.out.println("Ingresaste una opcíón incorrecta");
                    // Termina el case
                    break;
            }
// Continúa el bucle mientras la opción ingresada no sea 7
        } while (op != 7);
// Termina el método main
    }
}
