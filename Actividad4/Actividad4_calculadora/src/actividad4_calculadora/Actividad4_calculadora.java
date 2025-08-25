/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad4_calculadora;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author lainz
 */
public class Actividad4_calculadora {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de cálculo");
        int[] nums = new int[2];
        String option = "";
        do {
            System.out.println("Operaciones disponibles:");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("5) Potencia");
            System.out.println("6) Raiz");
            System.out.println("7) Salir");
            
            System.out.println("Ingrese la opcione que desea. Escriba el número de la opcion en letras.");
            
            option = scanner.nextLine();
            
            switch (option) {
                case "uno":
                    nums = getNumbers();
                    System.out.println("El resultado de la suma es: " + (nums[0]+nums[1]));
                    break;
                case "dos":
                    nums = getNumbers();
                    System.out.println("El resultado de la resta: " + (nums[0]-nums[1]));
                    break;
                case "tres":
                    nums = getNumbers();
                    System.out.println("El resultado de la multiplicacion: " + (nums[0]*nums[1]));
                    break;
                case "cuatro":
                    nums = getNumbers();
                    System.out.println("El resultado de la division: " + (nums[0]/nums[1]));
                    break;
                case "cinco":
                    nums = getNumbers();
                    System.out.println("El resultado de " +nums[0]+ " elevado a la "+ nums[1] +" potencia es de : " + (potencia(nums[0],nums[1])));
                    break;
                case "seis":
                    nums = getNumbers();
                    System.out.println("El número " +nums[0]+ " a la raíz "+ nums[1] +" es : " + (Math.pow(nums[0], (1.0/nums[1]))));
                    break;
                case "siete":
                    System.out.println("Saliendo, gracias por usar el programa.");
                    break;
                default:
                    System.out.println("El valor ingresado no es valido, por favor intente de nuevo");
                    break;
            }
            
        } while (!option.equals("siete"));

    }
    
    public static int[] getNumbers(){
        int nums[] = new int[2];
        String numIn;
        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Ingrese el digito No."+(i+1));
                numIn = scanner.nextLine();
                if (checkInt(numIn)) {
                    nums[i] = Integer.parseInt(numIn);
                } else{
                    System.out.println("El numero ingresado no es valido, intente de nuevo.");
                }
            } while (!checkInt(numIn));
        }
        
        
        return nums;
    }
    
    public static int potencia(int num, int potencia){
        if (potencia==0) {
            return 1;
        } else if (potencia>1){
            return num*potencia(num, (potencia-1));
        } else {
            return num;
        }
    }
    
    
   

    public static boolean checkInt(String x) {
        boolean retVal;
        try {
            int checkInt = Integer.parseInt(x);
            retVal = true;
        } catch (Exception e) {
            retVal = false;
        }
        return retVal;
    }

}
