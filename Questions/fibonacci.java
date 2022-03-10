import java.util.*;

class fibonacci {
    public static void main(String[] args) {
        // for(int i=0; i<=5; i++){
        //     System.out.println("Hello");
        // }

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();    

        int a=0, b=1, count=1;

        // LOOP FOR OUTPUT OF FIBONACCI SERIES
        while(count<=i){
            int  temp = b;
            b+=a;
            
            count++;
            System.out.println(a);
            a=temp;
        }
    }
}