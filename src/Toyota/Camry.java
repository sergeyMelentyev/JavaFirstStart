/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toyota;

public class Camry extends Toyota {
    
    public Camry(String name, double volume){
        super(name, volume);
    }
    
    @Override
    public void canDrive(){
        super.canDrive();
        System.out.println("Call from Camry constructor");
    }
}
