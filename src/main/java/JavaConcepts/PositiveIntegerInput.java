package JavaConcepts;

import java.util.Scanner;

public class PositiveIntegerInput {
    //Write a program that asks the user to enter a positive integer. If the user enters a negative number, ask again until they provide a positive number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a positive number: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Invalid input!! Enter a positive number.");
            }
        } while (num <= 0);

        System.out.println("You entered: " + num);
    }
}