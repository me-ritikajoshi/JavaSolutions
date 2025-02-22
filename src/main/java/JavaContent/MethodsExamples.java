package JavaContent;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsExamples {
    public static void main(String[] args) {
        int[] num={5,2,10,6,9,3,7,8,1};
        System.out.println(maxArr(num));

        Scanner sc = new Scanner(System.in);
//        System.out.print("Please, enter height of rectangle: ");
//        int height = sc.nextInt();
//        System.out.print("Please, enter width of rectangle: ");
//        int width = sc.nextInt();
//
//        drawRectangle(height, width);

//        System.out.print("Please, enter any text: ");
//        String amountOfWords = sc.nextLine();
//        System.out.println(getWordsAmount(amountOfWords));

//        System.out.println("Enter words seperated by comma: ");
//        String userInput= sc.nextLine();
//
//        System.out.println("Enter word length to filter: ");
//        int minLength= sc.nextInt();
//
//        String[] words=userInput.split("\\s+");
//        String[] filteredWords=filterWordsByLength(minLength,words);
//        System.out.println(Arrays.toString(filteredWords));

        int number=128;
        System.out.println(sumDigitsInNUmber(number));

    }

    public static int maxArr(int num[]){
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }
    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(j==0 || j==width-1 || i==0 || i==height-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static int getWordsAmount(String text) {
        text.trim().split("/s");
        return text.length();
    }

    public static String[] filterWordsByLength(int minLength, String[] words){
        String[] filteredWord= new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() >= minLength){
                filteredWord[i] = words[i];
            }

        }
        return filteredWord;
    }

    public static int sumDigitsInNUmber(int number){
        int sum = 0;
        while(number != 0 ){
            sum += number%10;
            number /=10;
        }
        return sum;
    }
}
