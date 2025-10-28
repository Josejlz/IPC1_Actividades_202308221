/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad6;

/**
 *
 * @author lainz
 */
public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fun = f(1234);
        System.out.println(fun);
    }
    
    public static int f(int n){
        if (n<10) {
            return 1;
        } else{
            return (2+f(n/10));
        }
    }
    
    
}
