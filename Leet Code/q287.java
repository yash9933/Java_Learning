// SOLUTION OF LEETCODE PROBLEM 287 : https://leetcode.com/problems/find-the-duplicate-number/

public class q287 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};

        System.out.println(findDuplicate(arr));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    public int findDuplicate(int[] nums) {
        cycleSort(nums);
        
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
        return -1;
    }
    
    public void cycleSort(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
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