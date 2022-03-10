// SOLUTION OF LEETCODE PROBLEM 33: https://leetcode.com/problems/search-in-rotated-sorted-array/

public class q33 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,5,8,9,0,1,2};
        int target = 5;
        System.out.println(search(nums, target));
    }

    // LEET CODE SOLUTION STARTS HERE    
    static int search(int[] nums, int target) {

        int peak = findPeak(nums);
        int start = 0;
        int end = nums.length-1;

        if(peak == -1)
            return binarySearch(nums, target, start, end);
        else if(nums[peak] == target)
            return peak;
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
            else if(nums[start] >= nums[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }            
        
    
    static int binarySearch(int[] arr, int find, int start, int end){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] > find)
                end = mid-1;
            else if(arr[mid] < find)
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}