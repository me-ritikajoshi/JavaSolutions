package JavaContent.BasicConcepts;

public class PrimitiveTypes {

    public static void main(String[] args) {

        byte b =1;
        short s;
        s=2;
        int i = 3;
        long l = 4;
        char c = 'a';
        boolean bool = true;

        float f = 1.2f;

        long l2 = 2_000_000_000_000L;

        double d = 1.3;

        var v = 1;

        int i3 = s;

        char c2=  101;
        System.out.println(c2);

        double d2 = i3;
        d2 = l;

        b = (byte)i3;

        byte b2 = (byte) 128;
        System.out.println(b2);

        long number = 499_999_999_000_000_001L;
        double converted = (double) number;
        System.out.println(converted);
        System.out.println((long) converted);

        Integer i4 = i;
        System.out.println(i4);

    }
}
