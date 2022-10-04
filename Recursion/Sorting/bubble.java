package Sorting;
import java.util.*;
public class bubble {
    public static void main(String[] args) {
    	int[] arr={5,4,3,2,1};
   	    bubbleSort(arr,0,arr.length-1);
   	    System.out.println(Arrays.toString(arr));
    }
    
    static void bubbleSort(int[] arr, int i, int j){
    	if(i<j){
        	if(arr[i] > arr[i+1]){
            	swap(arr, i,i+1);
        	}
        	bubbleSort(arr, i+1, j);
    	}
    	if(j>0){
        	bubbleSort(arr, 0, j-1);
    	}
    }
    
    static void swap(int[] arr, int first, int second){
    	int temp = arr[first];
    	arr[first] = arr[second];
    	arr[second] = temp;
    }
}