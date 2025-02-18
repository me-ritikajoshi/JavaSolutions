package JavaConcepts;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte b = 1;
        short s;
        s = 2;
        int i=3;
        long l=4;

        char c ='a';

        boolean bool = true;

        float f = 1.2f;

        long l2 = 2000000000000l;

        double d = 1.3;
        var v = 1;

        int i3 = s;

        char c2 = 100;
        System.out.println(c2);

        double d2 = i3;
        d2 = l;


        b = (byte)i3;

        long number= 499_999_999_000_000_0001l;
        double converted = (double) number;
        System.out.println(number-(long) converted);

        Integer i4=1;


        int dec = 152;
        int bin = 0b10011000;
        int oct = 0230;
        int hex = 0x98;

        System.out.println(dec);
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);
    }
}
