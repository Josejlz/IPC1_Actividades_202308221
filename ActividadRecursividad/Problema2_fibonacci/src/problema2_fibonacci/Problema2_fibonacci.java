/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2_fibonacci;

import java.util.Scanner;

/**
 *
 * @author lainz
 */
public class Problema2_fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        boolean valid;
        do {
            String textIn = sc.nextLine();
            valid = stringIsInt(textIn);
            if (valid) {
                int n = Integer.parseInt(textIn);
                int fibonacci = fib(n);
                System.out.println("El resultado de la suma de fibonacci repetida " + n + " veces es " + fibonacci);
                
            } else {
                System.out.println("El valor ingresado no es valido, intente de nuevo.");
            }

        } while (!valid);

    }

    public static boolean stringIsInt(String textIn) {
        if (textIn != null) {
            try {
                int n = Integer.parseInt(textIn);                
                return n>=0;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;

    }
    
    /*fib (numero de repeticiones, final, valore anterior, valor anterior al anterior)  */
    public static int fib(int n){
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return (fib(n-1)+fib(n-2));
        }
    }
    

}
