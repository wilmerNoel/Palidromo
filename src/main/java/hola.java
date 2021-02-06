
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
        String palabra = "OSO";
        System.err.println("La palabra: "+palabra+" es palindromo? = "+esPalindromo(palabra));
        
    }
    public static boolean esPalindromo(String palabra){
        palabra = palabra.toLowerCase();
        for (int i = 0, j = palabra.length() -1; i <= j; i++,j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
