package JavaContent.ControlFlow;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2025;
//        String usersDateOfBirth = "1991";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age: " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user says he is " +usersAgeWithPartialYear);

        try{
            System.out.println(getInputFromConsole(currentYear));

        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " +name +" , Thanks for asking");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

//        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " +name +" , Thanks for asking");

//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born?");

        boolean validDob = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " +(currentYear));
//            String dateOfBirth = scanner.nextLine();
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDob = age < 0 ? false : true;
            } catch (Exception e){
                System.out.println("Characters not allowed!! Try again.");
            }
        } while (!validDob);

        return "So you are " + age + " years old";
    }


    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear - dob);
    }
}
