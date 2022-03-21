// SOLUTION OF LEETCODE PROBLEM 268 : https://leetcode.com/problems/missing-number/

public class q268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    public int missingNumber(int[] nums) {
        cycleSort(nums);
        
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }   
        return nums.length;
    }
    
    public void cycleSort(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}