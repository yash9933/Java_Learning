import java.util.*;

public class prime {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isPrime(num);
        
    }

    static void isPrime(int a){

        if(a==2 || a==3){
            System.out.println(a + " is a Prime number");
        }
        
        else if(a==1 || a%2==0 || a%3==0){
            System.out.println(a + " is not a Prime number");
        }

        else{
            System.out.println(a + " is a Prime number");
        }
    }
}