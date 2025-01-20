package JavaConcepts;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArrays {
    //Write a program that finds the common elements between two arrays.
    public static void main(String[] args) {
        int[] arr1={8,4,3,1,9,0,7,2,6};
        int[] arr2={8,4,3,1};
        Set<Integer> commonElements=new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    commonElements.add(arr1[i]);
                }
            }

        }
        System.out.println("Common elements between two arrays are: " + commonElements);
    }

}

