// PATTERN 8
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
//   4 3 2 1 2 3 4
//     3 2 1 2 3
//       2 1 2
//         1

public class p8 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row < 2*n; row++) {
            int totalColInRow = row > n ? 2*n-row : row;
            
            for (int s = 0; s < n-totalColInRow; s++) {
                System.out.print("  ");
            }
            for (int col = totalColInRow; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= totalColInRow; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}