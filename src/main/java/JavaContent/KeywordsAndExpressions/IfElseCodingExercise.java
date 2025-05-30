package JavaContent.KeywordsAndExpressions;

public class IfElseCodingExercise {
    public static void main(String[] args) {
        System.out.println(checkNumber(0));
        printConversion(80);
        printMegaBytesAndKiloBytes(2000);
        System.out.println("Should wake up? " + shouldWakeUp(true, 10));
        System.out.println("Is leap year? " + isLeapYear(2000));
        System.out.println("Is 3 decimal place equal?" + areEqualByThreeDecimalPlace(5.123, 5.1234));
        System.out.println("Has equal sum? " + hasEqualSum(1, -1, 0));
        System.out.println("Has teen? " + hasTeen(5, 15, 99));
        System.out.println("Area: " + area(5));
        System.out.println("Area: " + area(5, 8));
        printYearsAndDays(1000000);
        printEqual(8,8,8);
        System.out.println("Is cat playing? " +isCatPlaying(true, 10));
    }

    public static String checkNumber(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h= " + milesPerHour + " mi/h");
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        int mb = kiloBytes / 1024;
        int kb = kiloBytes % 1024;
        System.out.println(kiloBytes + "KB= " + mb + "MB and " + kb + "KB");
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return isBarking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year <= 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlace(double num1, double num2) {
        long n1 = (long) num1 * 1000;
        long n2 = (long) num2 * 1000;
        return n1 == n2;
    }

    public static boolean hasEqualSum(int n1, int n2, int n3) {
        int sumOfTwo = n1 + n2;
        return sumOfTwo == n3;
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid input");
            return;
        }
        long year = minutes / (60 * 24 * 365);
        long days = (minutes / (60 * 24)) % 365;
        System.out.println(minutes + " minutes= " + year + " year " + days + " days ");
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All values are equal");
        } else if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Neither all are equal or different");
        }else {
            System.out.println("All are different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
       if (summer && (temperature >=25 && temperature <=45)){
           return true;
        } else return !summer && (temperature >= 25 && temperature <= 35);
    }
}


