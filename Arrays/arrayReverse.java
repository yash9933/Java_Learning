import java.util.*;

public class arrayReverse {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array :");
        int[] arr = new int [5];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] nums){

        int length = nums.length;
        int[] revArr = new int [length];

        for(int i=4, j=0; i>=0; i--){
            revArr[j] = nums[i];
            j++;
        }

        return revArr;
    }
}