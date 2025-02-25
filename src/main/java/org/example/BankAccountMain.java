package org.example;

import JavaContent.ClassAndObjects.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
//        BankAccount ba = new BankAccount(12345,1000,"wert","dfg@df.g",84974568);
//        ba.setAccountNumber(1234678);
//        ba.setBalance(5000);
//        ba.setCustomerName("QWERTY");
//        ba.setEmail("qwer@wer.fgh");
//        ba.setPhoneNumber(987654321);
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());
        ba.depositFunds(2000);
        ba.withdrawFunds(50000);

        BankAccount nba = new BankAccount("qwerty", "qwes@fg.n", 86454);
    }

}
