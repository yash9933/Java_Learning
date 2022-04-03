// PATTERN 4
// 1
// 12
// 123
// 1234
// 12345

public class p4 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }   
}