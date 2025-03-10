package JavaContent.ControlFlow;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        System.out.println("Enter five valid numbers: ");
        int num = scanner.nextInt();

        while (num <= 5){
            System.out.println("Enter number #" + count + ": ");
        }


    }
}
