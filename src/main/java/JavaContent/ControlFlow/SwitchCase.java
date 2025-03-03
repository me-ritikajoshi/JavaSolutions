package JavaContent.ControlFlow;

public class SwitchCase {
    public static void main(String[] args) {
        int switchValue = 3;
//        switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was 3 or 4 or 5");
//                System.out.println("Actually it was " +switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Was not 1 or 2");
        }

        String month = "qwer";
        System.out.println( month + " is in " + getQuarter(month) +" quarter");

    }
    public static String getQuarter(String month){
//        switch (month){
//            case "January":
//            case "February":
//            case "March":
//                return "1st";
//
//            case "April":
//            case "May":
//            case "June":
//                return "2nd";
//
//            case "July":
//            case "August":
//            case "September":
//                return "3rd";
//
//            case "October":
//            case "November":
//            case "December":
//                return "4th";
//
//        }
//        return "bad";

        return switch (month) {
            case "January", "February", "March" ->{
               yield "1st";
            }
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad ";
                yield  badResponse;
            }
        };
    }
}
