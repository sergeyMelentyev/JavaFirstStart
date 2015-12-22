package javaBasics;

public class MainStarter {
    public static void main(String[] args) {
        CarClassSetGetModel firstCar = new CarClassSetGetModel();
        firstCar.setModel("Lada");
        firstCar.setEngine("V6");
        firstCar.setColor("Blue");
        firstCar.setDoors(5);
        firstCar.setWheels(4);
        System.out.println("My new " +
                firstCar.getModel() + " has " +
                firstCar.getWheels() + " wheels"
        );
    }
}
