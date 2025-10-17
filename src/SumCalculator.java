import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Basic Arithmetic Style (for loop)
        int sumArithmetic = 0;
        String expression1 = "";

        for (int i = 1; i <= number; i++) {
            sumArithmetic += i; // add each number
            expression1 += i; // build string expression

            if (i < number) {
                expression1 += " + ";
            }
        }

        System.out.println("(Basic Arithmetic) " + expression1 + " = " + sumArithmetic);

        // While Loop (Bonus)
        int counter = 1;
        int sumWhile = 0;
        String expression2 = "";

        while (counter <= number) {
            sumWhile += counter;
            expression2 += counter;

            if (counter < number) {
                expression2 += " + ";
            }
            counter++;
        }

        System.out.println("(While Loop) " + expression2 + " = " + sumWhile);
    }
}
