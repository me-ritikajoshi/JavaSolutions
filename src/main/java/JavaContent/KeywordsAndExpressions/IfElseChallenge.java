package JavaContent.KeywordsAndExpressions;

public class IfElseChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(hightScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next hightScore is: " +
        calculateScore(gameOver, score, levelCompleted, bonus));


    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver=  true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
