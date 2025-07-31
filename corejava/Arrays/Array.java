package Arrays;

import java.util.Scanner;

public class Array {
    // why do we need arrays?
    public static void main(String[] args) {
        // Array is a collection of similar data types stored in contiguous memory locations.
        // It allows us to store multiple values in a single variable, instead of declaring separate variables for each value.
        // Example: Storing marks of 5 students
        int[] marks = new int[5]; // Declaration and initialization of an array of size 5
        marks[0] = 85; // Assigning value to the first element
        marks[1] = 90; // Assigning value to the second element
        marks[2] = 78; // Assigning value to the third element
        marks[3] = 88; // Assigning value to the fourth element
        marks[4] = 92; // Assigning value to the fifth element
        // Accessing elements of the array
        System.out.println("Marks of students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]); // we use marks[i] to access the ith element of the array
            // because array start index is 0, so the first element is at index 0, second at index 1, and so on.that why we use expression (i + 1) to print the student number.
        }

        // this declaration is used when we want to declare an array without initializing it immediately

        // how to declare and initialize an array in one line
        int [] scores={85, 90, 78, 88, 92}; // Declaration and initialization of an array in one line
        System.out.println("Scores of students:");
        // we can use for-each loop to iterate through the array
        for (int score : scores) {
            System.out.println(score); // Print each score in the array
        }

        // no we will take an input and store it in an array
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n= sc.nextInt(); // Taking input for the number of students
        int[] studentMark = new int[n]; // Declaration of an array of size n
        // Taking input for each student's marks
        System.out.println("Enter the marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            studentMark[i] = sc.nextInt(); // Taking input for each student's marks
        }

        for( int studentMarks: studentMark) {// Using for-each loop to iterate through the array
            System.out.println(studentMarks); // Print each student's marks


            //

        }
            System.out.println("length of the array: " + studentMark.length); // Print the length of the array
    }
}
