package Arrays.Methods;
import  java.util.Arrays;

public class fill {
    public static void main(String[] args) {

        // Filling the array with a specific value
        // Arrays.fill() methods is used to fill the array with a specific value

         String[] fruits ={"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        System.out.println("Original array:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        Arrays.fill(fruits,  "Mango"); // Filling the array with "Mango"
        // // Note: This will replace all elements in the array with "Mango"

        Arrays.sort(fruits); // Sorting the array after filling
        System.out.println("Array after filling with 'Mango' and sorting:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Filling a specific range of the array with a value
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original numbers array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        Arrays.fill(numbers, 2, 5, 0); // Filling the range from index 2 to 4 with 0
        System.out.println("Numbers array after filling range 2 to 5 with 0:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

    }
}
