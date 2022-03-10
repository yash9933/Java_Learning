public class search2dArray {
    public static void main(String[] args) {
        
        // DECLARATION AND INITIALISATION OF 2D ARRAY (YOU CAN ALSO INPUT THIS FROM USER)
        int[][] arr = { {42, 53},
                        {91, 37, 69},
                        {35, 87, 45, 82} };
        
        // DECLARATION AND INITIALISATION OF ELEMENT TO SEARCH (YOU CAN ALSO INPUT THIS FROM USER)
        int find = 82;

        // CALLING SEARCH METHOD
        System.out.println(search2d(arr,find));
    }

    static boolean search2d(int[][] num, int check){

        // LOOP TO FIND ELEMENT IN 2D ARRAY
        for(int row = 0; row < num.length; row++){
            for(int col = 0; col < num[row].length; col++){
                if(num[row][col] == check)
                    return true;
            }
        }

        return false;
    }
}