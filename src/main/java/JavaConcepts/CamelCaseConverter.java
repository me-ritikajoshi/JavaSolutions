package JavaConcepts;

public class CamelCaseConverter {
    public static void main(String[] args){
        String sentence="my name is ritika";
        System.out.println(sentence.replace(" ","_"));
        String[] arrWords=sentence.split(" ");
        sentence = "";
        for(String arr:arrWords){
            String camelcase = "";

            String firstLetter = arr.substring(0, 1);
            String remainingLetter = arr.substring(1);

            firstLetter = firstLetter.toUpperCase();

            camelcase = firstLetter + remainingLetter;

            System.out.println(camelcase);

            sentence = sentence  + camelcase +" ";

        }

        System.out.println(sentence);
    }
}
