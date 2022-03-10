import java.util.Scanner;

public class function4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = add(a,b);
        System.out.print(result);
    }

    static int add(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}