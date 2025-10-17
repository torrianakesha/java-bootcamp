import java.util.Scanner; // scanner for user input

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: "); // ask for first input
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: "); // ask for first input
        double num2 = sc.nextDouble();

        // Perform operations using double arithmetic
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulo = num1 % num2;

        // Print results
        System.out.println("Results: ");
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);
        System.out.printf("Quotient: %.2f%n", quotient);
        System.out.printf("Remainder: %.2f%n", modulo);

    }
}
