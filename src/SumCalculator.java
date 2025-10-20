import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();


        // Basic Arithmetic Style (for loop)
        int sumArithmetic = 0; // declare + initialize
        StringBuilder expression1 = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            sumArithmetic += i; // add each number
            expression1.append(i); // build string expression, .append concatenates the value of i

            if (i < number) {
                expression1.append(" + "); // add plus sign in between numbers
            }
        }

        System.out.println("The sum from 1 to " + number + " is: " + sumArithmetic); // 1st Output
        System.out.println("(Basic Arithmetic) " + expression1 + " = " + sumArithmetic); // Full expression using basic

        // While Loop (Bonus)
        int counter = 1;
        int sumWhile = 0;
        StringBuilder expression2 = new StringBuilder();

        while (counter <= number) {
            sumWhile += counter;
            expression2.append(counter);

            if (counter < number) {
                expression2.append(" + "); // add plus sign in between numbers
            }
            counter++;
        }

        System.out.println("(While Loop) " + expression2 + " = " + sumWhile); // Full expression using while loop
    }
}
