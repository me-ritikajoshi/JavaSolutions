package JavaConcepts;

import java.util.Objects;
import java.util.Arrays;

public class ReverseArray {
    private ReverseArray() {
    }

    // Write a program that reverses the elements of an array in place (without using another array).
    public static void reverseInPlace(int[] arr) {
        Objects.requireNonNull(arr, "arr must not be null");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 1, 9, 0, 7, 2, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseInPlace(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
