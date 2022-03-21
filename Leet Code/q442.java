import java.util.ArrayList;
import java.util.List;

// SOLUTION OF LEETCODE PROBLEM 442 : https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class q442 {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    public List<Integer> findDuplicates(int[] nums) {
        cycleSort(nums);
        List<Integer> ans = new ArrayList<>();

        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    
    public void cycleSort(int[] nums) {
        int i=0;
        while(i< nums.length){
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