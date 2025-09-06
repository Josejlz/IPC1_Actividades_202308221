/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1_factorial;

import java.util.Scanner;

/**
 *
 * @author lainz
 */
public class Problema1_FACTOrial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        boolean valid;
        do {
            String textIn = sc.nextLine();
            valid = stringIsInt(textIn);
            if (valid) {
                int n = Integer.parseInt(textIn);
                int factorial = factos(n);
                System.out.println("El factorial de " + n + " es " + factorial);
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
    
    public static int factos(int n){
        if (n>1) {
            return (factos(n-1))*n;
        } else{
            return 1;
        }
    }

}
