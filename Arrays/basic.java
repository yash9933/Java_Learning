import java.util.*;

public class basic{
    public static void main(String[] args) {
        
        // DECLARATION OF 1 DIMENSIONAL ARRAY
        int[] arr = new int[4];


        // LOOP FOR INPUT OF 1 DIMENSIONAL ARRAY
        System.out.println("Enter data of araay");
        for(int i=0; i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }


        // LOOP FOR OUTPUT OF 1 DIMENSIONAL ARRAY
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // LOOP FOR OUTPUT OF 1 DIMENSIONAL ARRAY
        for(int i:arr){
            System.out.println(i+ " ");
        }
        
        //OUTPUT OF 1 DIMENSIONAL ARRAY
        System.out.println(Arrays.toString(arr));
    }
}