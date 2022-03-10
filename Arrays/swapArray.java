import java.util.*;

public class swapArray {
    public static void main(String[] args) {
        
        // DECLARATION OF AN ARRAY
        int[] arr = new int [2];

        // INITIALISATION OF AN ARRAY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st element of array");
        arr[0] = sc.nextInt();
        System.out.println("Enter 2nd element of array");
        arr[1] = sc.nextInt();

        swap(arr, 0 , 1);
    }

    static void swap(int[] nums, int a , int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

        System.out.println("Array after swapping");
        System.out.println(Arrays.toString(nums));
    }
}