package JavaContent;

public class SwitchStatement {
    public static void main(String[] args) {

        String customerStatus= "premium_customer";

        switch (customerStatus){
            case "guest" :
                System.out.println("thank you for your order");
                break;
            case "regular_customer":
                System.out.println("enjoy 10% off");
                break;
            case "premium_customer":
                System.out.println("enjoy 50% off");
                break;
            default:
                System.out.println("Invalid input");

        }

    }
}
