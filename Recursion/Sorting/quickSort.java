package Sorting;
import java.util.Arrays;

public class quickSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int pivot = (s+e)/2;

        while(s <= e){
            while(arr[s] < arr[pivot]){
                s++;
            }
            while(arr[e] > arr[pivot]){
                e--;
            }
            if(s <= e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}