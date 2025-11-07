package Sortings.Quick;

public class QuickSort {

    static int partition(int[] arr, int start, int end) {
        int indx = start - 1; // index of smaller element
        int pivot = arr[end]; // pivot element is the last element

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                indx++;
                // Swap arr[indx] and arr[j]
                swap(arr, indx, j);
            }
        }

        // Place the pivot element in its correct position
        swap(arr, indx + 1, end);
        return indx + 1; // Return the correct pivot index
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // Partition the array
            int pi = partition(arr, start, end);

            // Recursively sort elements before and after partition
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }
}