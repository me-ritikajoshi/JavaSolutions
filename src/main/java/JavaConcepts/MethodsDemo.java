package JavaConcepts;

public class MethodsDemo {
    public static void main(String[] args) {
        int sum = sum(1,3);
        System.out.println(sum);
        System.out.println(sum(1.2, 2.4));

    }

    private static int sum(int n1 , int n2){
        int result = n1 + n2;
        return result;
    }

    private static double sum(double d1 , double d2){
        return d1 + d2;
    }
}
