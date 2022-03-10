import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isArmstrong(num);
    }

    static void isArmstrong(int a){
        int temp=a;
        int cube = 0;

        for(int rem,i=0; i<3; i++){
            rem = a%10;
            cube += (rem*rem*rem);
            a /= 10;
        }
        
        if(cube == temp)
            System.out.println(cube + " is an Armstrong");
        else
            System.out.println(temp + " is NOT an Armstrong");        
    }
}