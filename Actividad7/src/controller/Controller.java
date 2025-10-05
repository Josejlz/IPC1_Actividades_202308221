/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Model;
import view.*;
/**
 *
 * @author lainz
 */
public class Controller {
    private Model model;
    private View view;

    public Controller() {
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
    
    public void setWind(){
        this.view.setWinMain(new MainMenu());
        this.view.getWinMain().setController(this);
        this.view.setWinCalc(new NumberInput());
        this.view.getWinCalc().setController(this);
        
    }
    
    public void showWind(int option){
        javax.swing.JFrame[] winds = 
    {
        this.view.getWinMain(), 
        this.view.getWinCalc()
    }; 
    
        for (javax.swing.JFrame wind : winds) {
            wind.setVisible(false);
        }
        
        switch (option) {
            case 1 -> {
                winds[0].setVisible(true);
            }
            case 2 -> {
                winds[1].setVisible(true);
            }
        }
        
    }
    
    public void setUsername(String str){
        this.model.getUser().setName(str);
    }
    
    public String getCurrUser(){
        return this.model.getUser().getName();
    }
    
   public void setNums(int[] nums){
       this.model.getUser().setNum1(nums[0]);
       this.model.getUser().setNum2(nums[1]);
   }
   
   public String doOp(int option){
       return this.model.doOp(option);
   }
    
}
