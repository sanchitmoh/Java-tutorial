package ControlStatement;

public class ternaryOperator {
    // Ternary operator is a shorthand for if-else statement.
    // It takes three operands: a condition, a value if true, and a value if false.
    public static void main(String[] args) {
        int num = 10;
        // Using ternary operator to check if num is positive or negative
        String result = (num > 0) ? "The number is positive" : "The number is negative";
        System.out.println(result);

        // Another example with a different number
        int num2 = -5;
        String result2 = (num2 > 0) ? "The number is positive" : "The number is negative";
        System.out.println(result2);
    // using 3 operands in ternary operator
        int num3 = 0;
        String result3 = (num3 > 0) ? "The number is positive" : (num3 < 0) ? "The number is negative" : "The number is zero";
        System.out.println(result3);
    }
}
