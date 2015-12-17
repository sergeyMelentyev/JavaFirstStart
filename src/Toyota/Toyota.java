/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toyota;

public class Toyota {
    
    private String name;
    private double volume;
    
    public Toyota(){
    }
    
    public Toyota(String name, double volume){
        this.name = name;
        this.volume = volume;
    }
    
    public void canDrive(){
        System.out.println("Call from Toyota constructor");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
}
