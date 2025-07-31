package Loops;

public class Exercise {
    public static void main(String[] args) {
            System.out.print("For Loop: ");
        for(int i = 1; i <= 5; i++) {
            // Print the number 1 to 5
            System.out.print(" "+ i );

        }
        System.out.println(); // Move to the next line after the for loop
            System.out.print("While Loop: ");

        // while loop example
        int j = 1; // Initialize counter
        while(j <= 5) {
            // Print the number 1 to 5
            System.out.print(j+" ");
            j++; // Increment counter
        }
        System.out.println(); // Move to the next line after the while loop

            System.out.print("Do-While Loop: ");
        // do-while loop example
        int k = 1; // Initialize counter
        do {
            // Print the number 1 to 5
            System.out.print(k+" ");
            k++; // Increment counter
        } while(k <= 5);
    }
}
