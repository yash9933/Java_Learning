import java.util.*;

public class rangeSearch {
    public static void main(String[] args) {
        
        int[] numbers = {12, 62, 234, 49, 9, 38, 77, 51};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elemet to find :");
        int num = sc.nextInt();

        System.out.println("Enter start index :");
        int start = sc.nextInt();

        System.out.println("Enter end index :");
        int end = sc.nextInt();

        System.out.println(search(numbers, num, start, end));
    }

    static String search(int[] arr, int n, int s, int e){

        if(s<0 && e>arr.length){
            return "The range is invalid";
        }

        for (int i = s; i <= e; i++) {
            if(n == arr[i])
                return  n + " is present in the given range";
        }

        return n + " is NOT present in the given range";
    }
}