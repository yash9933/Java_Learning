import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int empid = sc.nextInt();
        String dept = sc.next();

        switch (empid) {
            case 1:
                System.out.println("Yash Sharma");
                break;
            case 2:
                System.out.println("Piyush Bansal");
                break;
            
            case 3:
                switch (dept) {
                    case "it":
                        System.out.println("IT Department");
                        break;

                    case "mgmt":
                        System.out.println("Management Department");
                        break;

                    default:
                        break;
                }
        
            default:
                break;
        }
    }
}