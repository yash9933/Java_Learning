// SOLUTION OF LEETCODE PROBLEM 744 : https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class q744{
    public static void main(String[] args) {
        char[] arr = {'a','d','g','j','n','q','v'};
		char find = 'w';
		
		System.out.println(nextGreatestLetter(arr, find));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    static char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
	    int end = letters.length-1;
	    
	    if(letters[end] == target || letters[end] < target)
	        return letters[0];
	    
	    while(start<=end){
	        int mid = end - start / 2;
	        
	        if(letters[mid] < target)
	            start = mid+1;
	        else if(letters[mid] > target)
	            end = mid-1;
	        else
	            return letters[mid+1];
	    }
	    return letters[start];
    }
}