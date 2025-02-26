package org.example;

import JavaContent.Inheritance.Animal;
import JavaContent.Inheritance.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "huge",400);
        doAnimalStuff(animal, "slow");

        Dog dog= new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog();
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador retriever", 65, "floppy", "swimmer");
        doAnimalStuff(retriever, "slow");


    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
