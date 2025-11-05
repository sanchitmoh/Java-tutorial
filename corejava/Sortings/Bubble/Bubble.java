package Sortings.Bubble;

public class Bubble {

    public static  void  bubble(int[] arr){
        int n=arr.length;
        boolean swapped;

        // for outer loop is will run for n-1 times if there is 5 element it will run for 4 times
        for(int i=0; i<n-1;i++){
            swapped=false;
            // inner loop will run for n-i-1 times because after each pass the largest element will be at the end
            for(int j=0;j<n-i-1;j++){
                //compare the adjcent elements
                if(arr[j]>arr[j+1]){
                    //swapp the arr numbers
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;


                }
            }
            if(!swapped){
                break;
            }

        }
    }

}
