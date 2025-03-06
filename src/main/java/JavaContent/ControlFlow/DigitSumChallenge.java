package JavaContent.ControlFlow;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digit in 1234 is: " + sumDigits(1234));
        System.out.println("The sum of digit in -125 is: " + sumDigits(-125));
        System.out.println("The sum of digit in 4 is: " + sumDigits(4));
        System.out.println("The sum of digit in 32123 is: " + sumDigits(32123));


    }

    public static int sumDigits(int number){
        if(number < 0){
           return -1;
        }
        int sumOfDigits = 0;
        while (number > 9){
            sumOfDigits += number % 10;
            number = number /10;
        }
        sumOfDigits +=1;
        return sumOfDigits;
    }
}
