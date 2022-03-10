// SOLUTION OF LEETCODE PROBLEM 832 : https://leetcode.com/problems/flipping-an-image/


public class q832 {
    public static void main(String[] args) {

        int[][] numbers ={  {1,0,0,0},
                            {0,1,1,1},
                            {1,1,0,0},
                            {0,0,1,1} };

        int [][] xArray = flipAndInvertImage(numbers);
        

        for(int i=0; i < numbers.length; i++){
            System.out.println("");
            for(int j=0; j < numbers[i].length; j++){
                System.out.print(xArray[i][j]);
            }
        }
    }


    // LEET CODE SOULTION STARTS FROM HERE
    static int[][] flipAndInvertImage(int[][] image) {
            
        int[][] revArr = new int[image.length][image.length];
            
        for(int row=0; row < image.length; row++){
                
            int last = image.length-1;
                
            for(int col=0; col < image[row].length; col++){ 
                revArr[row][col] = image[row][last];
                last--;
            }
        }


        int [][] invArr = revArr;

        for(int row=0; row < image.length; row++){
                
            for(int col=0; col < image[row].length; col++){ 

                if(invArr[row][col] == 0)
                    invArr[row][col] = 1;
                else if(invArr[row][col] == 1)
                    invArr[row][col] = 0;
            }
        }        

        return invArr;
    }
}