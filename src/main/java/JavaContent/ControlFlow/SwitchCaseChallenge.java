package JavaContent.ControlFlow;

public class SwitchCaseChallenge {
    public static void main(String[] args) {
        char ch = 'E';

//        switch (ch){
//            case 'A':
//                System.out.println("Able");
//                break;
//            case 'B':
//                System.out.println("Baker");
//                break;
//            case 'C':
//                System.out.println("Charlie");
//                break;
//            case 'D':
//                System.out.println("Dog");
//                break;
//            case 'E':
//                System.out.println("Easy");
//                break;
//            default:
//                System.out.println("Not Found!");
//                break;
//        }

        switch (ch) {
            case 'A' -> System.out.println("Able");
            case 'B' -> System.out.println("Baker");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Dog");
            case 'E' -> System.out.println("Easy");
            default -> System.out.println("Not Found!");
        }
        printDayOfWeek(6);
        printWeekDay(6);
    }

    public static void printDayOfWeek(int day){
        switch (day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Day");
        }
    }
    public static void printWeekDay(int day){
        if (day == 1){
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        }else if (day == 3) {
            System.out.println("Tuesday");
        }else if (day == 4) {
            System.out.println("Wednesday");
        }else if (day == 5) {
            System.out.println("Thursday");
        }else if (day == 6) {
            System.out.println("Friday");
        }else if (day == 7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid Day");
        }
    }
}
