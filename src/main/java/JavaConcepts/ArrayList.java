package JavaConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayList {
    public static void main(String[] args) {

//        ) find the largest or smallest number in an ArrayList
//2) calculate the sum of all elements in an ArrayList
//3) find the average of all elements in an ArrayList
//4) find how many times an element is repeated in an ArrayList
//5) remove duplicate elements from an ArrayList
//6) merge two ArrayLists

        java.util.ArrayList<Integer> arrList=new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,8,8));
        int  num=8,count=0;
        java.util.ArrayList<Integer> arrList1=new java.util.ArrayList<>();
        java.util.ArrayList<Integer> arrList2=new java.util.ArrayList<>(Arrays.asList(10,11,15));
        int largest=arrList.get(0);
        int smallest=arrList.get(0);
        int sum=0;
        double average=0;
        int i;
        Set<Integer> set=new HashSet<>();
        set.addAll(arrList);
        System.out.println(set);

        java.util.ArrayList<Integer> arrList3=new java.util.ArrayList<>();
        arrList3.addAll(arrList);
        arrList3.addAll(arrList2);

        System.out.println(arrList3);


        for ( i=0; i<arrList.size(); i++) {
            if (arrList.get(i) > largest) {
                largest=arrList.get(i);
            }
            if(arrList.get(i)<smallest){
                smallest=arrList.get(i);
            }
            if(arrList.get(i)==num){
                count++;
            }
            sum+=arrList.get(i);

            if(!arrList1.contains(arrList.get(i))){
                arrList1.add(arrList.get(i));
            }


        }
        average= (double) sum /arrList.size();

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Repeated Times:" +count);
        System.out.println("No duplicate element:" +arrList1);


    }
}
