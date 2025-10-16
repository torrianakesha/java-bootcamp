import java.util.Scanner; //importing scanner

public class UserIntroduction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Let's get to know each other. ");

        // Accept name, age, and favorite hobby in
        System.out.print("What is your name? ");
        String name = input.nextLine(); // Store in variable name

        System.out.print("How old are you? ");
        String age = input.nextLine(); // Store in variable age

        System.out.print("What is your favorite hobby? ");
        String hobby = input.nextLine(); // Store in variable hobby

        // Print all the values
        System.out.print("Nice to meet you, " + name + "!");
        System.out.print("\nYou are " + age + " years old and love " + hobby);
    }

}
