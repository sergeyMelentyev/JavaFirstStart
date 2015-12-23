package javaBasics;
public class BankAccountConstructorModel {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // Create a new constructor
    public BankAccountConstructorModel(
            int number, double balance, String customerName,
            String customerEmailAddress, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // Methods
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Operation complete. You new balanse is " + this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if (this.balance >= withdrawalAmount){
            this.balance -= withdrawalAmount;
        } else {
            System.out.println("Operation is not complete");
        }
    }

    // Setters and Getters
    public int getNumber(){
        return this.number;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmailAddress(){
        return this.customerEmailAddress;
    }
    public String getCustomerPhoneNumber(){
        return this.customerPhoneNumber;
    }

}
