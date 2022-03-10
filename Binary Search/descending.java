public class descending {
    public static void main(String[] args) {
        
        int[] nums = {98, 86, 82, 75, 69, 53, 17, 5, 3, 1};      // DESCENDING ARRAY
        int target = 82;                                         // ELEMENT TO FIND

        System.out.println(descendingBinarySearch(nums, target));
    }

    
    // METHOD FOR BINARY SEARCH IN DESCENDING ARRAY
    static int descendingBinarySearch(int[] arr, int find){

        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > find)
                start = mid + 1;
            else if(arr[mid] < find)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}