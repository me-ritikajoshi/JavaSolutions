package org.example;

import JavaContent.ClassAndObjects.Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex","qqq");
        Dog fluffy = new Dog("Fluffy","www");
        rex.printName();
        fluffy.printName();
    }
}
