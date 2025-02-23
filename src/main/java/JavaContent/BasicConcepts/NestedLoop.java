package JavaContent.BasicConcepts;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("*");
            for (int j = 0; j <3 ; j++) {
                System.out.println("**");
            }
        }
    }
}
