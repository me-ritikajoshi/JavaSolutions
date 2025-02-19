package JavaContent;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        double circumference = Math.PI*r*r;

        System.out.println("Circumference of circle: " +circumference);
    }
}
