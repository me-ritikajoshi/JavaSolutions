package JavaContent.KeywordsAndExpressions;

public class MethodChallenge {
    public static void main(String[] args) {

        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("tim", score);

        score = calculateHighScorePosition(1100);
        displayHighScorePosition("timmy", score);

        score = calculateHighScorePosition(500);
        displayHighScorePosition("tom", score);

        score = calculateHighScorePosition(100);
        displayHighScorePosition("tina", score);

        score = calculateHighScorePosition(15);
        displayHighScorePosition("trixy", score);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get position " +playerPosition+ " on the high score list.");
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000 ){
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }else {
            return 4;
        }
    }
}
