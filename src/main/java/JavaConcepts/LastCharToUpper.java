package JavaConcepts;

public class LastCharToUpper {
    public static void main(String[] args){
        String sentence="my name is ritika";
        String[] words=sentence.split(" ");
        sentence="";
        for(String arr : words){
            String lastWord=arr.substring(arr.length()-1);
            lastWord=lastWord.toUpperCase();
            String remaningWords=arr.substring(0,arr.length()-1);
//            System.out.println(lastWord);
//            System.out.println(remaningWords);

            String camelCase="";
            camelCase=remaningWords+lastWord;
//            System.out.println(camelCase);

            sentence=sentence+camelCase+" ";

        }
        System.out.println(sentence);


    }
}
