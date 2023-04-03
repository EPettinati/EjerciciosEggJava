package ejextras;

import ejextras.Entidades.Empleado;
import java.util.Scanner;

public class EjExtras05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado c = new Empleado();
        System.out.print(c.getEmpleado() + " tu salario es de: " + c.calcularAumento());
        System.out.println("");
    }

}
