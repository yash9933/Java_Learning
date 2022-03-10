// SOLUTION OF LEETCODE PROBLEM 34 : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class q34{
	public static void main(String[] args) {
		
		int[] arr = {1,5,6,7,7,7,8,8,9,9,9,9,9,10};
		int find = 9;
		
		System.out.println(Arrays.toString(searchRange(arr, find)));
	}
	
	// LEET CODE SOLUTION STARTS HERE    

    // SOLUTION 1
    static int[] searchRange(int[] nums, int target){

        int[] ans={-1,-1};

        ans[0] = indexFinder(nums, target, true);

        if(ans[0] != -1){
            ans[1] = indexFinder(nums, target, false);
        }

        return ans;
    }

    static int indexFinder(int[] nums, int target, boolean isStartIndex){

        int ans = -1;
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] > target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;  
            }
            else{
                ans = mid;
                if(isStartIndex)
                    end = mid-1;
                else
                    start = mid+1;
            }
        }
        return ans;
    }


    // SOLUTION 2
    // public int[] searchRange(int[] nums, int target) {
        
    //     int start=0;
    //     int end = 0;
        
    //     for(int i=0; i < nums.length; i++){
    //         if(nums[i] == target){
    //             start = i;
    //             break;
    //         }
    //         else
    //             start=-1;
    //     }
        
        
    //     if(nums.length == 0){
    //         start = -1;
    //         end = -1;
    //     }
    //     else if(start >= 0){
    //         end=start-1;
        
    //         for(int j=start; j < nums.length; j++){
    //             if(nums[j] == target){
    //                 end += 1;
    //             }
    //         }
    //     }
    //     else{
    //         start = -1;
    //         end = -1;
    //     }
        
    //     int[] result = {start, end};
    //     return result;
    // }
}