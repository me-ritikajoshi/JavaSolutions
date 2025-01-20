package JavaConcepts;

public class StringMethodsDemo {
    public static void main(String[] args){
        String str1="Hello";
        String str2="Hello    ";
        char[] ch1={'h','i','i'};
        String  str3="";
        String sentence="Hello I am Ritika";

        String[] arr=sentence.split(" ");
        for (String a: arr){
            System.out.println(a);
        }
//        System.out.println(Arrays.toString(sentence.split("")));

        System.out.println(str2.trim());

        char[] ch2=str1.toCharArray();
        System.out.println(ch2[0]);
        char result=str1.charAt(4);
        System.out.println(result);

        System.out.println(str1.codePointAt(0));
        System.out.println(str1.codePointBefore(1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.contentEquals("Hello"));
        System.out.println(str3.copyValueOf(ch1,0,3));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.equals(str2));



    }
}
