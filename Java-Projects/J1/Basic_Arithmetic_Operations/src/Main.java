import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? num1 / num2 : Double.NaN;

        // Output results
        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}
