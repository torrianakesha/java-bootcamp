import java.util.Scanner; // Importing Scanner for user input

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to input a score
        System.out.print("Enter your score: ");
        int score = input.nextInt();

        // Determine the letter grade using if-else if conditions
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
            input.close();
            return;
        }

        // Display the result
        System.out.println("Your grade is: " + grade);

        input.close();
    }
}
