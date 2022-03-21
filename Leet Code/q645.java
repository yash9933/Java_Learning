// SOLUTION OF LEETCODE PROBLEM 645 : https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class q645 {
    public static void main(String[] args){
        int[] arr = {2,2};

        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    public int[] findErrorNums(int[] nums) {
        cycleSort(nums);
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                return new int[]{nums[index] , index+1};
            }
        }
        return new int[]{};
    }
    
    public void cycleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}