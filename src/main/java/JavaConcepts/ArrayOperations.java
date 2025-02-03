package JavaConcepts;

import java.util.Arrays;

public class ArrayOperations {
    //Write a program that finds the largest element in an integer array.
    //Sum of All Elements in an Array

    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 1, 9, 0, 7, 2, 6};
        int sum = 0;
        Arrays.sort(arr);
        System.out.println("Largest Element is: " + arr[arr.length - 1]);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Summ of all elements is: " + sum);
    }
}
