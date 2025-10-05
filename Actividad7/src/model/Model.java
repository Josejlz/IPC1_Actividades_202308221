/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lainz
 */
public class Model {
    
    private User user;
    
    public Model() {
        this.user = new User("");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String doOp(int option){
        int res = 0;
        String outcome = null;
        int[] nums =new int[] {this.user.getNum1(), this.user.getNum2()};
        System.out.println("num 1: " + nums[0] + " - num 2: " + nums[1]);
        switch (option) {
            case 1 ->{
                try{
                    res = nums[0] + nums[1];
                } catch(Exception e){
                    outcome = "error";
                }
            } 
            case 2 ->{
                try{
                    res = nums[0] - nums[1];
                } catch(Exception e){
                    outcome = "error";
                }
            } 
            case 3->{
                try{
                    res = nums[0] * nums[1];
                } catch(Exception e){
                    outcome = "error";
                }
            } case 4 ->{
                try{
                    res = nums[0] / nums[1];
                } catch(Exception e){
                    outcome = "error";
                }
            }
        }
        
        if (outcome==null) {
            outcome = Integer.toString(res);
        }
        
        return outcome;
    }
    
    
    
}
