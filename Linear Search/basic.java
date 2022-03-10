import java.util.*;

public class basic {
    public static void main(String[] args) {
        
        int[] arr = {12, 62, 234, 49, 9, 38, 77, 51};

        String ans = linearSearch(arr);
        System.out.println(ans);
    }

    static String linearSearch(int[] array){

        System.out.println("Enter element to search :");


        int find;
        Scanner sc = new  Scanner(System.in);
        find = sc.nextInt();

        int i=0;

        for (i=0;  i<array.length; i++) {

            if(array[i] == find){
                String result = find +" is present in the array";
                return result;
            }
        }
        return find + " is NOT present in the array";
    }
}