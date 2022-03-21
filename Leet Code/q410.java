// SOLUTION OF LEETCODE PROBLEM 410 : https://leetcode.com/problems/split-array-largest-sum/

public class q410 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
    
        System.out.println(spiltArray(arr, m));
    }
    
    // LEET CODE SOLUTION STARTS HERE
    public int spiltArray(int[] nums, int m){

        int start=0;
        int end=0;

        for(int i=0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        
        while(start < end){
            int sum = 0;
            int peices = 1;
            int mid = start + (end-start)/2;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    peices++;
                }
                else
                    sum += num;
            }

            if(peices > m)
                start = mid+1;
            else
                end = mid;
        }
        return end;
    }
}