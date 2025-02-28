package JavaContent.KeywordsAndExpressions;

public class IfElseCodingExercise {
    public static void main(String[] args) {
        System.out.println(checkNumber(0));
    }
    public static String checkNumber(int number){
        if (number > 0){
            return "positive";
        } else if (number < 0) {
            return "negative";
        }else {
            return "zero";
        }
    }

    public static long toMilesPerHour(long kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else {

        }

        return 1;
    }

}
