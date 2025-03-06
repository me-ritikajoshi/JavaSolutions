package JavaContent.ControlFlow;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int num = 5;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            }
            num++;
        }

    }
    public static boolean isEvenNumber( int num){
        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
