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

        // Create a new obj from class using constructor with default settings
        BankAccountConstructorWithDefaultsModel bankAccountOne = new BankAccountConstructorWithDefaultsModel();
        System.out.println(bankAccountOne.getCustomerName() + " " + bankAccountOne.getNumber());
        BankAccountConstructorWithDefaultsModel bankAccountTwo = new BankAccountConstructorWithDefaultsModel(407, "Sergey");
        System.out.println(bankAccountTwo.getCustomerName() + " " + bankAccountTwo.getNumber());
        BankAccountConstructorWithDefaultsModel bankAccountThree = new BankAccountConstructorWithDefaultsModel(407028102, 100.00, "Oleg");
        System.out.println(bankAccountThree.getCustomerName() + " " + bankAccountThree.getNumber());

        // comments

    }
}
