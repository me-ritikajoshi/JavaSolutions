package JavaContent.BasicConcepts;

import java.util.Scanner;

public class UserActivitySwitch {
    public static void main(String[] args) {
        System.out.println("enter an option: ");
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        switch (inp){
            case "login":
                System.out.println("Please enter your name");
                break;
            case "sign_up":
                System.out.println("Welcome");
                break;
            case "terminate_program":
                System.out.println("Thank you! Bye");
                break;
            case "main_menu":
                System.out.println("Main menu");
                break;
            case "about_app":
                System.out.println("appppppp");
                break;
            default:
                System.out.println("Please enetr one value ");
        }

    }
}
