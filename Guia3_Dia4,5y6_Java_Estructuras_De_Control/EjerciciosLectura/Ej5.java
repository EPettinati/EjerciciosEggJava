/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Epett
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        for (int j = 0; j < 4; j++) {
            num = leer.nextInt();
            System.out.print(num + " ");
            for (int i = 0; i < num;i++ ) {
            System.out.print("*");
        }
            System.out.println("");
        }
    }
}

