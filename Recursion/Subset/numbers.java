package Subset;
import java.util.*;
public class numbers{
	public static void main(String[] args) {
	    int[] arr={1,2,3};
		System.out.println(subset(arr));
	}

    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        
        for(int num:arr){
            int n=outer.size();
            for(int i=0; i<n; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}