import java.util.Scanner; // Importing Scanner for user input

public class CircleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to input the radius of the circle
        System.out.println("Circle Area Calculator");
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); //store in var radius

        // Use the formula: area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result, rounded and formatted to 2 decimal places
        System.out.printf("\nThe area of the circle is: %.2f square units.%n", area);

        input.close();
    }
}
