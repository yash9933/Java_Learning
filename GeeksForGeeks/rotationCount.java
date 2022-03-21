public class rotationCount{
    public static void main(String[] args) {
        int[] arr = {10,12,13,1,3,5,7,9};

        System.out.println(counts(arr));
    }

    static int counts(int[] nums){
        int pivot = findPivot(nums);
        return pivot + 1;
    }

    static int findPivot(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1])
                return mid;

            else if(mid > start && nums[mid] < nums[mid-1])
                return mid-1;

            else if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(nums[start] > nums[start+1])
                    return start;
                else
                    start++;

                if(nums[end] < nums[end-1])
                    return end-1;
                else
                    end--;
            }
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end]))
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}