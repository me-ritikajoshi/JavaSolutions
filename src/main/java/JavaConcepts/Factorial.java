package JavaConcepts;

public class Factorial {
    private Factorial() {
    }

    // Write a program that calculates the factorial of a given positive integer.
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("num must be >= 0");
        }
        long fact = 1L;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
}
