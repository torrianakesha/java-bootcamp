import java.util.Scanner; // Importing Scanner for user input

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to enter the base and height of the triangle
        System.out.println("Triangle Area Calculator");
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble(); //store in var base

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble(); //store in var height

        // Use the formula: area = 0.5 * base * height
        double area = 0.5 * base * height;

        // Print the area with a label and proper formatting (2 decimal places)
        System.out.printf("\nThe area of the triangle is: %.2f square units.%n", area);

        input.close();
    }
}