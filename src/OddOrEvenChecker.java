import java.util.Scanner; // Importing Scanner for user input

public class OddOrEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if  (number % 2 == 0) {
            System.out.print(number + " is even");
        } else  {
            System.out.print(number + " is odd");
        }

        input.close();
    }
}
