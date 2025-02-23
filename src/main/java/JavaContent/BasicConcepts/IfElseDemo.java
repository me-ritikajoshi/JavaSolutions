package JavaContent.BasicConcepts;

public class IfElseDemo {
    public static void main(String[] args) {
        int amtOfMoneyInAccount = 100;
        int itemPrice = 200;

        if(amtOfMoneyInAccount < itemPrice){
            System.out.println("Not enough balance");
        }else{
            System.out.println("Item purchased");
        }
    }
}
