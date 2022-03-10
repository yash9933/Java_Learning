import java.util.*;

public class varargs {
    public static void main(String[] args) {
        
        fun(10, 23, 345, 7, 95);
        yum("Choco", "Candy", "toffee", "milk");
        random(10, 20, "yash", "vansh", "kunal");
    }

    // static void fun(int/String/char ...a/b/f/y/x)    // You can use any data type and any variable. JUST THE 3 DOTS ARE MANDATORY FOR VARIABLE LENGTH ARGUEMENTS
    
    static void fun(int ...x){
        System.out.println(Arrays.toString(x));
    }

    static void yum(String ...d){
        System.out.println(Arrays.toString(d));
    }

    static void random(int a, int b, String ...w){  //Variable length arguements have to be mentioned in the last
        System.out.print(a);
        System.out.print(b);
        System.out.println(Arrays.toString(w));
    }
}