// SOLUTION OF LEETCODE PROBLEM 41 : https://leetcode.com/problems/first-missing-positive/

public class q41 {
    public static void main(String[] args){
        int[] arr = {1,2,0};

        System.out.println(firstMissingPositive(arr));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    public int firstMissingPositive(int[] nums) {
        cycleSort(nums);
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    
    public void cycleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
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