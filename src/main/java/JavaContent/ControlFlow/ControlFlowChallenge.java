package JavaContent.ControlFlow;

public class ControlFlowChallenge {
    public static void main(String[] args) {
        printNumberInWord(90);
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2, 2000));
        System.out.println(sumOdd(1, 100));
        System.out.println(isPalindrome(12321));
        System.out.println(sumFirstAndLastDigit(111));
        System.out.println(getEvenDigitSum(123456789));
    }

    public static void printNumberInWord(int number){
        switch (number){
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("Other");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month >12) || (year < 1 || year > 9999)){
            return -1;
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };

    }

    public static boolean isOdd(int number){
        if (number % 2 != 0){
            return true;
        }else {
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse == originalNumber;
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10){
            number /= 10;
        }

        return lastDigit + number;

    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number < 0 ){
            return -1;
        }
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }

        }
        return sum;
    }

    public static boolean hasShared(int num1, int num2){

        return true;
    }
}
