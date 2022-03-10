public class ascending{
    public static void main(String[] args) {
        
        int [] numbers = {1, 6, 8, 13, 14, 19, 22, 27, 30, 31, 32};     // ASCENDING ARRAY
        int target = 30;                                                // ELEMENT TO FIND

        System.out.println(binarySearch(numbers, target));
    }


    // METHOD FOR BINARY SEARCH IN ASCENDING ARRAY
    static int binarySearch(int[] arr, int find){
        
        int start = 0;
        int end = arr.length - 1 ;

        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(find < arr[mid])
                end = mid - 1;

            else if(find > arr[mid])
                start = mid + 1;

            else
                return mid;
        }
        return -1;
    }
}