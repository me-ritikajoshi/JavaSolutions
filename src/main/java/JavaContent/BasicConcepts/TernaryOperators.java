package JavaContent.BasicConcepts;

public class TernaryOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int max;
        max= (num1 > num2) ? num1 : num2 ;
        System.out.println(max);

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false ;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s =(isDomestic) ? "this car is domestic" : "this car is not domestic";
        System.out.println(s);

    }
}
