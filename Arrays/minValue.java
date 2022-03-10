import java.util.*;

public class minValue {
    public static void main(String[] args) {
        
        //DECLARATION OF ARRAY
        int[] numbers = new int [5];

        // LOOP FOR INPUT OF ARRAY
        System.out.println("Enter elements of array :");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // CALLING MINIMUM METHOD/FUNCTION
        System.out.println("The smallest element is : " +minimum(numbers));
    }

    static int minimum(int[] arr){
        
        int least = arr[0];

        // LOOP TO CHECK THE LEAST VALUE IN ARRAY
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < least)
                least = arr[i];
        }

        return least;
    }
}