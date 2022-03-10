import java.util.*;

public class swap {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int a = in.nextInt();
        System.out.print("Enter num 2: ");
        int b = in.nextInt();

        int result = swap(a,b);
        System.out.println("After Swapping \r\n Num 1: "+result);
    }

    static int swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        return x;
    }
}