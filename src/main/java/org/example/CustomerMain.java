package org.example;

import JavaContent.ClassAndObjects.Customer;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer("wert", 850.55, "rtydf@sdfg.fgh");
        System.out.println(c.getName());
        System.out.println(c.getCreditLimit());
        System.out.println(c.getEmail());

        Customer c2 = new Customer();
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c2.getEmail());

        Customer c3 = new Customer("zxc", "qwer@qwer.qwe");
        System.out.println(c3.getName());
        System.out.println(c3.getCreditLimit());
        System.out.println(c3.getEmail());

    }
}
