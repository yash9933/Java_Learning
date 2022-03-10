import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp=0;
        String rev="";

        while(num>0){

            temp = num%10;
            rev = rev + temp;
            num = num/10;
        }

        System.out.println(rev);
    }
}