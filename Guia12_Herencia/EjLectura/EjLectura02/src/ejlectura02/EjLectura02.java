package ejlectura02;

public class EjLectura02 {

    public static void main(String[] args) {
        NewInterface objeto = new NewInterface() {
            @Override
            public void miMetodoAbstracto() {
                System.out.println("Implementación del método abstracto");
            }
        };
        
        objeto.miMetodoAbstracto();
    }
}