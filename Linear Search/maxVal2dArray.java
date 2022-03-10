public class maxVal2dArray{
    public static void main(String[] args) {
        
        // DECLARATION AND INITIALISATION OF 2D ARRAY (YOU CAN ALSO INPUT THIS FROM USER)
        int[][] arr = { {42, 53},
                        {91, 37, 69},
                        {35, 87, 45, 83} };
        
        // DECLARATION AND INITIALISATION OF REFERENCE MINIMUM ELEMENT
        int find = Integer.MIN_VALUE;

        // CALLING SEARCH METHOD
        System.out.println(search2d(arr,find));
    }

    static int search2d(int[][] num, int check){

        // LOOP TO FIND BIGGEST ELEMENT IN 2D ARRAY
        for(int row = 0; row < num.length; row++){
            for(int col = 0; col < num[row].length; col++){
                if(num[row][col] > check)
                    check = num[row][col];
            }
        }

        return check;
    }
}