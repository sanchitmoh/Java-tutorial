package Operators;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
 // Relational Operators :- relational operators are used to compare two values and return a boolean result (true or false).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers for relational operations:");
        // Read two integers from user input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Using relational operators
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
    }

}
