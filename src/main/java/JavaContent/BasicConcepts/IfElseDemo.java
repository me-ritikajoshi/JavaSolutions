package JavaContent.BasicConcepts;

public class IfElseDemo {
    public static void main(String[] args) {
//        int amtOfMoneyInAccount = 100;
//        int itemPrice = 200;
//
//        if(amtOfMoneyInAccount < itemPrice){
//            System.out.println("Not enough balance");
//        }else{
//            System.out.println("Item purchased");
//        }

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }else {
            System.out.println("It is an alien !");
        }

        int topScore = 100;
        if (topScore != 100){
            System.out.println("You've got the highest score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore <= 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <=90)){
            System.out.println("Either or both conditions are true");
        }


        int newValue =50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not suppose to happen");
        }

    }
}
