package Loops;

public class DoWhile {
    // Do-while loop is used to execute a block of code repeatedly as long as a specified condition is true.
    // it will execute the block of code at least once, even if the condition is false.
    public static void main(String[] args) {
        do {

            System.out.println("This will always execute at least once.");
        } while (false);
        do{// Condition is false, but the block will execute once
        int count = 0; // Initialize a counter variable

        // Example: Print numbers from 1 to 5
        System.out.println("Count is: " + count);
        count++; // Increment the counter variable

        // Example: Print even numbers from 2 to 10
        if (count % 2 == 0) {
            System.out.println("Even Number: " + count);
        }else {
            System.out.println("Odd Number: " + count);
        }

        // Example: Print numbers in reverse order from 5 to 1
        if (count > 5) {
            System.out.println("Reverse Number: " + (6 - count));
        }
        while (count < 5) { // Condition to check
            System.out.println("Count is: " + count);
            // Print the current value of count

            count++; // Increment the counter variable

        }
        } while (false); // Condition is false, but the block will execute once

    }



}

