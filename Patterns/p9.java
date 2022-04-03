// PATTERN 9
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 3
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

public class p9 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int y=2*n;
        for (int row = 1; row < y; row++) {
            for (int col = 1; col < y; col++) {
                int atEveryIndex = n+1 - Math.min(Math.min(row,col),Math.min(y-row,y-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}