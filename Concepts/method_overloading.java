import java.util.*;

public class method_overloading {
    public static void main(String[] args) {
        
        // OVERLOADING : 2 functions/methods of same name can exist if their arguement "quanity/type" is different
        
        over(20);
        over(10,30);
        over(10,30);
        over(10,30,42,567,32,98,67);
        over("yash");
        over("yash", "vansh", "rohan");
    }

    static void over(String a){
        System.out.println(a);
    }

    static void over(int a){
        System.out.println(a);
    }

    static void over(int a,  int b){
        System.out.println(a);
        System.out.println(b);
    }

    static void over(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void over(String ...a){
        System.out.println(Arrays.toString(a));
    }
}