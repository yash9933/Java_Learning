import java.util.*;
public class sswitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String fruit = in.next();

        //Default Swtich statement
        // switch (fruit) {
        //     case "apple":
        //         System.out.println("A red sweet fruit");                
        //         break; //terminates the switch case

        //     case "mango":
        //         System.out.println("king of fruits");
        //         break;
        
        //     default:
        //         System.out.println("Invalid fruit");
        //         break;
        // }


        //Enhanced Swtich statement
        // switch (fruit) {
        //     case "apple" -> System.out.println("A red sweet fruit"); //break is by default
        
        //     case "mango" -> System.out.println("king of fruits");
        
        //     default -> System.out.println("Invalid fruit");
        // }

        int day = sc.nextInt();

        switch (day) {
            case 1:{
                System.out.println("Monday");
                break;
            }

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                break;
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}