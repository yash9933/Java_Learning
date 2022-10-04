package Sorting;
import java.util.*;
public class mergeSort {
    public static void main(String[] args) {
        int[] arr={7, 64, 42, 32, 51, 67, 95, 65, 57};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[]left, int[]right){
        int[] newArr = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                newArr[k] = left[i];
                i++;
            }else{
                newArr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            newArr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            newArr[k] = right[j];
            j++;
            k++;
        }
        
        return newArr;
    }
}