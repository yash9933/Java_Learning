public class binarySearch {
    public static void main(String[] args){
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.print(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){
        int mid = start +(end-start)/2;

        if(start > end){
            return -1;
        }
        if(target < arr[mid]){
            return search(arr, target, start, mid-1);
        }
        if(target > arr[mid]){
            return search(arr, target, mid+1, end);
        }
        return mid;
    }
}