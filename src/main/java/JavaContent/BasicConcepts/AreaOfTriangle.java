package JavaContent.BasicConcepts;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of a triangle: ");
        float a = sc.nextFloat();

        System.out.println("Enter the second side of a triangle: ");
        float b = sc.nextFloat();

        System.out.println("Enter the third side of a triangle: ");
        float c = sc.nextFloat();

        float p = (a + b + c) / 2;

        float area = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area is : " +area);
    }
}
