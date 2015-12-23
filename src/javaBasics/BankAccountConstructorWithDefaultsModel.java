package javaBasics;

public class BankAccountConstructorWithDefaultsModel {
    private int number;
    private double balance;
    private String customerName;

    // Empty constructor
    public BankAccountConstructorWithDefaultsModel(){
        this(40702, 0.00, "No name");
    }

    // Second constructor with defaults parameters
    public BankAccountConstructorWithDefaultsModel(int number, String customerName){
        this(number, 0.00, customerName);
    }

    // Final constructor
    public BankAccountConstructorWithDefaultsModel(int number, double balance, String customerName){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
}
