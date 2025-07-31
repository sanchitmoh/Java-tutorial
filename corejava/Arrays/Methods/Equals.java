package Arrays.Methods;
import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry"};
        String[] array2 = {"apple", "banana", "cherry"};
        // Note: array1 and array2 are different references, even though they contain the same elements.

        String[] array3 = {"apple", "banana", "grape"};


        // Using the equals method to compare arrays
        // Note: The equals method checks if the references are the same, not the content
        boolean areEqual1 = array1.equals(array2);
            // This will return false because they are different references
        System.out.println("Are array1 and array2 equal? " + areEqual1);
        boolean areEqual2 = array1.equals(array3);
            // This will also return false because they are different references
        System.out.println("Are array1 and array3 equal? " + areEqual2);
        // To compare the contents of arrays, we should use Arrays.equals() method

        // Using Arrays.equals to compare arrays
        // This will return true because the contents are the same
        boolean areContentsEqual = Arrays.equals(array1, array2);
        String[] cars = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla"};

        System.out.println(Arrays.equals(cars, cars2));

    }
}
