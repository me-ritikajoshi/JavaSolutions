package JavaContent.KeywordsAndExpressions;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("Inches into cm : " + convertToCentimeters(50));
        System.out.println("Feet and inches into cm : " +convertToCentimeters(5,6));

        System.out.println( getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString( 65, 145));

    }
    public static double convertToCentimeters(int inches){
        return inches *  2.5d;
    }

    public static double convertToCentimeters(int feet , int inches){
//        int feetIntoInches = feet * 12;
//        int totalInches = feetIntoInches + inches;
//        double result = totalInches * 2.5d;
//        convertToCentimeters(totalInches);
//        return result;

        return ((12 * feet ) + inches )*  2.5d;
    }


    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid input for seconds " + seconds ;
        }
        int minutes = seconds / 60;
        return getDurationString(seconds / 60 , seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0){
            return "Invalid input for minutes " + minutes ;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remaningSeconds = seconds % 60;

        return hours + " hrs " +remainingMinutes + " mins " + remaningSeconds +" seconds ";
    }
}
