package Sortings.Insertion;

public class LinearSearch {

    static int linear(int[]arr , int x){
        int n= arr.length;
        //time complexity is O(n)

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }

        return -1;//this will return -1 if the element is not found
    }
}
