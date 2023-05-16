package ejlectura;

import java.util.ArrayList;
import java.util.Iterator;

public class EjLectura05 {

    public static void main(String[] args) {
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        System.out.println(bebidas);
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        System.out.println(bebidas);
    }
}