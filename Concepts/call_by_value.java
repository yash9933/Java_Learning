import java.util.*;

public class call_by_value {
    public static void main(String[] args) {
        
        String name = "Yash Sharma";
        change(name);
        System.out.println(name);   // String is not changed/updated as it is a primitive data type


        // DECLARATION AND INITIALISATION OF ARRAY (YOU CAN ALSO INPUT THIS FROM USER)
        int[] arr= {10,20,30,40,50};

        // CALLING CHANGE METHODS
        changeNONPRIMITIVE(arr);
        System.out.println(Arrays.toString(arr));   // Array is changed/updated as it is a non-primitive data type
    }

    static void change(String naam){
        naam = "Kunal Kushwaha";
    }

    static void changeNONPRIMITIVE(int[] nums){
        nums[0] = 100;
    }
}