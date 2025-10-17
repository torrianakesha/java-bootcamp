import java.util.Scanner; // Importing Scanner for user input

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to input a temperature in Fahrenheit
        System.out.println("Fahrenheit to Celsius Converter");
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble(); //store in var fahrenheit

        // Convert Fahrenheit to Celsius using the formula: (Fahrenheit - 32) * 5 / 9
        double celsius = (fahrenheit - 32) * 5 / 9; //store in var celsius

        // Display the result to 2 decimal places
        System.out.printf("\nTemperature in Celsius: %.2f°C%n", celsius);

        input.close();
    }
}
