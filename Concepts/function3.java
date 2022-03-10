import java.util.*;

public class function3 {
    public static void main(String[] args) {
        String n = greet();
        System.out.println("Hello "+n);
    }

    static String greet(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }
}