// SOURCE OF PROBLEM : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class infiniteArray {
    public static void main(String[] args) {
        int[] reallyLongInfiniteArray = {1, 5, 6, 8, 12, 17, 21, 22, 28, 35, 49, 66, 89, 120};
        int find = 21;

        System.out.println(infiniteArraySearch(reallyLongInfiniteArray, find));
    }

    static int infiniteArraySearch(int[] nums, int target){

        int start = 0;
        int end = 1;

        while(target > nums[end]){
            int temp = end + 1;
            end = end + (end- start + 1) * 2;
            start = temp;
        }

        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end-start) / 2;

            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}