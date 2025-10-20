import java.util.Scanner; // Importing Scanner for user input

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: "); //ask input
        int number = sc.nextInt(); // store integer input to var number
        StringBuilder expression = new StringBuilder();

        // Factorial operation where Factorial (N!) = N × (N - 1) × (N - 2) × ... × 1
        int factorial = 1; // initialize to 1 since factorial starts by multiplication
        for (int i = 1; i <= number; i++) {
            factorial *= i; // multiply factorial by i each iteration
        }

        // Print result
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
