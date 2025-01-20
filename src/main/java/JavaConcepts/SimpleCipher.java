package JavaConcepts;

public class SimpleCipher {
    public static void main(String[] args){

        String word="Hello";
        char[] letters=word.toCharArray();
        word="";
//        System.out.println(letters);
        for(char arr:letters){
            String combine="";
            arr+=5;
            combine=combine+arr;
            word=word+combine;
        }
        System.out.println(word);

    }
}
