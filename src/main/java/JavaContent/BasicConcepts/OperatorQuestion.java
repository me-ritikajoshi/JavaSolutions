package JavaContent.BasicConcepts;

public class OperatorQuestion {
    public static void main(String[] args) {
        double val1 = 20.00d;
        double val2 = 80.00d;
        double result = ((val1 + val2) * 100.00) % 40.00d;
        boolean isResult = (result == 0.00) ? true : false;

        System.out.println(isResult);
        if (!isResult) {
            System.out.println("Got some remainer");
        }

    }
}