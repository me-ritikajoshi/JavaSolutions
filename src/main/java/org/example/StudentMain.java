package org.example;

import JavaConcepts.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Abc", "Xyz", 15, 3, 12, "Kathmandu");
        System.out.println(s.getFirstName());
        System.out.println(s.getLastName());
        System.out.println(s.getRollNo());
        System.out.println(s.getGrade());
        System.out.println(s.getAge());
        System.out.println(s.getAddress());
        System.out.println(s.getFullName());
        System.out.println(s.getGradeInfo());
        System.out.printf(s.getAgeInfo());


//        Student s1 = new Student();
//        s1.setFirstName("Hi");
//        s1.setLastName(("Hello"));
//        s1.setRollNo(11);
//        s1.setGrade(10);
//        s1.setAge(18);
//        s1.setAddress("Nepal");
//        System.out.println(s1.getFirstName());
//        System.out.println(s1.getLastName());
//        System.out.println(s1.getRollNo());
//        System.out.println(s1.getGrade());
//        System.out.println(s1.getAge());
//        System.out.println(s1.getAddress());
//        System.out.println(s1.getFullName());
//        System.out.println(s1.getGradeInfo());
//        System.out.printf(s1.getAgeInfo());


    }
}