public class shadow {

    static int x = 10; // Class variable

    public static void main(String[] args) {
        System.out.println(x);
        int x; // Initial value of Class variable(x = 10) is shadowed by declaration in this scope
        // x = 20;
        //System.out.println(x); // Scope will begin when value is initialised
        x = 20;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
        int x = 30; // Initial value of x = 10 is shadowed by update in this scope but it is not affected by the updation of x in line 7
        System.out.println(x);
    }
}