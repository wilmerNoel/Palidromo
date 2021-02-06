
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wilme
 */
public class hola {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        System.out.println("Ingresa un numero");
        limite = leer.nextInt();
        System.err.println("1");
        for (int i = 1; i < limite; i++) {
            int count=0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(i);
            }
        }
    }
}
