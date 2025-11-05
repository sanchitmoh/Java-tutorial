package Sortings.Insertion;

public class Insertion {

    static void sort(int[]arr){
        int n= arr.length;

        // Traverse through 1 to n
        // we are sarting from 1 bcz we are assuming that the first element is already sorted
        for(int i=1;i<n;i++){

            int cuurrent=arr[i];
            int previous=i-1;

            // Move elements of arr[0..i-1], that are greater than current,
            // to one position ahead of their current position
            //example [2,4,6,8,3]
            //current=4 and previous =2
            // we will compare current with previous if previous is greater than current then we will shift the previous to next position
            //if not then we will insert the current at previous+1 position
            //then current will be 6 and previous will be 4
            //we will compare the 6 with 4 and as 4 is not greater than 6 we will insert 6 at previous+1 position
            //lets current as 3 and previous as 8
            // we will compare 3 with 8 as 8 is greater than 3 we will shift 8 to next position
            while(previous>=0 && arr[previous]>cuurrent){

                arr[previous+1]=arr[previous];
                previous--;
            }

            arr[previous+1]=cuurrent;

        }

    }

    void printArray(int[]arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
