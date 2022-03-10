// SOLUTION OF LEETCODE PROBLEM 1295 : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


public class q1295 {
    public static void main(String[] args) {
        
        int[] arr = {-12, -728, 33, 4156, 1, 52351};
        System.out.print(findNumbers(arr));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    static int findNumbers(int[] nums) {
        
        int count=0;
        int result=0;
        
        for(int i=0; i<nums.length; i++){
            
            count = digitCounter(nums[i]);
            
            if(count % 2 ==0){
                result += 1;
            }
        }
        return result;
    }
    
    static int digitCounter(int x){
        
        if(x < 0){
            x = x * -1;
        }
        
        int y=0;
        
        while(x>0){
            x = x/10;
            y += 1;
        }
        return y;
    }
}