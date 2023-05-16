package ejlectura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EjLectura02 {

    public static void main(String[] args) {
        ArrayList<Integer> listado = new ArrayList();
        HashSet<Integer> nombre = new HashSet();
        HashMap<Integer, String> personas = new HashMap();
        
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        
        listado.add(a);
        listado.add(b);
        listado.add(c);
        listado.add(d);
        listado.add(e);
        
        Integer f = 1;
        Integer g = 2;
        Integer h = 3;
        Integer i = 4;
        Integer j = 5;
        
        nombre.add(f);
        nombre.add(g);
        nombre.add(h);
        nombre.add(i);
        nombre.add(j);
        
        String nombre0 = "a";
        String nombre1 = "b";
        String nombre2 = "c";
        String nombre3 = "d";
        String nombre4 = "e";
        
        personas.put(a, nombre0);
        personas.put(b, nombre1);
        personas.put(c, nombre2);
        personas.put(d, nombre3);
        personas.put(e, nombre4);
        
    }

}
