/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3_sumadigitos;

import java.util.Scanner;

/**
 *
 * @author lainz
 */
public class Problema3_SumaDigitos {

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
                int suma = suma(n);
                System.out.println("El resultado de la suma de los digitos de " + n + " es " + suma);
                
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
    
    public static int suma(int n){
        if (n==0) {
            return 0;
        }  else {
            return ((n%10) + suma(n/10)) ;
        }
    }
    
    
}
