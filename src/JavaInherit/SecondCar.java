/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInherit;

public class SecondCar extends FirstCar{
    
    @Override
    public void drive(){
        super.drive();
        System.out.println("Call from second car constructor");
    }
    
}
