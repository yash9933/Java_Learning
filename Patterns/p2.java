// PATTERN 2
// *****
// *****
// *****
// *****
// *****

public class p2 {
	public static void main(String[] args) {

        // SOLUTION 1
        for(int row=1; row <= 5; row++){
            System.out.print("*****");
            System.out.println();
        }

        // SOLUTION 2
        for(int row=1; row <= 5; row++){
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}