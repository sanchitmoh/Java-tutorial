package Loops;

public class Forloop {
    public static void main(String[] args) {
        // For loop is used to iterate over a range of values or a collection of elements.
        // It consists of three parts: initialization, condition, and increment/decrement.

        // Example: Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Example: Print even numbers from 2 to 10
        for (int j = 2; j <= 10; j += 2) {
            System.out.println("Even Number: " + j);
        }

        // Example: Print numbers in reverse order from 5 to 1
        for (int k = 5; k >= 1; k--) {
            System.out.println("Reverse Number: " + k);
        }
        // Example: Nested for loop to print a multiplication table
        System.out.println("Multiplication Table:");
        for (int m = 1; m <= 50; m++) {
            for (int n = 1; n <= 50; n++) {
                System.out.print(m * n + "\t"); // Print multiplication result with tab space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
