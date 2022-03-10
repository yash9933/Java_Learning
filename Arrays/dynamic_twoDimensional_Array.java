import java.util.*;

public class dynamic_twoDimensional_Array{
    public static void main(String[] args) {
        
        // INPUT OF SIZE OF DYNAMIC 2 DIMENSINAL ARRAY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of 2d array");
        int rows = sc.nextInt();
        System.out.println("Enter width of 2d array");
        int cols = sc.nextInt();
        

        //DECLARATION OF DYNAMIC 2 DIMENSIONAL ARRAY
        int[][] array2d = new int[rows][cols];

        
        // LOOP FOR INPUT OF DYNAMIC 2 DIMENSINAL ARRAY
        for(int row =0; row < array2d.length; row++){

            // LINE 22 & 23 ARE NOT MANDATORY FOR THIS PROGRAM
            int x = row +1;
            System.out.println("Enter "+ x +" row of array");

            for(int col=0; col<  array2d[row].length; col++){
                array2d[row][col] = sc.nextInt();
            }
        }

        // LOOP FOR OUTPUT OF 2 DIMENSINAL ARRAY
        for(int i=0; i<rows ; i++){
            System.out.println(Arrays.toString(array2d[i]));
        }
    }
}