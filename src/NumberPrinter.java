import java.util.Scanner; // Importing Scanner for user input

public class NumberPrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); //store the input in var number

        // Use a for loop to print all numbers from 1 to the input number (inclusive)
        // Reminder: use for loop if the number of iterations is known. Iterations here is = 5
        System.out.println("\nNumbers: ");
        for (int counter = 1; counter <= number; counter++) {
            System.out.print(counter + " \n");
        }
    }
}

