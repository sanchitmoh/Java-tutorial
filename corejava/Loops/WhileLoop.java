package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0; // Initialize a counter variable


        // while loop is used to execute a block of code repeatedly as long as a specified condition is true.
         while (count < 5) { // Condition to check
            System.out.println("Count is: " + count);
            // Print the current value of count

            count++; // Increment the counter variable

        }

        // Example of a while loop that continues until a condition is met
        int number = 10; // Initialize a number
        while (number > 0) { // Condition to check
            System.out.println("Number is: " + number); // Print the current value of number
            number--; // Decrement the number

        }
        // nested while loop example
        int week=7;
        int h=0; // Initialize hour counter
        while(week>0) {
            h++;
            // Outer loop for weeks
            int day = 1; // Initialize day counter
            System.out.println("Week: " + h); // Print current week number
            while (day <= 7) { // Inner loop for days of the week
                System.out.println("Day: " + day); // Print current day number
                day++; // Increment day counter
            }
            week--; // Decrement week counter
        }


    }


}
