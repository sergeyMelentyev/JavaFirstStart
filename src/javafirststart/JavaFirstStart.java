/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafirststart;
import Toyota.Camry;
import Toyota.Rav;

public class JavaFirstStart {

    public static void main(String[] args) {
        Camry camryCar = new Camry("Camry", 1999.5);
        System.out.println(camryCar.getName() + " value " + camryCar.getVolume());
        
        Rav ravCar = new Rav();
        ravCar.setName("Rav4");
        ravCar.setVolume(2499.90);
        System.out.println(ravCar.getName() + " value " + ravCar.getVolume());
    }
    
}