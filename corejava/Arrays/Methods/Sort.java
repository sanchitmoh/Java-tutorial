package Arrays.Methods;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] number={5, 2, 8, 1, 3};
        System.out.println("Original array:");

        for(int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Sorting the array using Arrays.sort() method
        Arrays.sort(number);
        System.out.println("Sorted array:");
        for(int num : number) {
            System.out.print(num + " ");
        }
    }
}
