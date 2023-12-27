import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = getUserChoice(scanner);

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double num1 = getNumberInput(scanner, "Enter the first number: ");
            double num2 = getNumberInput(scanner, "Enter the second number: ");

            switch (choice) {
                case 1:
                    displayResult(addition(num1, num2));
                    break;
                case 2:
                    displayResult(subtraction(num1, num2));
                    break;
                case 3:
                    displayResult(multiplication(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        displayResult(division(num1, num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }

        scanner.close();
    }

    /**
     * Displays the calculator menu with available operations.
     */
    private static void displayMenu() {
        System.out.println("\nCalculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    /**
     * Gets the user's choice of operation from the menu.
     *
     * @param scanner Scanner object for user input
     * @return User's choice
     */
    private static int getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (1-5): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Gets a valid number input from the user.
     *
     * @param scanner Scanner object for user input
     * @param prompt  Prompt message for the user
     * @return Valid number entered by the user
     */
    private static double getNumberInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    /**
     * Performs addition of two numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return Result of the addition
     */
    private static double addition(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Performs subtraction of two numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return Result of the subtraction
     */
    private static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Performs multiplication of two numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return Result of the multiplication
     */
    private static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Performs division of two numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return Result of the division
     */
    private static double division(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * Displays the result of the arithmetic operation.
     *
     * @param result Result to be displayed
     */
    private static void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
/**
 * Calculator Application in Java
 *
 * This program is a simple command-line calculator that can perform basic arithmetic operations.
 *
 * Features:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 * - Exit
 *
 * Usage Instructions:
 * 1. Run the program.
 * 2. Choose an operation from the menu by entering the corresponding number.
 * 3. Enter two numbers when prompted.
 * 4. View the result of the operation.
 * 5. Repeat or choose "Exit" to end the program.
 *
 * Error Handling:
 * - Division by zero is not allowed.
 * - Invalid input values are handled with appropriate prompts.
 *
 * Author: [Bhagya Rekha Lakkadasu]
 * Date: [27-12-2023]
 */




