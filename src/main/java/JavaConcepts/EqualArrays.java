package JavaConcepts;

public class EqualArrays {
    //Write a program to check if two arrays are equal (same length and same elements in the same order).
    public static void main(String[] args) {
        int[] arr1={8,4,3,1,9,0,7,2,6};
        int[] arr2={8,4,3,1,9,0,7,2,6};

        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays are not equal");
                return;
            }
        }
        System.out.println("Arrays are equal");
    }

}

