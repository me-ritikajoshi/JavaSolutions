package JavaContent;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Counter: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("Counters i: " +i +" "+ "j: " +j);
        }
    }
}
