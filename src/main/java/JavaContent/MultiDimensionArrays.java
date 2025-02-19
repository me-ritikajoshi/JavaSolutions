package JavaContent;

import java.util.Arrays;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        String[][] arr ={
                {"xyz", "abc", "mno", "qrst"},
                {"qaz", "wsx", "edc", "rfv"}
        };


        System.out.println("My name is " +arr[0][0] +" " +arr[1][0] );

        System.out.println(arr.length);

        //copying arrays

        String[] copyFrom={"dwsed", "sfedfe", "vdsgc", "bvdsh", "vcgdhs"};
        String[] copyTo= Arrays.copyOfRange(copyFrom, 0,2);
        for (String a: copyTo){
            System.out.println(a);
        }





    }
}
