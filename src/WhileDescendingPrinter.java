import java.util.Scanner; // scanner for user input

public class WhileDescendingPrinter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt(); // store in var number

        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }

}
