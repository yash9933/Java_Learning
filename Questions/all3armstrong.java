public class all3armstrong {
    public static void main(String[] args) {
        
        for(int x=100; x<1000; x++){
            isArmstrong(x);
        }
    }

    static void isArmstrong(int a){
        int temp = a;
        int cube = 0;
        
        while(temp>0){
            int rem = temp%10;
            cube += (rem*rem*rem);
            temp /= 10;
        }
        
        if(cube == a)
            System.out.println(cube + " is an Armstrong");  
    }
}