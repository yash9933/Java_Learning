import java.util.Arrays;
public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {7,3,6,5,2,1,4};
        cycleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSorting(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else
                i++;
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}