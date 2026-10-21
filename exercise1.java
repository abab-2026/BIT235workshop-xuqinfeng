import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();

        // Calculate the difference of two numbers
        int difference = number1 - number2;

        // Display the result
        System.out.println("The difference of two numbers is: " + difference);

        scanner.close();
    }
}
