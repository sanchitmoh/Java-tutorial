package ControlStatement;

public class ControlStatement {
    // Control statements are used to control the flow of execution in a program.
    // They allow you to make decisions, repeat actions, and control the flow of execution based on certain conditions.
    // simple if statement
    public static void main(String[] args) {
        int num=10;
        if(num > 0) {
            // if the condition is true, this block will execute
            System.out.println("the number is  not negative");
        }

        // if-else statement
        int num2 = -5;
        if(num2 < 0) {
            // if the condition is true, this block will execute
            System.out.println("the number is negative");
        } else {
            // if the condition is false, this block will execute
            System.out.println("the number is not negative");
        }
        // if-else if-else statement
        int num3 = 0;

        if(num3 > 0) {
            // if the condition is true, this block will execute
            System.out.println("the number is positive");
        } else if(num3 < 0) {
            // if the first condition is false, this block will execute
            System.out.println("the number is negative");
        } else {
            // if both conditions are false, this block will execute
            System.out.println("the number is zero");
        }


    }
}
