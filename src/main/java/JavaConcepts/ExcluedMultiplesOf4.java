package JavaConcepts;

public class ExcluedMultiplesOf4 {
    //Write a program to print all numbers from 1 to 20 except for multiples of 4 using the continue statement.
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%4==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
