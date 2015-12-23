package javaBasics;

public class MainStarter {
    public static void main(String[] args) {

        // Create a new obj from class using get and set methods
        CarClassSetGetModel firstCar = new CarClassSetGetModel();
        firstCar.setModel("Lada" + "\n" + "\n");
        System.out.println("My new car is " + firstCar.getModel());

        // Create a new obj from class using constructor
        BankAccountConstructorModel bankAccount = new BankAccountConstructorModel(407028101, 100.25, "Sergey", "sergey@mail.com", "+7912922");
        System.out.println("Your balance is " + bankAccount.getBalance());
        bankAccount.deposit(150.00);
        System.out.println("Operation is done, your balance is " + bankAccount.getBalance());
        bankAccount.withdrawal(75.1);
        System.out.println("Operation is done, now " + bankAccount.getBalance() + "\n" + "\n");

        // Comments is here

    }
}
