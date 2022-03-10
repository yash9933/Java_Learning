import java.util.*;

public class maxValue {
    public static void main(String[] args) {
        
        // DECLARATION OF AN ARRAY
        int[] arr = new int [5];

        // INITIALISATION OF AN ARRAY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The largest element of array is : ");
        System.out.println(maxArray(arr));
    }

    static int maxArray(int[] nums) {
        
        int largest = nums[0];
        
        for(int i=1; i<5; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        
        return largest;
    }
}