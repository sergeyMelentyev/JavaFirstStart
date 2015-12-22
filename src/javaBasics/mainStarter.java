package javaBasics;

public class MainStarter {
    public static void main(String[] args) {
        CarExampleMain firstCar = new CarExampleMain();
        firstCar.setModel("Lada");
        System.out.println(firstCar.getModel());
    }
}
