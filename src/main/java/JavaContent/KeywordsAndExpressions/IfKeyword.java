package JavaContent.KeywordsAndExpressions;

public class IfKeyword {
    public static void main(String[] args) {
        boolean gameOver=  true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 5000){
//            System.out.println("Your score is 5000");
//        }

//        if (score < 5000){
//            System.out.println("Your score is less than 5000");
//        }else {
//            System.out.println("You got here");
//        }

        if (score < 5000 && score >1000){
            System.out.println("Your score is less than 5000 and greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        }else{
            System.out.println("Got here");
        }
    }
}
