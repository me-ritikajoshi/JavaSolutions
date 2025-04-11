package org.example;

import JavaContent.ClassAndObjects.Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");
        rex.printName();
        fluffy.printName();
    }
}
