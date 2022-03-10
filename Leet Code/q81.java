// SOLUTION OF LEETCODE PROBLEM 81 : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class q81 {
    public static void main(String[] args) {
        //int[] nums = {3,4,5,5,8,9,0,1,2};
        int[] nums = {1,1,3};
        int target = 0;
        System.out.println(search(nums, target));
    }

    // LEET CODE SOLUTION STARTS HERE    
    static boolean search(int[] nums, int target) {

        int peak = findPeak(nums);
        int start = 0;
        int end = nums.length-1;

        if(peak == -1)
            return binarySearch(nums, target, start, end);
        else if(nums[peak] == target)
            return true;
        else if(target >= nums[start])
            return binarySearch(nums, target, start, peak-1);
        else
            return binarySearch(nums, target, peak+1, end);
    }


    static int findPeak(int[] nums) {
        
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1])
                return mid;
            else if(mid > start && nums[mid-1] > nums[mid])
                return mid-1;

            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(start < end && nums[start] > nums[start+1])
                    return start;
                else
                    start++;

                if(end > start && nums[end] < nums[end-1])
                    return end-1;
                else
                    end--;
            }
            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }            
        
    
    static boolean binarySearch(int[] arr, int find, int start, int end){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] > find)
                end = mid-1;
            else if(arr[mid] < find)
                start = mid+1;
            else
                return true;
        }
        return false;
    }
}