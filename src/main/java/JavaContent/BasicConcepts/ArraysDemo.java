package JavaContent.BasicConcepts;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // two ways to declare an array
        int[] arr;
        int arrs[];

        arr = new int[10];
        System.out.println("Length of arrays is given as: " + arr.length);
        System.out.println("To find element in specific position by: " + arr[1]);

        double[] arr2 = new double[10];
        System.out.println("To find element in specific position by: " + arr2[0]);

        boolean[] arr3 = new boolean[10];
        System.out.println("To find element in specific position by: " + arr3[1]);


        int[] arr4 ={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr4));

        //Multi dimensional array
        int[][] matrix={
                {1,2,3},
                {4,5,6}
        };
        System.out.println(matrix[1][1]);

        //Sort array
        int[] arr5={1,5,2,8,20,3};
        System.out.println("Unsorted Array: " + Arrays.toString(arr5));
        Arrays.sort(arr5);
        System.out.println("Sorted Array: " +Arrays.toString(arr5));


    }
}
