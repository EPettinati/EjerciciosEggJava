package ejextras.Entidades;

import java.util.Scanner;
import java.util.Random;

public class Java01 {

    // Creamos dos atributos, un array de strings y una variable para el número de intentos
    private String[] mes = new String[12];
    private int intentos;

// Constructor por defecto
    public Java01() {
    }

// Constructor con un parámetro para el número de intentos
    public Java01(int intentos) {
        this.intentos = intentos;
    }

// Métodos getter y setter para los atributos
    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

// Método para seleccionar un mes al azar del array y devolverlo como un string
    public String Meses() {
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        Random r = new Random();
        int mesSecreto = r.nextInt(mes.length);
        String mesAleatorio = mes[mesSecreto];
        return mesAleatorio;
    }

// Método para que el usuario adivine el mes seleccionado al azar
    public void Adivinar(String mA) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a jugar un juego, tenes que adivinar en que mes estoy pesando...");
        String rep = sc.nextLine();
        int cont = 1;
        // Bucle que se ejecuta mientras la respuesta del usuario no sea igual al mes seleccionado
        while (!rep.equals(mA)) {
            System.out.println("Vamos intentalo otra vez!.. Te quedan " + (12 - cont) + " meses.");
            rep = sc.nextLine();
            cont++;
        }
        // Mensaje de felicitaciones cuando el usuario adivina el mes
        System.out.println("Felicidades ganaste en: " + cont + " intentos.");
    }

}
