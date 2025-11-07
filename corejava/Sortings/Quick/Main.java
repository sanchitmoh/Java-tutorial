package Sortings.Quick;

public class Main {
    int[] arr={10, 7, 8, 9, 1, 5};

    public static void main(String[] args) {
        int[] arr={10, 7, 8, 9, 1, 5};
        int n=arr.length;

        QuickSort quick=new QuickSort();
        QuickSort.quickSort(arr,0,n-1);

        System.out.println("Sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
