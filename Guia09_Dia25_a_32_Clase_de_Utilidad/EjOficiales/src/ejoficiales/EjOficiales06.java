package ejoficiales;

import ejoficiales.Entidades.Curso06;

public class EjOficiales06 {

    public static void main(String[] args) {
        Curso06 c = new Curso06();
        c.crearCurso();
        System.out.println("El total de ganacia semanal es: " + c.calcularGananciaSemanal(c));
    }

}
