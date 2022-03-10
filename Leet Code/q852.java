// SOLUTION OF LEETCODE PROBLEM 852: https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class q852 {
    public static void main(String[] args) {
        int[] nums = {0,1,10,12,15,13,11,8};
        System.out.println(peakIndexInMountainArray(nums));
    }

    //LEET CODE SOLUTION STARTS FROM HERE

    //SOLUTION 1 USING LINEAR SEARCH
    // static int peakIndexInMountainArray(int[] arr) {
    //     int x = Integer.MIN_VALUE;
    //     int last = 0;
        
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] > x)
    //             last = arr[i];
    //     }
    //     return last;
    // }


    //SOLUTION 2 USING BINARY SEARCH
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }
        return end;
    }
}