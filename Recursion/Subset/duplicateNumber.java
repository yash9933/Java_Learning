package Subset;
import java.util.*;
public class duplicateNumber {
	public static void main(String[] args) {
	    int[] arr={1,2,2};
		System.out.println(subset(arr));
	}

    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int end=0;
        
        for(int j=0; j<arr.length; j++){
            int start=0;
            if(j>0 && arr[j] == arr[j-1]){
                start = end+1;
            }
            int n=outer.size();
            end = n-1;

            for(int i=start; i<n; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}