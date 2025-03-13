package JavaContent.ControlFlow;

import java.util.Scanner;

public class ControlFlowChallenge {
    public static void main(String[] args) {
        printNumberInWord(90);
        System.out.println("Is leap year?" +isLeapYear(2000));
        System.out.println("Days of mth"+ getDaysInMonth(2, 2000));
        System.out.println("Sum of odd"+ sumOdd(1, 100));
        System.out.println("Is palindrome? "+ isPalindrome(12321));
        System.out.println("Sum of first and last digit: "+sumFirstAndLastDigit(111));
        System.out.println("Get even digit sum: " +getEvenDigitSum(123456789));
        System.out.println("Has shared: "+hasShared(33,13));
        System.out.println("Has same last digit: "+ hasSameLastDigit(11,15,111));
        printFactors(6);
        System.out.println("GCD: "+ getGreatestCommonDivisor(12, 30));
        System.out.println("Is perfect number "+isPerfectNumber(5));
        System.out.println(canPack(1,0,4));
        System.out.println("Largest prime: " + getLargestPrime(21));
        System.out.println("Get bucket count: "+getBucketCount(3.4, 2.1, 1.5, 2));
        inputThenPrintSumAndAverage(5);
        numberToWords(50);
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

        int startNum = 10;
        int endNum = 99;
        if (!(num1 >= startNum && num1 <= endNum) && !(num2 >= startNum && num2 <= endNum)){
            return false;
        }

        int firstNumLastDigit = num1 % 10;
        int firstNumFirstDigit = num1 / 10;

        int secondNumLastDigit = num2 % 10;
        int secondNumFirstDigit = num1 / 10;

        return (((firstNumFirstDigit == secondNumFirstDigit) || (firstNumFirstDigit == secondNumLastDigit) )||(firstNumLastDigit == secondNumFirstDigit) || firstNumLastDigit == secondNumLastDigit);

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int startNum = 10;
        int endNum = 1000;
        if (!(num1 >= startNum && num1 <= endNum) && !(num2 >= startNum && num2 <= endNum)){
            return false;
        }

        int firstNumLastDigit = num1 % 10;
        int secondNumLastDigit = num2 % 10;
        int thirdNumLastDigit = num3 % 10;

        return ((firstNumLastDigit == secondNumLastDigit) || (firstNumLastDigit == thirdNumLastDigit) || (secondNumLastDigit == thirdNumLastDigit));
    }

    public static void printFactors(int num){
        if (num < 1){
            System.out.println("Invalid input");
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int num1, int num2){
        if (num1 < 10 || num2 < 10){
            return -1;
        }
        int gcd = 1;
        int min = (num1 < num2) ? num1 : num2;

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0  && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static boolean isPerfectNumber(int num){
        if (num < 1 ){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                sum += i;
            }
        }
        return num == sum;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        boolean result = false;
        int totalBigWeight = bigCount * 5;
        if (totalBigWeight >= goal) {
            int remaining = goal % 5;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }

    public static int getLargestPrime( int num){
        if (num < 2){
            return -1;
        }
        int maxPrime = 1;
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                maxPrime = i;
                num /= i;
            }
        }
        if (num > 2) {
            maxPrime = num;
        }
        return maxPrime;
    }

    public static void inputThenPrintSumAndAverage(int num){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;

        while (true){
            boolean isInt = scanner.hasNextInt();

            if (! isInt){
                break;
            }
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = width * height;
        double remainingArea = area - extraBuckets * areaPerBucket;
        return getBucketCount(remainingArea, areaPerBucket);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }
        double area = width * height;
        return getBucketCount(area, areaPerBucket);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket < 0){
            return -1;
        }
        return (int)area / (int)areaPerBucket;
    }


    public static int reverse(int num){
        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10 + num % 10 ;
            num = num / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int num){
        if (num < 0) {
            return -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= num; i *= 10) {
            count++;
        }
        return count;

    }
    public static void numberToWords(int num){
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverse = reverse(num);

        int leadingZeroes = getDigitCount(num) - getDigitCount(reverse);

        if (num == 0) {
            System.out.println("Zero");
            return;
        }

        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
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
            }
            reverse /= 10;
        }
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }

}
