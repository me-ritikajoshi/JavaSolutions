package JavaContent.ControlFlow;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int num = 4;
        int countEven = 0, countOdd = 0;
        while (num <= 20) {
            num++;
            if (! isEvenNumber(num)) {
                countOdd += 1;
                continue;
            }
            countEven += 1;
            if (countEven >= 5){
                break;
            }
            System.out.println(num + " is an even number");
        }
        System.out.println("Even number count: " + countEven);
        System.out.println("Pdd number count: " + countOdd);

    }
    public static boolean isEvenNumber( int num){
        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
