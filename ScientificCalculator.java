import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");
        System.out.println("Available operations:");
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        System.out.println("sqrt : Square Root");
        System.out.println("^ : Power");
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            System.out.print("Enter operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double result = 0.0;

            switch (operation) {
                case "+":
                    result = addition(scanner);
                    break;
                case "-":
                    result = subtraction(scanner);
                    break;
                case "*":
                    result = multiplication(scanner);
                    break;
                case "/":
                    result = division(scanner);
                    break;
                case "sqrt":
                    result = squareRoot(scanner);
                    break;
                case "^":
                    result = power(scanner);
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static double addition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        return num1 + num2;
    }

    private static double subtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        return num1 - num2;
    }

    private static double multiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        return num1 * num2;
    }

    private static double division(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter denominator: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not-a-Number (NaN) for division by zero
        }
        return num1 / num2;
    }

    private static double squareRoot(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = Double.parseDouble(scanner.nextLine());
        if (num < 0) {
            System.out.println("Error: Cannot compute square root of a negative number!");
            return Double.NaN; // NaN for square root of negative number
        }
        return Math.sqrt(num);
    }

    private static double power(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter exponent: ");
        double exponent = Double.parseDouble(scanner.nextLine());
        return Math.pow(base, exponent);
    }
}

