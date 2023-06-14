package ejoficiales08;

public class EjOficiales08 {

    public static void main(String[] args) {
 
/* 
        class Uno {

            private static int metodo() {
                int valor = 0;
                try {
                    valor = valor + 1;
                    valor = valor + Integer.parseInt(”42”);
                    valor = valor + 1;
                    System.out.println(”Valor final del try :” +valor) ;
                } catch (NumberFormatException e) {
                        Valor = valor + Integer.parseInt(
                        ”42”);
                        System.out.println(“Valor final del catch  :” +valor);
                }finally {
                    valor = valor + 1;
                    System.out.println(”Valor final del finally: ” + valor) ;
                }
                    valor = valor + 1;
                    System.out.println(
                    ”Valor antes del return: ” + valor);
                return valor;
                }

            public static void main(String[] args) {
                try {
                    System.out.println(metodo());
                } catch (Exception e) {
                    System.err.println(
                    ”Excepcion en metodo() ”) ;
                    e.printStackTrace();
                }
            }
        }
        
        Valor final del try: 44
        Valor final del finally: 45
        Valor antes del return: 46
        Return: 46

 */

/* 
        class Dos {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt(”W”);
            valor = valor + 1;
            System.out.println(”Valor final del try : ” +valor) ;
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt(
            ”42”);
            System.out.println(”Valor final del catch  : ” +valor) ;
        }finally {
            valor = valor + 1;
            System.out.println(”Valor final del finally: ” + valor);
        }
            valor = valor + 1;
            System.out.println(
            ”Valor antes del return: ” + valor) ;
        return valor;
            }


    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println( ” Excepcion en metodo() ” ) ;
            e.printStackTrace();
        }
    }
}

        Valor final del catch: 43
        Valor final del finally: 44
        Valor antes del return: 45
        Return: 45

*/
 
 /*
        class Tres {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt(”W”);
            valor = valor + 1;
            System.out.println(”Valor final del try : ” +valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt(”W”);
            System.out.println(”Valor final del catch  : ” +valor);
        }finally{
            valor = valor + 1;
            System.out.println(”Valor final del finally:” + valor);}
            valor = valor + 1;
            System.out.println(
            ”Valor antes del return: ” + valor);
        return valor;
            }


    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(
            ”Excepcion en metodo() ” ) ;
            e.printStackTrace();
        }
    }
}

        Valor final del catch: 1
        Valor final del finally: 2
        Valor antes del return: 3
        Return: 3

*/
    }

}


