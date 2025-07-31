package Operators;

import java.util.Scanner;

public class ConditionalOperators {
    // Arithmetic Operators :- arithmetic operators are used to perform basic mathematical operations like addition, subtraction, multiplication, and division.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers for arithmetic operations:");
        // Read two integers from user input
        // Example integers

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();


        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        ++product;// Incrementing the product by 1
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        quotient--;// Decrementing the quotient by 1
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        remainder++;// Incrementing the remainder by 1
        System.out.println("Remainder: " + remainder);


    }
    // Relational Operators :- relational operators are used to compare two values and return a boolean result (true or false).
}
