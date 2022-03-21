import java.util.Arrays;

public class sortedMatrix {

    public static void main(String[] args) {
        int[][] arr = { {1 ,2 ,3 ,4 },
                        {5 ,6 ,7 ,8 },
                        {9 ,10,11,12},
                        {13,14,15,16} };

        int target = 15;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    // SOLUTION 1
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1)
            return binarySearchInSortedMatrix(matrix, 0, 0, cols-1, target);

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd - 1)){                          // IF THIS IS TRUE, IT MEANS WE HAVE MORE THAN 2 ROWS
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target)
                return new int[] {mid,cMid};
            else if(matrix[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }

        // IF WE HAVE 2 ROWS, CHECK WHETHER TARGET IS IN COL OF 2 ROWS
        if(matrix[rStart][cMid] == target)
            return new int[] {rStart, cMid};
        else if(matrix[rStart + 1][cMid] == target)
            return new int[] {rStart + 1, cMid};

        // SEARCH IN 1ST HALF
        if(target <= matrix[rStart][cMid - 1])
            return binarySearchInSortedMatrix(matrix, rStart, 0, cMid - 1, target);

        // SEARCH IN 2ND HALF
        else if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1])
            return binarySearchInSortedMatrix(matrix, rStart, cMid + 1, cols - 1, target);

        // SEARCH IN 3RD HALF
        else if(target <= matrix[rStart + 1][cMid - 1])
            return binarySearchInSortedMatrix(matrix, rStart + 1, 0, cMid - 1, target);

        // SEARCH IN 4TH HALF
        else if(target >= matrix[rStart + 1][cMid + 1] && target <= matrix[rStart + 1][cols - 1])
            return binarySearchInSortedMatrix(matrix, rStart + 1, cMid + 1, cols - 1, target);
    
        return new int[] {-1,-1};
    }

    static int[] binarySearchInSortedMatrix(int[][] matrix, int row, int cStart, int cEnd, int target){
        
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] > target)
                cEnd = mid - 1;
            else if(matrix[row][mid] < target)
                cStart = mid + 1;
            else
                return new int[] {row,mid};
        }
        return new int[] {-1,-1};
    }


    // SOLUTION 2
    // static int[] binarySearchInSortedMatrix(int[][] matrix, int target){
    //     int row=0;
    //     int col = matrix.length - 1;

    //     while(row < matrix.length && col >= 0){
    //         if(matrix[row][col] == target)
    //             return new int[] {row,col};
    //         else if(matrix[row][col] > target)
    //             col--;
    //         else
    //             row++;
    //     }
    //     return new int[] {-1,-1};
    // }
}