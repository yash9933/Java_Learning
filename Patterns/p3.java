// PATTERN 3
// *****
// ****
// ***
// **
// *

public class p3 {
    public static void main(String[] args) {
        patterns(5);
    }

    static void patterns(int n){
        // SOLUTION 1
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // SOLUTION 2
        for (int row = 1; row <=n ; row++) {
            for (int col = 5; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}