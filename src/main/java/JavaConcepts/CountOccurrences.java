package JavaConcepts;

public class CountOccurrences {
    //Write a program that counts the number of occurrences of a specific element in an array.
    public static void main(String[] args) {
        int[] arr = {8, 1, 3, 1, 9, 0, 7, 2, 1};
        int num = 1, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("The number " + num + " occurs " + count + " times");
    }
}
