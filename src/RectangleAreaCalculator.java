import java.util.Scanner; // Importing Scanner for user input

public class RectangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for the length and width of the rectangle
        System.out.println("Rectangle Area Calculator");
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble(); // Storing input in var length

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble(); // Storing input in var width

        // Compute the area using the formula: area = length * width
        double area = length * width;

        // Display the final area value with proper labels
        System.out.printf("\nThe area of the rectangle is: %.2f square units.%n", area);

        input.close();
    }
}
