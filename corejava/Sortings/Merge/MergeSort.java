package Sortings.Merge;

public class MergeSort {
    static void merge(int[]arr , int start , int mid , int end){

        // find the size of two subarrays to be merged
        int n1= mid - start +1;// if [1,2,3] then mid=2 start =0 so n1=2-0+1=3
        int n2= end - mid;// if [4,5] then end=4 mid=2 so n2=4-2=2

        //craete a temp array or vector
        int[] left = new int[n1];
        int[] right = new int[n2];

        //copy data to temp arrays left[] and right[]
        for(int index=0;index<n1;index++){
            left[index]=arr[start + index];
        }

        for(int index=0;index<n2;index++){
            right[index]=arr[mid +1 + index];
        }

        //merge the temp arrays

        //initial indexes of first and second subarrays
        int i=0 , j=0;

        int k=start; // initial index of merged subarray
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        //copy the remaining elements of left[] if any
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }

        //copy the remaining elements of right[] if any
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

    }

    static void sort(int[]arr , int start , int end){
        if(start<end){
            //find the mid point
            int mid= start + (end - start)/2;

            //sort first and second halves
            sort(arr , start , mid);
            sort(arr , mid +1 , end);

            //merge the sorted halves
            merge(arr , start , mid , end);
        }
    }
    void printArray(int[]arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
