import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        char  op = in.next().trim().charAt(0);
        int result = 0;

        while(true){
            if(op=='+' || op=='-' || op=='/' || op=='%' || op=='*'){

                if(op=='+'){
                    result = num1+num2;
                }
                else if(op=='-'){
                    result = num1-num2;
                }
                else if(op=='/'){
                    result = num1/num2;
                }
                else if(op=='%'){
                    result = num1%num2;
                }
                else if(op=='*'){
                    result = num1*num2;
                }
                else{
                    System.out.println("Invalid input");
                }
            }
            else{
                System.out.println("Invalid input");
            }

            System.out.println(result);
        }
        
        
    }
}