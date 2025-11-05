package Sortings.Selection;

public class Selection {

    //if the array is //like [64,25,12,22,11]
    // the minimum element is 11
    //and j loop start from i+1 to n that means 25 to 11
    // it will compare 25 with 11 and find the minimum element
    //so 25 is smaller than minimum element so the minum_idx will be updated to index of 25
    // and then i index will get swapped with minum_idx index
     static void Sort(int[]arr){
         int n=arr.length;

         for(int i=0;i<n-1;i++){
             // find the minimum element in unsorted array
             int min_idx=i;

             for(int j=i+1;j<n;j++){

                 //check if the current element is smaller than the minimum element
                 if(arr[j]<arr[min_idx]){
                     // update the minimum index
                     min_idx=j;
                 }
             }
                //swap the found minimum element with the first element
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
         }

     }
}
