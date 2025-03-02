package JavaContent.KeywordsAndExpressions;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {

    }
    public static double convertToCentimeters(int height){
        return height *  1.1d;
    }

    public static double convertToCentimeters(int feet , int inches){
        return feet *  1.1d;
    }
}
