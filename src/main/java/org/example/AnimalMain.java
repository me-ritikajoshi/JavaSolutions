package org.example;

import JavaContent.Inheritance.Animal;
import JavaContent.Inheritance.Dog;
import JavaContent.Inheritance.Fish;

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

        Dog wolf = new Dog("Wolf", 40);
         doAnimalStuff(wolf,"slow");

        Fish goldie = new Fish("Goldfish","small", 0.25, 2, 3);
        doAnimalStuff(goldie,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
