package JavaContent.BasicConcepts;

public class OperatorQuestion {
    public static void main(String[] args) {
        double val1 = 20.00;
        double val2= 80.00;
        double result = ((val1 + val2) * 100.00) % 2;
        boolean isResult = (result == 0.00) ? true : false;

        System.out.println(isResult);



    }
}
