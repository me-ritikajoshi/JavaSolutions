package JavaConcepts;

public class LargestOfThree {
    //Write a program that checks if three numbers are all equal, and if not, identifies which number is the largest.
    public static void main(String[] args) {
        int a=5,b=3,c=8;
        if(a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        } else if (c>a &&c>b) {
            System.out.println(c);
        }else {
            System.out.println("All are equal");
        }

    }

}
