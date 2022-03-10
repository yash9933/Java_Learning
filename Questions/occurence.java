import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        
        int[] i =  new int[10];

        i[0]=1;
        i[1]=3;
        i[2]=8;
        i[3]=5;
        i[4]=7;
        i[5]=5;
        i[6]=7;
        i[7]=8;
        i[8]=9;
        i[9]=7;

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int check = in.nextInt();
        int count=0;
        int ld=0;


        // for(int n=0; n<=9; n++){

        //     if(check == i[n]){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        for(int n=0; n<=20; n++){

            ld = number%10;
            number = number/10;

            if(check == ld){
                count++;
            }
        }

        System.out.println(check + " occured " + count + " times");
    }
}
