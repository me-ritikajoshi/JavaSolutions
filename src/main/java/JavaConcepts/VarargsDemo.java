package JavaConcepts;

public class VarargsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(sum(5));

    }
    private static int sum(int n1, int n2){
        return n1 + n2;
    }

    private static int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    private static int sum(int... ints){
        int sum = 0;
        for (int i : ints){
            sum += i;
        }
        return sum;
    }
}
