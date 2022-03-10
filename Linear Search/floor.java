public class floor {
    public static void main(String[] args) {
        
        int[] arr = { 1, 3, 4, 7, 8, 13, 16, 23, 30, 35};
        int target = 34;

        System.out.println(floorSearch(arr, target));
    }

    static int floorSearch(int[] nums, int find){

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = end - start / 2;

            if(nums[mid] > find)
                end = mid - 1;
            else if(nums[mid] < find)
                return nums[mid];
            else
                return nums[mid];
        }
        return 99991;
    }
}