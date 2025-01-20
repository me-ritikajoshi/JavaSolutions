package JavaConcepts;

public class DivisibleBy3And7 {
    //Write a program that finds the first number divisible by both 3 and 7 in the range 1 to 100, using a break statement.
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%7==0){
                System.out.println("Enter a number");
                System.out.println("first Number divisible by 3 and 7 is: "+i);
                break;
            }

        }
    }
}
