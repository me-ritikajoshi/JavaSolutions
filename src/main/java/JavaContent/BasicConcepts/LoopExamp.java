package JavaContent.BasicConcepts;

public class LoopExamp {
    public static void main(String[] args) {
        for (int i = 1; i < 6 ; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}
