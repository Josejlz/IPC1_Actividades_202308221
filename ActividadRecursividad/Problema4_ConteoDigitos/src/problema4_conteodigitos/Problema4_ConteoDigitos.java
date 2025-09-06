/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4_conteodigitos;

import java.util.Scanner;

/**
 *
 * @author lainz
 */
public class Problema4_ConteoDigitos {

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
                int suma = conteo(n);
                System.out.println("El número " + n + " tiene " + suma + " digitos.");
                
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
    
    public static int conteo(int n){
        if (n<10) {
            return 1;
        }  else {
            return (1 + conteo(n/10)) ;
        }
    }
    
}
