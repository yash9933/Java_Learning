import java.util.*;

public class stringSearch {
    public static void main(String[] args) {
        
        // DECLARATION & INITIALISATION OF STRING (YOU CAN ALSO TAKE IT AS INPUT FROM USER)
        String name = "Yash Sharma";

        // CALLING METHOD FOR SEARCHING IN STRING
        String ans = linearSearch(name);
        System.out.println(ans);
    }

    static String linearSearch(String x){

        // INPUT OF ELEMENT TO FIND & CONVERTING INITIAL STRING TO LOWER & UPPER CASES
        Scanner sc =  new Scanner(System.in);
        String alphabet = sc.nextLine();
        String test1 = x;
        String test2 = x.toUpperCase();
        String test3 = x.toLowerCase();


        // IF-ELSE IF CHECKS FOR ELEMENT IN THE INITIAL STRING
        if(test1.contains(alphabet)){
            return alphabet + " is present in the array";
        }
        else if(test2.contains(alphabet)){
            return alphabet + " is present in the array";
        }
        else if(test3.contains(alphabet)){
            return alphabet + " is present in the array";
        }


        // FOR LOOP CHECKS FOR ELEMENT IN THE INITIAL STRING

        // char alphabet2 = test1.toCharArray();
        // for (int i = 0; i < x.length(); i++) {
        //    if(alphabet == test1.charAt(i))
        //     return alphabet + " is present in the array";
        // }
        // else if(test2.contains(alphabet)){
        //     return alphabet + " is present in the array";
        // }
        // else if(test3.contains(alphabet)){
        //     return alphabet + " is present in the array";
        // }}

        return alphabet + " is NOT present in the array";
    }
}