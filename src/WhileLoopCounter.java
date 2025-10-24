import java.util.Scanner; // Importing Scanner for user input

public class WhileLoopCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize counter variable
        int counter = 1;

        // Use while loop to print numbers from 1 to the entered number
        while (counter <= number) {
            System.out.println(counter);
            counter++; // increment counter
        }

        input.close();
    }
}
