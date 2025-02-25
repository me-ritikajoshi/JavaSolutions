package JavaContent.ClassAndObjects;

import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(){
        this(789654, 500.3,"Default Name", "Default Address", 987621202 );
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber){
        System.out.println("Account constructor with parameters called");

//        setAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
        this(7854268, 8562.5, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Your new balance is: " +this.balance);

    }
     public void withdrawFunds(double withdrawAmt){
         if (balance - withdrawAmt < 0){
            System.out.println("Insufficient balance!! Cannot withdraw money");
        }else {
             balance-= withdrawAmt;
             System.out.println("Your balance is: " + this.balance);
         }
     }
}
