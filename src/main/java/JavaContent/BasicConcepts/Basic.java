package JavaContent.BasicConcepts;

public class Basic {
    public static void main(String[] args) {
        int minValueOfInt = Integer.MIN_VALUE;
        System.out.println(minValueOfInt);

        System.out.println("Integer value range: ("+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE +")");


        byte myByte = 20;
        short myShort = 111;
        int myInt = 123456;
        long myLong = 50000L + 10L * (myInt + myShort + myByte);

        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myInt + myShort + myByte));
        System.out.println(shortTotal);
    }
}
