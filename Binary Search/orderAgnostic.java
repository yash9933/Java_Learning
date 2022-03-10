import java.util.Arrays;

public class orderAgnostic {
    public static void main(String[] args) {
        
        int[] nums = {1, 6, 8, 13, 14, 19, 22, 35, 50, 86};      // ASCENDING ARRAY
        //int[] nums = {98, 86, 82, 75, 69, 53, 17, 5, 3, 1};    // DESCENDING ARRAY
        int target = 86;                                         // ELEMENT TO FIND

        boolean isAsc = nums[0] < nums[nums.length-1];

        if(isAsc == true)
            System.out.println(ascendingBinarySearch(nums, target));
        else
            System.out.println(descendingBinarySearch(nums, target));
    }
    

    // METHOD FOR BINARY SEARCH IN ASCENDING ARRAY
    static int ascendingBinarySearch(int[] arr, int find){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < find)
                start = mid + 1;
            else if(arr[mid] > find)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }


    // METHOD FOR BINARY SEARCH IN DESCENDING ARRAY
    static int descendingBinarySearch(int[] arr, int find){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] < find)
                end = mid - 1;
            else if(arr[mid] > find)
                start = mid + 1;
            else
                return mid; 
            }
        return -1;
    }
}