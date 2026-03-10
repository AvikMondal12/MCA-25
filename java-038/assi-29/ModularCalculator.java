// Develop a modular calculator systemin java interface-based design principles.The application should define an interface that declares basic arithmetic operations and implement this interface through multiple concreate classes, each responsible for performing specific calculations.The program should provide a  menu-driven interaction modle that allow users to select oprations dynamically,demonstrating polymorphism through interface references.

import java.util.Scanner;

// Interface declaring arithmetic operation
interface CalculatorOperation {
    double calculate(double a, double b);
}

// Addition class
class Addition implements CalculatorOperation {
    public double calculate(double a, double b) {
        return a + b;
    }
}

// Subtraction class
class Subtraction implements CalculatorOperation {
    public double calculate(double a, double b) {
        return a - b;
    }
}

// Multiplication class
class Multiplication implements CalculatorOperation {
    public double calculate(double a, double b) {
        return a * b;
    }
}

// Division class
class Division implements CalculatorOperation {
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}

// Main class
public class ModularCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculatorOperation operation;

        while (true) {

            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    operation = new Addition();
                    break;
                case 2:
                    operation = new Subtraction();
                    break;
                case 3:
                    operation = new Multiplication();
                    break;
                case 4:
                    operation = new Division();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            // Polymorphism via interface reference
            double result = operation.calculate(num1, num2);
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}