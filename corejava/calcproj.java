import java.util.Scanner;

public class calcproj {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator Project!");
        Scanner scanner = new Scanner(System.in);
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Choose operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);

            double result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }

            System.out.println("Do you want to perform another calculation? (y/n)");
            again = scanner.next();
        }


        System.out.println("Thank you for using the calculator!");
        scanner.close();


    }
}