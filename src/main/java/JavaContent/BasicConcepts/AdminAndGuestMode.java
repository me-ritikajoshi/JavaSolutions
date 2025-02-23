package JavaContent.BasicConcepts;

import java.util.Scanner;

public class AdminAndGuestMode {
    public static void main(String[] args) {
       String admin = "--admin";
       String guest = "--guest";

       Scanner sc = new Scanner(System.in);
       String inp = sc.next();

       if(inp.contains(admin) && inp.contains((guest))){
           System.out.println("Please select either admin or guest mode");
       } else if (inp.contains(admin)) {
           System.out.println("hello admin");
       }else {
           System.out.println("hello guest");
       }
    }
}
