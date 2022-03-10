// SOLUTION OF LEETCODE PROBLEM 1672 : https://leetcode.com/problems/richest-customer-wealth/

public class q1672 {
    public static void main(String[] args) {
        
        int[][] arr = { {2,8,7},
                        {7,1,3},
                        {1,9,5}};
        
        System.out.println(maximumWealth(arr));
    }

    // LEET CODE SOULTION STARTS FROM HERE
    static int maximumWealth(int[][] accounts) {

        int max = 0;
        
        for(int i=0; i < accounts.length ; i++){
            
            int rowsum=0;
            
            for(int j=0; j < accounts[i].length ; j++){
                rowsum += accounts[i][j];
            }
            
            if(rowsum > max)
                max = rowsum;
        }
        return max;
    }
}