package Operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators: used to combine multiple boolean expressions or conditions.

        boolean a = true;
        boolean b = false;

        // Using logical AND (&&)
        boolean andResult = a && b; // true if both a and b are true
        System.out.println("a && b: " + andResult);

        // Using logical OR (||)
        boolean orResult = a || b; // true if either a or b is true
        System.out.println("a || b: " + orResult);

        // Using logical NOT (!)
        boolean notA = !a; // true if a is false
        System.out.println("!a: " + notA);


        // using numeric values with logical operators
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers for logical operations:");
        // Read two integers from user input

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        // Using logical AND (&&) with numeric values
        boolean numericAndResult = (x > 0) && (y > 0); // true if both x and y are greater than 0
        System.out.println("x > 0 && y > 0: " + numericAndResult);

        // Using logical OR (||) with numeric values
        boolean numericOrResult = (x > 0) || (y > 0); // true if either x or y is greater than 0
        System.out.println("x > 0 || y > 0: " + numericOrResult);

        // Using logical NOT (!) with numeric values
        boolean notX = !(x > 0); // true if x is not greater than 0
        System.out.println("!(x > 0): " + notX);

        boolean compare =x > y && x < y; // true if x is greater than y and less than 100
        System.out.println("x > y && x < y: " + compare);

        boolean compare2 =x > y || x < y; // true if x is greater than y or less than 100
        System.out.println("x > y || x < y: " + compare2);
    }

}
