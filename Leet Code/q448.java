// SOLUTION OF LEETCODE PROBLEM 448 : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class q448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,7,2,3,1};

        System.out.println(findDisappearedNumbers(arr));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> ans = new ArrayList<>();
        
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
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