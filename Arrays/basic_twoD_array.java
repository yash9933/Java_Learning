import java.util.Arrays;

public class basic_twoD_array {
    public static void main(String[] args) {

        // DECLARATION & INITILISATION OF 2 DIMENSINAL ARRAY         
        int[][] twoDarr = {
                           {1,2,3},
                           {4,5,6},
                           {7,8,9}
                                   };


        // DIFFERENT WAYS TO PRINT 2 DIMENSINAL ARRAY                           
        System.out.println(twoDarr[0][0]); 

        System.out.println(twoDarr[1][1]);  

        System.out.println(twoDarr[2][2]);  

        System.out.println(Arrays.toString(twoDarr[0]));
        
        
        // LOOP FOR OUTPUT OF 2 DIMENSINAL ARRAY
        for(int i=0; i<3 ; i++){
            System.out.println(Arrays.toString(twoDarr[i]));
        }
    }
}