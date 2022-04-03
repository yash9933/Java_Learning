// PATTERN 5
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class p5 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
    }

    // SOLUTION 1
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <=n ; row++) {
            for (int col = 4; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // SOLUTION 2
    static void pattern2(int n){
        for (int row = 1; row < 2*n ; row++) {
            int totalColsInRow = row > n ? 2 * n-row : row;

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}