import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 50, 6, 8, 0, -25, 4};

        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSorting(int[] nums){

        for(int i=0; i < nums.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(nums[j-1] > nums[j]){
                    swap(nums, j-1, j);
                }
                else
                    break;
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}