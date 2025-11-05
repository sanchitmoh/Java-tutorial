package Sortings.Insertion;

public class Main {
    public static void main(String[] args) {

        int[]arr={12,11,13,5,6};
        Insertion insertion=new Insertion();
        Insertion.sort(arr);
        insertion.printArray(arr);


       int result = LinearSearch.linear(arr,13);

       if(result == -1){
           System.out.println("\nElement not found in the array");
         }else{
              System.out.println("\nElement found at index: " + result);
       }
    }


}
