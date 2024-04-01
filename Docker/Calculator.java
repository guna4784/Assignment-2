import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        double num1, num2;
        char operator;
        
        // Input for the first number
        while (true) {
            System.out.println("Enter the first number:");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        // Input for the second number
        while (true) {
            System.out.println("Enter the second number:");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Input for the operator
        while (true) {
            System.out.println("Choose operation: +, -, *, /");
            String input = scanner.next();
            if (input.length() == 1) {
                operator = input.charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                }
            }
            System.out.println("Invalid input! Please enter a valid operator.");
        }

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
