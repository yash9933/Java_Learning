// SOLUTION OF LEETCODE PROBLEM 4: https://leetcode.com/problems/median-of-two-sorted-arrays/

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    // LEET CODE SOLUTION STARTS HERE
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0;
        // int[] nums3 = new int[10];
    
        int a = nums1.length;
        int b = a + nums2.length;
    
        // for(int i=0; i<a; i++){
        //     nums3[i] = nums1[i];
        // }
        // for(int i=a+1; i<b; i++){
        //     nums3[i] = nums1[i];
        // }
        //System.out.print(Arrays.toString(nums3));
        System.out.print(b);
        return ans;
    }
}