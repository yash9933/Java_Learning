import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 55, 6, 8, 1, 5, 4};

        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSorting(int[] nums){

        for(int i=0; i < nums.length; i++){
            int last = nums.length - i - 1;
            int max = largest(nums, last);
            swap(nums, max, last);
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static int largest(int[] nums, int end){

        int max = 0;

        for(int i=0; i <= end; i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }
}