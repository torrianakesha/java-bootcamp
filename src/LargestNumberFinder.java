import java.util.Scanner; // scanner for user input

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for user input
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        // Compare numbers using conditional statements
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }

        input.close();
    }
}
