package ejlectura;

import java.util.HashMap;
import java.util.Map;

public class EjLectura04 {

    public static void main(String[] args) {
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(0, n1);
        personas.put(1, n2);

        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + ". Nombre: " + entry.getValue());
        }
    }

}
