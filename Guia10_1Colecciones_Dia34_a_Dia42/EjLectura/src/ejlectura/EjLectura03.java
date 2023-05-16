package ejlectura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EjLectura03 {

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

        Integer f = 6;
        Integer g = 7;
        Integer h = 8;
        Integer i = 9;
        Integer j = 10;

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

        for (int cadena : listado) {
            System.out.println(cadena);
        }
        for (int cadena : nombre) {
            System.out.println(cadena);
        }
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + ". Nombre: " + entry.getValue());
        }

        listado.remove(0);
        nombre.remove(7);
        personas.remove(4);

        for (int cadena : listado) {
            System.out.println(cadena);
        }
        for (int cadena : nombre) {
            System.out.println(cadena);
        }
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + ". Nombre: " + entry.getValue());
        }
    }

}
