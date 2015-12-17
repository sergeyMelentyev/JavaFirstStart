/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafirststart;
import externalClass.Car;
import externalClass.Phone;
import JavaInherit.SecondCar;

/**
 *
 * @author olgarezchikova
 */
public class JavaFirstStart {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Vaz");
        System.out.println(car.getName());
        
        Phone phoneOne = new Phone(1024, "Samsung", "GSM");
        System.out.println(phoneOne.getName());
        phoneOne.setName("iPhone");
        System.out.println(phoneOne.getName());
        
        SecondCar secondcar = new SecondCar();
        secondcar.drive();
    }
    
}