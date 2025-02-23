package org.example;

import JavaContent.ClassAndObjects.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber(1234678);
        ba.setBalance(5000);
        ba.setCustomerName("QWERTY");
        ba.setEmail("qwer@wer.fgh");
        ba.setPhoneNumber(987654321);
        ba.depositFunds(2000);
        ba.withdrawFunds(50000);

    }

}
