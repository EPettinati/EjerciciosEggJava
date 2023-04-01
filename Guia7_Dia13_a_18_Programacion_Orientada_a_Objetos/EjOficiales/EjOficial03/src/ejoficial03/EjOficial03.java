package ejoficial03;

import ejoficial03.Operacion.Operacion;

public class EjOficial03 {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        op.crearOperacion();
        System.out.println("La división es: " + op.div() + " la multiplicación es: " + op.multi() + " la suma es: " + op.suma() + " la resta es: " + op.resta() );
    }

}
