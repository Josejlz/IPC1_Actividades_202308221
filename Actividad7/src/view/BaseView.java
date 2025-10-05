/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.Controller;
import javax.swing.JOptionPane;
/**
 *
 * @author lainz
 */
public class BaseView extends javax.swing.JFrame {
     Controller controller;

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
     
    protected void showMsg(String str, String user){
        JOptionPane.showMessageDialog(null, str + "\n Realizado por: " + user, "Calculadora - Jose Laynez - 202308221", JOptionPane.INFORMATION_MESSAGE);
    } 
    
    protected void errorMsg(String str){
        JOptionPane.showMessageDialog(null, str, "Error!", JOptionPane.ERROR_MESSAGE);
    }
    
    
    
    
    protected  boolean stringIsEmpty(String str){
        if (str.isBlank()||str.isEmpty()) {
            return true;
        } else{
            return false;
        }
    }
    
    protected boolean stringIsInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    
    
}
