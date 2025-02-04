package org.example;

import JavaConcepts.EmployeeClass;

public class Main {
    public static void main(String[] args) {
        String name;
        String name1;
        int salary;
        int salary1;

        EmployeeClass ec = new EmployeeClass();

        ec.setName("abc");
        ec.setSalary(12345);

        name = ec.getName();
        salary = ec.getSalary();

        System.out.println(name);
        System.out.println(salary);

        EmployeeClass ec1 = new EmployeeClass("mno", 800);

        name1 = ec1.getName();
        salary1 = ec1.getSalary();

        System.out.println(name1);
        System.out.println(salary1);


    }
}