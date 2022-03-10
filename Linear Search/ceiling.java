public class ceiling{
    public static void main(String[] args) {
        
        int[] arr = { 1, 3, 4, 7, 8, 13, 16, 23, 30, 35};
        int target = 5;

        System.out.println(ceil(arr, target));
    }

    static int ceil(int[] nums, int find){

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = end - start / 2;

            if(nums[mid] > find)
                end = mid - 1;
            else if(nums[mid] < find)
                return nums[mid + 1];
            else
                return nums[mid];
        }
        return -1;
    }
}