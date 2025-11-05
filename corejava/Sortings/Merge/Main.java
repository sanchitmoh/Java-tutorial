package Sortings.Merge;

public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort merge = new MergeSort();
        MergeSort.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        merge.printArray(arr);
    }
}
