package Sortings.Bubble;

public class BinarySearch {
    public static int binary(int[]arr , int x){
        int low=0;
        int high=arr.length-1;

        while(low<=high) {

            int mid = low + (high - low) / 2;

            // if it equals to mid
            if (arr[mid] == x) {
                return mid;

            }

            // if x is greater than mid then ignore left half
            if (arr[mid] < x) {
                low = mid + 1;
            }

            // if x is smaller than mid then ignore right half
            else {
                high = mid - 1;
            }
        }


        return -1;
    }


}
