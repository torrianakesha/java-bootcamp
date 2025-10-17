import java.util.Scanner; // Importing Scanner for user input

public class PositiveNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number; // declare variable

        // do-while loop
        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number <= 0) { // condition if input is negative integer
                System.out.println("Invalid. Please enter a positive number.");
            }

        } while (number <= 0); // repeat if the number is negative or zero

        System.out.println("Thank you! You entered: " + number);
    }
}
