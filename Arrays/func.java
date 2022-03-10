import java.util.*;

public class func {
    public static void main(String[] args) {
        
        int[] arr = new int [5];

        for(int i=0; i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }

        array(arr);

        System.out.println(Arrays.toString(arr));
    }

    static int[] array(int[] nums){
        nums[0] = 99;
        return nums;
    }
}