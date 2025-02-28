package JavaContent.KeywordsAndExpressions;

public class IfElseChallenge {
    public static void main(String[] args) {
        boolean gameOver=  true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 500;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is: " +finalScore);
        }

//        boolean newGameOver=  true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if (newGameOver){
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your new final score is: " +newFinalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " +finalScore);
        }


    }
}
