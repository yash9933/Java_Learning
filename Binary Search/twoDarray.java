import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = { {10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,38,44,50} };

        int target = 15;

        System.out.println(Arrays.toString(binarySearchIn2Darray(arr, target)));
    }

    static int[] binarySearchIn2Darray(int[][] matrix, int target){
        int row=0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target)
                return new int[] {row,col};
            else if(matrix[row][col] > target)
                col--;
            else
                row++;
        }
        return new int[] {-1,-1};
    }
}