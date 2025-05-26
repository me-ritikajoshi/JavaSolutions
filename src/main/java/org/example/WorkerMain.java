package org.example;

import JavaContent.Inheritance.Employee;
import JavaContent.Inheritance.HourlyEmployee;
import JavaContent.Inheritance.SalariedEmployee;

public class WorkerMain {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985",  "10/10/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "01/01/1999", "01/01/2019", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck:" +joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check: "+ joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "02/03/2000", "09/09/2021", 15);
        System.out.println(mary);

        System.out.println("Mary's paycheck: " + mary.collectPay());
        System.out.println("Mary's holiday pay: "+ mary.getDoublePay());
    }
}
