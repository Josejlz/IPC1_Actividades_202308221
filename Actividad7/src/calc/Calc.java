/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc;
import controller.*;
import model.*;
import view.*;
/**
 *
 * @author lainz
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Controller controller = new Controller();
        controller.setModel(new Model());
        controller.setView(new View());
        controller.setWind();
        controller.showWind(1);
        
    }
    
}
