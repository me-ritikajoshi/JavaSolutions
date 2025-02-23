package org.example;

import JavaContent.ClassAndObjects.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("make = " +car.getMake());
        System.out.println("model = " +car.getModel());
        System.out.println("color = " +car.getColor());
        System.out.println("doors = " +car.getDoors());
        System.out.println("convertable = " +car.isConvertible());
        car.describeCar();

        Car c2 = new Car();
        c2.setMake("Tesla");
        c2.setModel("Model X");
        c2.setColor("Black");
        c2.setDoors(2);
        c2.setConvertible(false);
        c2.describeCar();
    }

}
