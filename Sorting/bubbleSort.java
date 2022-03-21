import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        System.out.println(Arrays.toString(bubbleSorting(arr)));
    }

    static int[] bubbleSorting(int[] nums){

        int temp=0;
        boolean swapped;

        for(int i=0; i < nums.length; i++){
            swapped = false;

            for(int j=1; j < nums.length-i; j++){
                if(nums[j] < nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return nums;
    }
}